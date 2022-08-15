package net.chukkthedukk.valorantmod.item.custom;

import net.chukkthedukk.valorantmod.util.ModTags;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.Tag;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.lwjgl.system.CallbackI;

import javax.annotation.Nullable;
import java.util.List;

public class TooltipItem extends Item {
    private Item ModItems;

    public TooltipItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            if(stack.isIn(ModTags.Items.AA_CLASSICS)) {
                tooltip.add(new TranslatableText("item.valorantmod.classics.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_SHORTYS)) {
                tooltip.add(new TranslatableText("item.valorantmod.shortys.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_FRENZYS)) {
                tooltip.add(new TranslatableText("item.valorantmod.frenzys.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_GHOSTS)) {
                tooltip.add(new TranslatableText("item.valorantmod.ghosts.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_SHERIFFS)) {
                tooltip.add(new TranslatableText("item.valorantmod.sheriffs.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_STINGERS)) {
                tooltip.add(new TranslatableText("item.valorantmod.stingers.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_SPECTRES)) {
                tooltip.add(new TranslatableText("item.valorantmod.spectres.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_BUCKYS)) {
                tooltip.add(new TranslatableText("item.valorantmod.buckys.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_JUDGES)) {
                tooltip.add(new TranslatableText("item.valorantmod.judges.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_BULLDOGS)) {
                tooltip.add(new TranslatableText("item.valorantmod.bulldogs.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_GUARDIANS)) {
                tooltip.add(new TranslatableText("item.valorantmod.guardians.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_PHANTOMS)) {
                tooltip.add(new TranslatableText("item.valorantmod.phantoms.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_VANDALS)) {
                tooltip.add(new TranslatableText("item.valorantmod.vandals.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_MARSHALS)) {
                tooltip.add(new TranslatableText("item.valorantmod.marshals.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_OPERATORS)) {
                tooltip.add(new TranslatableText("item.valorantmod.operators.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_ARES)) {
                tooltip.add(new TranslatableText("item.valorantmod.ares.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_ODINS)) {
                tooltip.add(new TranslatableText("item.valorantmod.odins.tooltip.shift_type"));
            }
            if(stack.isIn(ModTags.Items.AA_MELEES)) {
                tooltip.add(new TranslatableText("item.valorantmod.melees.tooltip.shift_type"));
            }

            if(stack.isIn(ModTags.Items.BB_STANDARDS)) {
                tooltip.add(new TranslatableText("item.valorantmod.standards.tooltip.shift_collection"));
            }
            if(stack.isIn(ModTags.Items.BB_ONIS)) {
                tooltip.add(new TranslatableText("item.valorantmod.onis.tooltip.shift_collection"));
            }

            if(stack.isIn(ModTags.Items.CC_DEFAULTS)) {
                tooltip.add(new TranslatableText("item.valorantmod.defaults.tooltip.shift_rarity"));
            }
            if(stack.isIn(ModTags.Items.CC_SELECTS)) {
                tooltip.add(new TranslatableText("item.valorantmod.selects.tooltip.shift_rarity"));
            }
            if(stack.isIn(ModTags.Items.CC_DELUXES)) {
                tooltip.add(new TranslatableText("item.valorantmod.deluxes.tooltip.shift_rarity"));
            }
            if(stack.isIn(ModTags.Items.CC_PREMIUMS)) {
                tooltip.add(new TranslatableText("item.valorantmod.premiums.tooltip.shift_rarity"));
            }
            if(stack.isIn(ModTags.Items.CC_ULTRAS)) {
                tooltip.add(new TranslatableText("item.valorantmod.ultras.tooltip.shift_rarity"));
            }
            if(stack.isIn(ModTags.Items.CC_EXCLUSIVES)) {
                tooltip.add(new TranslatableText("item.valorantmod.exclusives.tooltip.shift_rarity"));
            }
        }
        else {
            tooltip.add(new TranslatableText("item.valorantmod.weaponitem.tooltip"));
        }
    }
}

