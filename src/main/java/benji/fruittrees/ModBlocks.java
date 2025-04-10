package benji.fruittrees;

import benji.fruittrees.block.custom.FruitSnackCrafterBlock;
import benji.fruittrees.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block MANGO_LEAVES = register(
            "mango_leaves",
            LeavesBlock::new,
            AbstractBlock.Settings.copy(Blocks.AZALEA_LEAVES)
    );
    public static final Block POMEGRANATE_LEAVES = register(
            "pomegranate_leaves",
            LeavesBlock::new,
            AbstractBlock.Settings.copy(Blocks.AZALEA_LEAVES)
    );
    public static final Block PINEAPPLE_LEAVES = register(
            "pineapple_leaves",
            LeavesBlock::new,
            AbstractBlock.Settings.copy(Blocks.AZALEA_LEAVES)
    );

    public static final Block MANGO_SAPLING = register(
            "mango_sapling",
            (settings) -> new SaplingBlock(ModSaplingGenerators.MANGO, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
    );
    public static final Block POTTED_MANGO_SAPLING = register(
            "potted_mango_sapling",
            (settings) -> new FlowerPotBlock(MANGO_SAPLING, settings),
            Blocks.createFlowerPotSettings()
    );
    public static final Block POMEGRANATE_SAPLING = register(
            "pomegranate_sapling",
            (settings) -> new SaplingBlock(ModSaplingGenerators.POMEGRANATE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
    );
    public static final Block POTTED_POMEGRANATE_SAPLING = register(
            "potted_pomegranate_sapling",
            (settings) -> new FlowerPotBlock(POMEGRANATE_SAPLING, settings),
            Blocks.createFlowerPotSettings()
    );
    public static final Block PINEAPPLE_SAPLING = register(
            "pineapple_sapling",
            (settings) -> new SaplingBlock(ModSaplingGenerators.PINEAPPLE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
    );
    public static final Block POTTED_PINEAPPLE_SAPLING = register(
            "potted_pineapple_sapling",
            (settings) -> new FlowerPotBlock(PINEAPPLE_SAPLING, settings),
            Blocks.createFlowerPotSettings()
    );

    public static final Block FRUIT_SNACK_CRAFTER = register(
            "fruit_snack_crafter",
            FruitSnackCrafterBlock::new,
            AbstractBlock.Settings.create()
    );

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings) {
        return register(name, blockFactory, settings, true);
    }
    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }
        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FruitTrees.MOD_ID, name));
    }
    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FruitTrees.MOD_ID, name));
    }

    public static void initialize() {
        CompostingChanceRegistry.INSTANCE.add(MANGO_SAPLING, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(POMEGRANATE_SAPLING, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(PINEAPPLE_SAPLING, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MANGO_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(POMEGRANATE_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(PINEAPPLE_LEAVES, 0.3f);
    }
}
