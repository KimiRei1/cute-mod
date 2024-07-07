package com.kimirei.cutemod.blocks.entity;
import com.kimirei.cutemod.items.ModItems;
import com.kimirei.cutemod.screen.StoveScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class StoveBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, net.kaupenjoe.tutorialmod.block.entity.ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;

    public StoveBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.STOVE, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0: return StoveBlockEntity.this.progress;
                    case 1: return StoveBlockEntity.this.maxProgress;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: StoveBlockEntity.this.progress = value; break;
                    case 1: StoveBlockEntity.this.maxProgress = value; break;
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Stove");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new StoveScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("gem_infusing_station.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("gem_infusing_station.progress");
    }

    private void resetProgress() {
        this.progress = 0;
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, StoveBlockEntity entity) {
        if(world.isClient()) {
            return;
        }

        boolean hasRecipe1 = hasRecipe1(entity);
        boolean hasRecipe2 = hasRecipe2(entity);
        boolean hasRecipe3 = hasRecipe3(entity);

        if(hasRecipe1 || hasRecipe2 || hasRecipe3) {
            entity.progress++;
            markDirty(world, blockPos, state);
            if(entity.progress >= entity.maxProgress) {
                if (hasRecipe1) {
                    craftItem(entity, ModItems.STRAWBERRYCAKECOOKED);
                } else if (hasRecipe2) {
                    craftItem(entity, ModItems.ONIGIRICOOKED);
                }
                else if (hasRecipe3) {
                    craftItem(entity, ModItems.DANGOCOOKED);
                }
            }
        } else {
            entity.resetProgress();
            markDirty(world, blockPos, state);
        }
    }

    private static void craftItem(StoveBlockEntity entity, Item result) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        entity.removeStack(1, 1);
        entity.setStack(2, new ItemStack(result, entity.getStack(2).getCount() + 1));
        entity.resetProgress();
    }


    private static void craftItem(StoveBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        if(hasRecipe1(entity)) {
            entity.removeStack(1, 1);

            entity.setStack(2, new ItemStack(ModItems.STRAWBERRYCAKECOOKED,
                    entity.getStack(2).getCount() + 1));

            entity.resetProgress();
        }

        if(hasRecipe2(entity)) {
            entity.removeStack(1, 1);

            entity.setStack(2, new ItemStack(ModItems.ONIGIRICOOKED,
                    entity.getStack(2).getCount() + 1));

            entity.resetProgress();
        }

        if(hasRecipe3(entity)) {
            entity.removeStack(1, 1);

            entity.setStack(2, new ItemStack(ModItems.DANGOCOOKED,
                    entity.getStack(2).getCount() + 1));

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe1(StoveBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        boolean hasRawGemInFirstSlot = entity.getStack(1).getItem() == ModItems.STRAWBERRYCAKE;


        return hasRawGemInFirstSlot && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, ModItems.STRAWBERRYCAKECOOKED);


    }

    private static boolean hasRecipe2(StoveBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        boolean hasRawGemInFirstSlot = entity.getStack(1).getItem() == ModItems.ONIGIRI;


        return hasRawGemInFirstSlot && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, ModItems.ONIGIRICOOKED);


    }

    private static boolean hasRecipe3(StoveBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        boolean hasRawGemInFirstSlot = entity.getStack(1).getItem() == ModItems.DANGO;


        return hasRawGemInFirstSlot && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, ModItems.DANGOCOOKED);


    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(2).getItem() == output || inventory.getStack(2).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(2).getMaxCount() > inventory.getStack(2).getCount();
    }
}