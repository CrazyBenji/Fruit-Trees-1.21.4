package benji.fruittrees.world;

import benji.fruittrees.FruitTrees;
import benji.fruittrees.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> MANGO_PLACED_KEY = registerKey("mango_placed");
    public static final RegistryKey<PlacedFeature> POMEGRANATE_PLACED_KEY = registerKey("pomegranate_placed");
    public static final RegistryKey<PlacedFeature> PINEAPPLE_PLACED_KEY = registerKey("pineapple_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, MANGO_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MANGO_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.1f, 1), ModBlocks.MANGO_SAPLING
                ));
        register(context, POMEGRANATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POMEGRANATE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.1f, 1), ModBlocks.POMEGRANATE_SAPLING
                ));
        register(context, PINEAPPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINEAPPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.1f, 1), ModBlocks.PINEAPPLE_SAPLING
                ));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(FruitTrees.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
