package benji.fruittrees.world.tree;

import benji.fruittrees.FruitTrees;
import benji.fruittrees.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator MANGO = new SaplingGenerator(FruitTrees.MOD_ID + ":mango",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MANGO_KEY), Optional.empty());
    public static final SaplingGenerator POMEGRANATE = new SaplingGenerator(FruitTrees.MOD_ID + ":pomegranate",
            Optional.empty(), Optional.of(ModConfiguredFeatures.POMEGRANATE_KEY), Optional.empty());
    public static final SaplingGenerator PINEAPPLE = new SaplingGenerator(FruitTrees.MOD_ID + ":pomegranate",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PINEAPPLE_KEY), Optional.empty());
}
