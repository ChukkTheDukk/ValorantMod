package net.chukkthedukk.valorantmod.item;

import net.chukkthedukk.valorantmod.ValorantMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CLASSIC_STANDARD = registerItem("classic_standard",
        new Item(new FabricItemSettings().group(ModItemGroup.CLASSIC).maxCount(1)));
    public static final Item SHORTY_STANDARD = registerItem("shorty_standard",
            new Item(new FabricItemSettings().group(ModItemGroup.SHORTY).maxCount(1)));
    public static final Item FRENZY_STANDARD = registerItem("frenzy_standard",
            new Item(new FabricItemSettings().group(ModItemGroup.FRENZY).maxCount(1)));
    public static final Item GHOST_STANDARD = registerItem("ghost_standard",
            new Item(new FabricItemSettings().group(ModItemGroup.GHOST).maxCount(1)));
    public static final Item SHERIFF_STANDARD = registerItem("sheriff_standard",
            new Item(new FabricItemSettings().group(ModItemGroup.SHERIFF).maxCount(1)));
    public static final Item STINGER_STANDARD = registerItem("stinger_standard",
            new Item(new FabricItemSettings().group(ModItemGroup.STINGER).maxCount(1)));
    public static final Item SPECTRE_STANDARD = registerItem("spectre_standard",
            new Item(new FabricItemSettings().group(ModItemGroup.SPECTRE).maxCount(1)));
    public static final Item BUCKY_STANDARD = registerItem("bucky_standard",
            new Item(new FabricItemSettings().group(ModItemGroup.BUCKY).maxCount(1)));
    public static final Item JUDGE_STANDARD = registerItem("judge_standard",
            new Item(new FabricItemSettings().group(ModItemGroup.JUDGE).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ValorantMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ValorantMod.LOGGER.info("Registering Mod Items for " + ValorantMod.MOD_ID);
    }

}
