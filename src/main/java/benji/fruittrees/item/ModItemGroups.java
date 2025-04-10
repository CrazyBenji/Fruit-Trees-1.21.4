package benji.fruittrees.item;

import benji.fruittrees.FruitTrees;
import benji.fruittrees.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // Fruit Trees Item Group
    public static final RegistryKey<ItemGroup> FRUIT_TREES_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(FruitTrees.MOD_ID, "fruit_trees_item_group"));
    public static final ItemGroup FRUIT_TREES_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.MANGO_INGOT))
            .displayName(Text.translatable("fruitTreesItemGroup.fruittrees"))
            .build();
}
