package net.chukkthedukk.valorantmod.util;

import net.chukkthedukk.valorantmod.ValorantMod;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        private static Tag.Identified<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(ValorantMod.MOD_ID, name));
        }

        private static Tag.Identified<Block> createCommonTag(String name) {
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }
    }

    public static class Items {
        public static final Tag.Identified<Item> AA_CLASSICS = createTag("aa_classics");
        public static final Tag.Identified<Item> AA_SHORTYS = createTag("aa_shortys");
        public static final Tag.Identified<Item> AA_FRENZYS = createTag("aa_frenzys");
        public static final Tag.Identified<Item> AA_GHOSTS = createTag("aa_ghosts");
        public static final Tag.Identified<Item> AA_SHERIFFS = createTag("aa_sheriffs");
        public static final Tag.Identified<Item> AA_STINGERS = createTag("aa_stingers");
        public static final Tag.Identified<Item> AA_SPECTRES = createTag("aa_spectres");
        public static final Tag.Identified<Item> AA_BUCKYS = createTag("aa_buckys");
        public static final Tag.Identified<Item> AA_JUDGES = createTag("aa_judges");
        public static final Tag.Identified<Item> AA_BULLDOGS = createTag("aa_bulldogs");
        public static final Tag.Identified<Item> AA_GUARDIANS = createTag("aa_guardians");
        public static final Tag.Identified<Item> AA_PHANTOMS = createTag("aa_phantoms");
        public static final Tag.Identified<Item> AA_VANDALS = createTag("aa_vandals");
        public static final Tag.Identified<Item> AA_MARSHALS = createTag("aa_marshals");
        public static final Tag.Identified<Item> AA_OPERATORS = createTag("aa_operators");
        public static final Tag.Identified<Item> AA_ARES = createTag("aa_ares");
        public static final Tag.Identified<Item> AA_ODINS = createTag("aa_odins");
        public static final Tag.Identified<Item> AA_MELEES = createTag("aa_melees");

        public static final Tag.Identified<Item> BB_STANDARDS = createTag("bb_standards");
        public static final Tag.Identified<Item> BB_ONIS = createTag("bb_onis");

        public static final Tag.Identified<Item> CC_DEFAULTS = createTag("cc_defaults");
        public static final Tag.Identified<Item> CC_SELECTS = createTag("cc_selects");
        public static final Tag.Identified<Item> CC_DELUXES = createTag("cc_deluxes");
        public static final Tag.Identified<Item> CC_PREMIUMS = createTag("cc_premiums");
        public static final Tag.Identified<Item> CC_ULTRAS = createTag("cc_ultras");
        public static final Tag.Identified<Item> CC_EXCLUSIVES = createTag("cc_exclusives");

        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(ValorantMod.MOD_ID, name));
        }

        private static Tag.Identified<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }
    }
}
