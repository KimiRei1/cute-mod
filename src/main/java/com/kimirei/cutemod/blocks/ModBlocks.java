package com.kimirei.cutemod.blocks;
import com.kimirei.cutemod.CuteMode;
import com.kimirei.cutemod.blocks.custom.StoveBlock;
import com.kimirei.cutemod.itemgroups.ModItemGroups;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SaplingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.kimirei.cutemod.foodcomponents.FoodComponents.CANDYBLOCKCOMPONENT;




public class ModBlocks {
    public static final Block CAKEPLANKS = new Block(FabricBlockSettings.of(Material.WOOD).strength(1f, 6f));
    public static final Block SWEETORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1f, 6f).requiresTool());
    public static final Block CAKELOG = new Block(FabricBlockSettings.of(Material.WOOD).strength(1f, 6f));
    public static final CustomPlant CAKELOGLEAVES = new CustomPlant(FabricBlockSettings.of(Material.LEAVES).strength(1f, 6f).requiresTool().collidable(false));
    public static final Block STOVE = new StoveBlock(FabricBlockSettings.of(Material.STONE).strength(1f, 6f).requiresTool());
    public static final CustomPlant RICEPLANT= new CustomPlant(FabricBlockSettings.of(Material.PLANT).strength(1f, 6f).collidable(false));
    public static final CustomPlant STRAWBERRYPLANT= new CustomPlant(FabricBlockSettings.of(Material.PLANT).strength(1f, 6f).collidable(false));




    public static void registeredModBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier(CuteMode.ModID, "cakeplanks"), CAKEPLANKS);
        Registry.register(Registry.ITEM, new Identifier(CuteMode.ModID, "cakeplanks"),
                new BlockItem(CAKEPLANKS,
                        new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYBLOCKCOMPONENT)));

        Registry.register(Registry.BLOCK, new Identifier(CuteMode.ModID, "sweetore"), SWEETORE);
        Registry.register(Registry.ITEM, new Identifier(CuteMode.ModID, "sweetore"),
                new BlockItem(SWEETORE,
                        new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYBLOCKCOMPONENT)));


        Registry.register(Registry.BLOCK, new Identifier(CuteMode.ModID, "cakelog"), CAKELOG);
        Registry.register(Registry.ITEM, new Identifier(CuteMode.ModID, "cakelog"),
                new BlockItem(CAKELOG,
                        new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYBLOCKCOMPONENT)));

        Registry.register(Registry.BLOCK, new Identifier(CuteMode.ModID, "cakelogleaves"), CAKELOGLEAVES);
        Registry.register(Registry.ITEM, new Identifier(CuteMode.ModID, "cakelogleaves"),
                new BlockItem(CAKELOGLEAVES,
                        new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYBLOCKCOMPONENT)));

        Registry.register(Registry.BLOCK, new Identifier(CuteMode.ModID, "stove"), STOVE);
        Registry.register(Registry.ITEM, new Identifier(CuteMode.ModID, "stove"),
                new BlockItem(STOVE,
                        new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYBLOCKCOMPONENT)));

        Registry.register(Registry.BLOCK, new Identifier(CuteMode.ModID, "riceplant"), RICEPLANT);
        Registry.register(Registry.ITEM, new Identifier(CuteMode.ModID, "riceplant"),
                new BlockItem(RICEPLANT,
                        new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYBLOCKCOMPONENT)));


        Registry.register(Registry.BLOCK, new Identifier(CuteMode.ModID, "strawberryplant"), STRAWBERRYPLANT);
        Registry.register(Registry.ITEM, new Identifier(CuteMode.ModID, "strawberryplant"),
                new BlockItem(STRAWBERRYPLANT,
                        new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYBLOCKCOMPONENT)));
    }
}
