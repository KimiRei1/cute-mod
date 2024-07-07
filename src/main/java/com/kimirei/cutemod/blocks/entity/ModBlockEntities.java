package com.kimirei.cutemod.blocks.entity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import com.kimirei.cutemod.CuteMode;
import com.kimirei.cutemod.blocks.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<StoveBlockEntity> STOVE;

    public static void registerBlockEntities() {
        STOVE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(CuteMode.ModID, "gem_infusing_station"),
                FabricBlockEntityTypeBuilder.create(StoveBlockEntity::new,
                        ModBlocks.STOVE).build(null));
    }
}