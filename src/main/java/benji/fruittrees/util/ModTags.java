package benji.fruittrees.util;

import benji.fruittrees.FruitTrees;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(FruitTrees.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> FRUITS = createTag("fruits");

        public static final TagKey<Item> REPAIRS_MANGO_ARMOR = createTag("repairs_mango_armor");
        public static final TagKey<Item> REPAIRS_POMEGRANATE_ARMOR = createTag("repairs_pomegranate_armor");
        public static final TagKey<Item> REPAIRS_PINEAPPLE_ARMOR = createTag("repairs_pineapple_armor");

        public static final TagKey<Item> MANGO_TOOL_MATERIALS = createTag("mango_tool_materials");
        public static final TagKey<Item> POMEGRANATE_TOOL_MATERIALS = createTag("pomegranate_tool_materials");
        public static final TagKey<Item> PINEAPPLE_TOOL_MATERIALS = createTag("pineapple_tool_materials");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(FruitTrees.MOD_ID, name));
        }
    }

}
