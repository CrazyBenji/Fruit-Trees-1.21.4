package benji.fruittrees.datagen;

import benji.fruittrees.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class FruitTreesLootTableProvider extends FabricBlockLootTableProvider {
    protected FruitTreesLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MANGO_SAPLING);
        addDrop(ModBlocks.POMEGRANATE_SAPLING);
        addDrop(ModBlocks.PINEAPPLE_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_MANGO_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_POMEGRANATE_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_PINEAPPLE_SAPLING);

        addDrop(ModBlocks.FRUIT_SNACK_CRAFTER);
    }
}
