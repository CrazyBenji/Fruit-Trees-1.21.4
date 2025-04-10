package benji.fruittrees.datagen;

import benji.fruittrees.ModItems;
import benji.fruittrees.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class FruitTreesItemTagProvider extends FabricTagProvider<Item> {


    public FruitTreesItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        getOrCreateTagBuilder(ModTags.Items.FRUITS)
                .add(ModItems.MANGO)
                .add(ModItems.POMEGRANATE)
                .add(ModItems.PINEAPPLE)
                .add(Items.APPLE)
                .add(Items.MELON_SLICE)
                .add(Items.SWEET_BERRIES)
                .add(Items.GLOW_BERRIES)
                .setReplace(true);

        getOrCreateTagBuilder(ModTags.Items.REPAIRS_MANGO_ARMOR)
                .add(ModItems.MANGO_INGOT)
                .setReplace(true);
        getOrCreateTagBuilder(ModTags.Items.REPAIRS_POMEGRANATE_ARMOR)
                .add(ModItems.ROTTEN_POMEGRANATE)
                .setReplace(true);
        getOrCreateTagBuilder(ModTags.Items.REPAIRS_PINEAPPLE_ARMOR)
                .add(ModItems.SLICED_PINEAPPLE)
                .setReplace(true);

        getOrCreateTagBuilder(ModTags.Items.MANGO_TOOL_MATERIALS)
                .add(ModItems.MANGO_INGOT)
                .setReplace(true);
        getOrCreateTagBuilder(ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                .add(ModItems.ROTTEN_POMEGRANATE)
                .setReplace(true);
        getOrCreateTagBuilder(ModTags.Items.PINEAPPLE_TOOL_MATERIALS)
                .add(ModItems.SLICED_PINEAPPLE)
                .setReplace(true);
    }
}
