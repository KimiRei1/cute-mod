package com.kimirei.cutemod.items;

import com.kimirei.cutemod.itemgroups.ModItemGroups;
import com.kimirei.cutemod.materials.CuteModToolMaterial;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.kimirei.cutemod.CuteMode.ModID;
import static com.kimirei.cutemod.foodcomponents.FoodComponents.*;

public class ModItems
{
    //------------------------------------------
    ///TOOLS
    public static final PickaxeItem CANDYPICKAXE = new PickaxeItem (CuteModToolMaterial.MATERIAL, 1, 1, new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYTOOLCOMPONENT));
    public static final AxeItem CANDYAXE = new AxeItem(CuteModToolMaterial.MATERIAL, 2, 2, new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYTOOLCOMPONENT));
    public static final CustomHoe CANDYHOE = new CustomHoe(CuteModToolMaterial.MATERIAL, 1, 1, new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYTOOLCOMPONENT));
    public static final ShovelItem CANDYSHOVEL = new ShovelItem(CuteModToolMaterial.MATERIAL, 1, 1, new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYTOOLCOMPONENT));
    public static final SwordItem CANDYSWORD= new SwordItem(CuteModToolMaterial.MATERIAL, 3, 3, new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(CANDYTOOLCOMPONENT));
    //------------------------------------------


    //------------------------------------------
    //MATERIALS
    public static final Item NEKOPAW = new Item (new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(INGREDIENTCOMPONENT));
    public static final Item CAKESTICK = new Item (new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(INGREDIENTCOMPONENT));
    //------------------------------------------



    //------------------------------------------
    //FOOD
    public static final Item ONIGIRI = new Item(new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(ONIGIRICOMPONENT));
    public static final Item STRAWBERRYCAKE = new Item(new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(STRAWBERRYCAKECOMPONENT));
    public static final Item STRAWBERRY = new Item(new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(INGREDIENTCOMPONENT));
    public static final Item RICE = new Item(new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(INGREDIENTCOMPONENT));
    public static final Item RICEFLOUR = new Item(new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(INGREDIENTCOMPONENT));
    public static final Item STRAWBERRYCAKECOOKED = new Item(new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(STRAWBERRYCAKECOOKEDCOMPONENT));
    public static final Item ONIGIRICOOKED = new Item(new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(ONIGIRICOOKEDCOMPONENT));
    public static final Item DANGOCOOKED = new Item(new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(DANGOCOOKEDCOMPONENT));
    public static final Item DANGO = new Item(new Item.Settings().group(ModItemGroups.CUTEMOD_GROUP).food(DANGOCOMPONENT));

    //------------------------------------------




    public static void RegisterModItems() {
        Registry.register(Registry.ITEM, new Identifier(ModID, "candypickaxe"), CANDYPICKAXE);
        Registry.register(Registry.ITEM, new Identifier(ModID, "candyaxe"), CANDYAXE);
        Registry.register(Registry.ITEM, new Identifier(ModID, "candysword"), CANDYSWORD);
        Registry.register(Registry.ITEM, new Identifier(ModID, "candyshovel"), CANDYSHOVEL);
        Registry.register(Registry.ITEM, new Identifier(ModID, "candyhoe"), CANDYHOE);
        Registry.register(Registry.ITEM, new Identifier(ModID, "nekopaw"), NEKOPAW);
        Registry.register(Registry.ITEM, new Identifier(ModID, "cakestick"), CAKESTICK);
        Registry.register(Registry.ITEM, new Identifier(ModID, "onigiri"), ONIGIRI);
        Registry.register(Registry.ITEM, new Identifier(ModID, "strawberrycake"), STRAWBERRYCAKE);
        Registry.register(Registry.ITEM, new Identifier(ModID, "strawberry"), STRAWBERRY);
        Registry.register(Registry.ITEM, new Identifier(ModID, "rice"), RICE);
        Registry.register(Registry.ITEM, new Identifier(ModID, "riceflour"), RICEFLOUR);
        Registry.register(Registry.ITEM, new Identifier(ModID, "strawberrycakecooked"), STRAWBERRYCAKECOOKED);
        Registry.register(Registry.ITEM, new Identifier(ModID, "onigiricooked"), ONIGIRICOOKED);
        Registry.register(Registry.ITEM, new Identifier(ModID, "dango"), DANGO);
        Registry.register(Registry.ITEM, new Identifier(ModID, "dangocooked"), DANGOCOOKED);
    }
}

