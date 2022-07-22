package net.chukkthedukk.valorantmod.item;

import net.chukkthedukk.valorantmod.ValorantMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup CLASSIC = FabricItemGroupBuilder.build(new Identifier(ValorantMod.MOD_ID, "classic"),
            () -> new ItemStack(ModItems.CLASSIC_STANDARD));
    public static final ItemGroup SHORTY = FabricItemGroupBuilder.build(new Identifier(ValorantMod.MOD_ID, "shorty"),
            () -> new ItemStack(ModItems.SHORTY_STANDARD));
    public static final ItemGroup FRENZY = FabricItemGroupBuilder.build(new Identifier(ValorantMod.MOD_ID, "frenzy"),
            () -> new ItemStack(ModItems.FRENZY_STANDARD));
    public static final ItemGroup GHOST = FabricItemGroupBuilder.build(new Identifier(ValorantMod.MOD_ID, "ghost"),
            () -> new ItemStack(ModItems.GHOST_STANDARD));

}
