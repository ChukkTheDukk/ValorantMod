package net.chukkthedukk.valorantmod.item;

import net.chukkthedukk.valorantmod.ValorantMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CLASSIC_STANDARD = registerItem("classic_standard",
        new Item(new FabricItemSettings().group(ModItemGroup.CLASSIC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ValorantMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ValorantMod.LOGGER.info("Registering Mod Items for " + ValorantMod.MOD_ID);
    }

}
