package net.chukkthedukk.valorantmod.item;

import net.chukkthedukk.valorantmod.ValorantMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup CLASSIC = FabricItemGroupBuilder.build(new Identifier(ValorantMod.MOD_ID, "classic"),
            () -> new ItemStack(ModItems.CLASSIC_STANDARD));

}
