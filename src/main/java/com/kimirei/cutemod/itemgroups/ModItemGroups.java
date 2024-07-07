package com.kimirei.cutemod.itemgroups;
import com.kimirei.cutemod.CuteMode;
import com.kimirei.cutemod.items.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CUTEMOD_GROUP = FabricItemGroupBuilder.build(
            new Identifier(CuteMode.ModID, "cutemod_group"),
            () -> new ItemStack(ModItems.NEKOPAW)
    );
    public static void RegisteredModItemGroups()
    {
        CuteMode.LOGGER.info("ModItemGroups registered for " + CuteMode.ModID);
    }
}
