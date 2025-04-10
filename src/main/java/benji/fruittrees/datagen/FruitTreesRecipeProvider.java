package benji.fruittrees.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import benji.fruittrees.ModItems;
import benji.fruittrees.util.ModTags;
import net.minecraft.block.SuspiciousStewIngredient;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

public class FruitTreesRecipeProvider extends FabricRecipeProvider {
    public FruitTreesRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);

                // Mango Ingot
                offerBlasting(
                        List.of(ModItems.COOKED_MANGO),
                        RecipeCategory.MISC,
                        ModItems.MANGO_INGOT,
                        0.1f,
                        5 * ModItems.TICKS_PER_SECOND,
                        "mango_ingot"
                );

                // Mango Sword
                createShaped(RecipeCategory.COMBAT, ModItems.MANGO_SWORD, 1)
                        .pattern("m")
                        .pattern("m")
                        .pattern("s")
                        .input('m', ModTags.Items.MANGO_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                        .offerTo(exporter);
                // Mango Axe
                createShaped(RecipeCategory.TOOLS, ModItems.MANGO_AXE, 1)
                        .pattern("mm")
                        .pattern("ms")
                        .pattern(" s")
                        .input('m', ModTags.Items.MANGO_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                        .offerTo(exporter);
                // Mango Pickaxe
                createShaped(RecipeCategory.TOOLS, ModItems.MANGO_PICKAXE, 1)
                        .pattern("mmm")
                        .pattern(" s ")
                        .pattern(" s ")
                        .input('m', ModTags.Items.MANGO_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                        .offerTo(exporter);
                // Mango Shovel
                createShaped(RecipeCategory.TOOLS, ModItems.MANGO_SHOVEL, 1)
                        .pattern("m")
                        .pattern("s")
                        .pattern("s")
                        .input('m', ModTags.Items.MANGO_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                        .offerTo(exporter);
                // Mango Hoe
                createShaped(RecipeCategory.TOOLS, ModItems.MANGO_HOE, 1)
                        .pattern("mm")
                        .pattern(" s")
                        .pattern(" s")
                        .input('m', ModTags.Items.MANGO_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                        .offerTo(exporter);
                // Mango Helmet
                createShaped(RecipeCategory.COMBAT, ModItems.MANGO_HELMET, 1)
                        .pattern("mmm")
                        .pattern("mam")
                        .input('m', ModTags.Items.MANGO_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                        .offerTo(exporter);
                // Mango Chestplate
                createShaped(RecipeCategory.COMBAT, ModItems.MANGO_CHESTPLATE, 1)
                        .pattern("mam")
                        .pattern("mmm")
                        .pattern("mmm")
                        .input('m', ModTags.Items.MANGO_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                        .offerTo(exporter);
                // Mango Leggings
                createShaped(RecipeCategory.COMBAT, ModItems.MANGO_LEGGINGS, 1)
                        .pattern("mmm")
                        .pattern("mam")
                        .pattern("m m")
                        .input('m', ModTags.Items.MANGO_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                        .offerTo(exporter);
                // Mango Boots
                createShaped(RecipeCategory.COMBAT, ModItems.MANGO_BOOTS, 1)
                        .pattern("mam")
                        .pattern("m m")
                        .input('m', ModTags.Items.MANGO_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                        .offerTo(exporter);

                // Partially Rotten Pomegranate
                createShaped(RecipeCategory.FOOD, ModItems.PARTIALLY_ROTTEN_POMEGRANATE, 1)
                        .pattern("bbb")
                        .pattern("bpb")
                        .pattern("bbb")
                        .input('p', ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                        .input('b', Items.BONE_MEAL)
                        .criterion(hasItem(ModItems.POMEGRANATE), conditionsFromItem(ModItems.POMEGRANATE))
                        .offerTo(exporter);
                // Rotten Pomegranate
                createShaped(RecipeCategory.FOOD, ModItems.ROTTEN_POMEGRANATE, 1)
                        .pattern("bbb")
                        .pattern("bpb")
                        .pattern("bbb")
                        .input('p', ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                        .input('b', Items.BONE_MEAL)
                        .criterion(hasItem(ModItems.PARTIALLY_ROTTEN_POMEGRANATE), conditionsFromItem(ModItems.PARTIALLY_ROTTEN_POMEGRANATE))
                        .offerTo(exporter);
                // Pomegranate Sword
                createShaped(RecipeCategory.TOOLS, ModItems.POMEGRANATE_SWORD, 1)
                        .pattern("p")
                        .pattern("p")
                        .pattern("s")
                        .input('p', ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.ROTTEN_POMEGRANATE), conditionsFromItem(ModItems.ROTTEN_POMEGRANATE))
                        .offerTo(exporter);
                // Pomegranate Axe
                createShaped(RecipeCategory.TOOLS, ModItems.POMEGRANATE_AXE, 1)
                        .pattern("pp")
                        .pattern("ps")
                        .pattern(" s")
                        .input('p', ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.ROTTEN_POMEGRANATE), conditionsFromItem(ModItems.ROTTEN_POMEGRANATE))
                        .offerTo(exporter);
                // Pomegranate Pickaxe
                createShaped(RecipeCategory.TOOLS, ModItems.POMEGRANATE_PICKAXE, 1)
                        .pattern("ppp")
                        .pattern(" s ")
                        .pattern(" s ")
                        .input('p', ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.ROTTEN_POMEGRANATE), conditionsFromItem(ModItems.ROTTEN_POMEGRANATE))
                        .offerTo(exporter);
                // Pomegranate Shovel
                createShaped(RecipeCategory.TOOLS, ModItems.POMEGRANATE_SHOVEL, 1)
                        .pattern("p")
                        .pattern("s")
                        .pattern("s")
                        .input('p', ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.ROTTEN_POMEGRANATE), conditionsFromItem(ModItems.ROTTEN_POMEGRANATE))
                        .offerTo(exporter);
                // Pomegranate Hoe
                createShaped(RecipeCategory.TOOLS, ModItems.POMEGRANATE_HOE, 1)
                        .pattern("pp")
                        .pattern(" s")
                        .pattern(" s")
                        .input('p', ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.ROTTEN_POMEGRANATE), conditionsFromItem(ModItems.ROTTEN_POMEGRANATE))
                        .offerTo(exporter);
                // Pomegranate Helmet
                createShaped(RecipeCategory.COMBAT, ModItems.POMEGRANATE_HELMET, 1)
                        .pattern("mmm")
                        .pattern("mam")
                        .input('m', ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.ROTTEN_POMEGRANATE), conditionsFromItem(ModItems.ROTTEN_POMEGRANATE))
                        .offerTo(exporter);
                // Pomegranate Chestplate
                createShaped(RecipeCategory.COMBAT, ModItems.POMEGRANATE_CHESTPLATE, 1)
                        .pattern("mam")
                        .pattern("mmm")
                        .pattern("mmm")
                        .input('m', ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.ROTTEN_POMEGRANATE), conditionsFromItem(ModItems.ROTTEN_POMEGRANATE))
                        .offerTo(exporter);
                // Pomegranate Leggings
                createShaped(RecipeCategory.COMBAT, ModItems.POMEGRANATE_LEGGINGS, 1)
                        .pattern("mmm")
                        .pattern("mam")
                        .pattern("m m")
                        .input('m', ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.ROTTEN_POMEGRANATE), conditionsFromItem(ModItems.ROTTEN_POMEGRANATE))
                        .offerTo(exporter);
                // Pomegranate Boots
                createShaped(RecipeCategory.COMBAT, ModItems.POMEGRANATE_BOOTS, 1)
                        .pattern("mam")
                        .pattern("m m")
                        .input('m', ModTags.Items.POMEGRANATE_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.ROTTEN_POMEGRANATE), conditionsFromItem(ModItems.ROTTEN_POMEGRANATE))
                        .offerTo(exporter);

                // Sliced Pineapple
                createShapeless(RecipeCategory.FOOD, ModItems.SLICED_PINEAPPLE, 1)
                        .input(ModItems.PINEAPPLE)
                        .input(ModItems.MANGROVE_KNIFE)
                        .criterion(hasItem(ModItems.PINEAPPLE), conditionsFromItem(ModItems.PINEAPPLE))
                        .offerTo(exporter);
                // Pineapple Sword
                createShaped(RecipeCategory.TOOLS, ModItems.PINEAPPLE_SWORD, 1)
                        .pattern("p")
                        .pattern("p")
                        .pattern("s")
                        .input('p', ModTags.Items.PINEAPPLE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.SLICED_PINEAPPLE), conditionsFromItem(ModItems.SLICED_PINEAPPLE))
                        .offerTo(exporter);
                // Pineapple Axe
                createShaped(RecipeCategory.TOOLS, ModItems.PINEAPPLE_AXE, 1)
                        .pattern("pp")
                        .pattern("ps")
                        .pattern(" s")
                        .input('p', ModTags.Items.PINEAPPLE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.SLICED_PINEAPPLE), conditionsFromItem(ModItems.SLICED_PINEAPPLE))
                        .offerTo(exporter);
                // Pineapple Pickaxe
                createShaped(RecipeCategory.TOOLS, ModItems.PINEAPPLE_PICKAXE, 1)
                        .pattern("ppp")
                        .pattern(" s ")
                        .pattern(" s ")
                        .input('p', ModTags.Items.PINEAPPLE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.SLICED_PINEAPPLE), conditionsFromItem(ModItems.SLICED_PINEAPPLE))
                        .offerTo(exporter);
                // Pineapple Shovel
                createShaped(RecipeCategory.TOOLS, ModItems.PINEAPPLE_SHOVEL, 1)
                        .pattern("p")
                        .pattern("s")
                        .pattern("s")
                        .input('p', ModTags.Items.PINEAPPLE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.SLICED_PINEAPPLE), conditionsFromItem(ModItems.SLICED_PINEAPPLE))
                        .offerTo(exporter);
                // Pineapple Hoe
                createShaped(RecipeCategory.TOOLS, ModItems.PINEAPPLE_HOE, 1)
                        .pattern("pp")
                        .pattern(" s")
                        .pattern(" s")
                        .input('p', ModTags.Items.PINEAPPLE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion(hasItem(ModItems.SLICED_PINEAPPLE), conditionsFromItem(ModItems.SLICED_PINEAPPLE))
                        .offerTo(exporter);
                // Pineapple Helmet
                createShaped(RecipeCategory.COMBAT, ModItems.PINEAPPLE_HELMET, 1)
                        .pattern("mmm")
                        .pattern("mam")
                        .input('m', ModTags.Items.PINEAPPLE_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.SLICED_PINEAPPLE), conditionsFromItem(ModItems.SLICED_PINEAPPLE))
                        .offerTo(exporter);
                // Pineapple Chestplate
                createShaped(RecipeCategory.COMBAT, ModItems.PINEAPPLE_CHESTPLATE, 1)
                        .pattern("mam")
                        .pattern("mmm")
                        .pattern("mmm")
                        .input('m', ModTags.Items.PINEAPPLE_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.SLICED_PINEAPPLE), conditionsFromItem(ModItems.SLICED_PINEAPPLE))
                        .offerTo(exporter);
                // Pineapple Leggings
                createShaped(RecipeCategory.COMBAT, ModItems.PINEAPPLE_LEGGINGS, 1)
                        .pattern("mmm")
                        .pattern("mam")
                        .pattern("m m")
                        .input('m', ModTags.Items.PINEAPPLE_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.SLICED_PINEAPPLE), conditionsFromItem(ModItems.SLICED_PINEAPPLE))
                        .offerTo(exporter);
                // Pineapple Boots
                createShaped(RecipeCategory.COMBAT, ModItems.PINEAPPLE_BOOTS, 1)
                        .pattern("mam")
                        .pattern("m m")
                        .input('m', ModTags.Items.PINEAPPLE_TOOL_MATERIALS)
                        .input('a', ModItems.ARMOR_CORE)
                        .criterion(hasItem(ModItems.SLICED_PINEAPPLE), conditionsFromItem(ModItems.SLICED_PINEAPPLE))
                        .offerTo(exporter);

                // Corrupted Nether Star
                createShaped(RecipeCategory.MISC, ModItems.CORRUPTED_NETHER_STAR, 1)
                        .pattern("pnp")
                        .pattern("nsn")
                        .pattern("pnp")
                        .input('s', Items.NETHER_STAR)
                        .input('n', Items.NETHERITE_INGOT)
                        .input('p', Items.POPPED_CHORUS_FRUIT)
                        .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                        .offerTo(exporter);
                // Armor Core
                createShaped(RecipeCategory.MISC, ModItems.ARMOR_CORE, 1)
                        .pattern("prp")
                        .pattern("dcl")
                        .pattern("pgp")
                        .input('c', ModItems.CORRUPTED_NETHER_STAR)
                        .input('p', Items.PRISMARINE_SHARD)
                        .input('l', Items.LAPIS_LAZULI)
                        .input('d', Items.DIAMOND)
                        .input('r', Items.REDSTONE)
                        .input('g', Items.GOLD_INGOT)
                        .criterion(hasItem(ModItems.CORRUPTED_NETHER_STAR), conditionsFromItem(ModItems.CORRUPTED_NETHER_STAR))
                        .offerTo(exporter);
                // Mahogany Knife
                createShaped(RecipeCategory.MISC, ModItems.MANGROVE_KNIFE, 1)
                        .pattern("iim")
                        .input('i', Items.IRON_INGOT)
                        .input('m', Items.MANGROVE_LOG)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);
                // Juicer
                createShaped(RecipeCategory.MISC, ModItems.JUICER, 1)
                        .pattern("  i")
                        .pattern(" id")
                        .pattern("iii")
                        .input('i', Items.IRON_INGOT)
                        .input('d', Items.DIAMOND)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);

                // Fruit Snack
                createShaped(RecipeCategory.FOOD, ModItems.FRUIT_SNACK, 1)
                        .pattern("sm")
                        .pattern("pi")
                        .input('s', Items.SUGAR)
                        .input('m', ModItems.MANGO)
                        .input('p', ModItems.POMEGRANATE)
                        .input('i', ModItems.PINEAPPLE)
                        .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                        .offerTo(exporter);
                // Fruit Salad
                createShaped(RecipeCategory.FOOD, ModItems.FRUIT_SALAD, 1)
                        .pattern("mpi")
                        .pattern(" b ")
                        .input('b', Items.BOWL)
                        .input('m', ModItems.MANGO)
                        .input('p', ModItems.POMEGRANATE)
                        .input('i', ModItems.PINEAPPLE)
                        .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                        .offerTo(exporter);
                // Mango Juice
                createShapeless(RecipeCategory.FOOD, ModItems.MANGO_JUICE, 1)
                        .input(ModItems.JUICER)
                        .input(ModItems.MANGO)
                        .input(Items.GLASS_BOTTLE)
                        .criterion(hasItem(ModItems.MANGO), conditionsFromItem(ModItems.MANGO))
                        .offerTo(exporter);
                // Pomegranate Juice
                createShapeless(RecipeCategory.FOOD, ModItems.POMEGRANATE_JUICE, 1)
                        .input(ModItems.JUICER)
                        .input(ModItems.POMEGRANATE)
                        .input(Items.GLASS_BOTTLE)
                        .criterion(hasItem(ModItems.POMEGRANATE), conditionsFromItem(ModItems.POMEGRANATE))
                        .offerTo(exporter);
                // Pineapple Juice
                createShapeless(RecipeCategory.FOOD, ModItems.PINEAPPLE_JUICE, 1)
                        .input(ModItems.JUICER)
                        .input(ModItems.PINEAPPLE)
                        .input(Items.GLASS_BOTTLE)
                        .criterion(hasItem(ModItems.PINEAPPLE), conditionsFromItem(ModItems.PINEAPPLE))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "FruitTreesRecipeProvider";
    }
}
