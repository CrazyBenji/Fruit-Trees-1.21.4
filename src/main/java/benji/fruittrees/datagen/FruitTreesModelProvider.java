package benji.fruittrees.datagen;

import benji.fruittrees.ModBlocks;
import benji.fruittrees.ModItems;
import benji.fruittrees.item.ModArmorMaterials;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.TexturedModel;

public class FruitTreesModelProvider extends FabricModelProvider {
    public FruitTreesModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSingleton(ModBlocks.MANGO_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(ModBlocks.POMEGRANATE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(ModBlocks.PINEAPPLE_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(ModBlocks.MANGO_SAPLING, ModBlocks.POTTED_MANGO_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(ModBlocks.POMEGRANATE_SAPLING, ModBlocks.POTTED_POMEGRANATE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(ModBlocks.PINEAPPLE_SAPLING, ModBlocks.POTTED_PINEAPPLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Mango Items
        itemModelGenerator.register(ModItems.MANGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_MANGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGO_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGO_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MANGO_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MANGO_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MANGO_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MANGO_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ModItems.MANGO_HELMET, ModArmorMaterials.MANGO_ARMOR_MATERIAL_KEY, "helmet", false);
        itemModelGenerator.registerArmor(ModItems.MANGO_CHESTPLATE, ModArmorMaterials.MANGO_ARMOR_MATERIAL_KEY, "chestplate", false);
        itemModelGenerator.registerArmor(ModItems.MANGO_LEGGINGS, ModArmorMaterials.MANGO_ARMOR_MATERIAL_KEY, "leggings", false);
        itemModelGenerator.registerArmor(ModItems.MANGO_BOOTS, ModArmorMaterials.MANGO_ARMOR_MATERIAL_KEY, "boots", false);

        // Pomegranate
        itemModelGenerator.register(ModItems.POMEGRANATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PARTIALLY_ROTTEN_POMEGRANATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROTTEN_POMEGRANATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.POMEGRANATE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.POMEGRANATE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.POMEGRANATE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.POMEGRANATE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.POMEGRANATE_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ModItems.POMEGRANATE_HELMET, ModArmorMaterials.POMEGRANATE_ARMOR_MATERIAL_KEY, "helmet", false);
        itemModelGenerator.registerArmor(ModItems.POMEGRANATE_CHESTPLATE, ModArmorMaterials.POMEGRANATE_ARMOR_MATERIAL_KEY, "chestplate", false);
        itemModelGenerator.registerArmor(ModItems.POMEGRANATE_LEGGINGS, ModArmorMaterials.POMEGRANATE_ARMOR_MATERIAL_KEY, "leggings", false);
        itemModelGenerator.registerArmor(ModItems.POMEGRANATE_BOOTS, ModArmorMaterials.POMEGRANATE_ARMOR_MATERIAL_KEY, "boots", false);

        // Pineapple
        itemModelGenerator.register(ModItems.PINEAPPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLICED_PINEAPPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINEAPPLE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINEAPPLE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINEAPPLE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINEAPPLE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINEAPPLE_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ModItems.PINEAPPLE_HELMET, ModArmorMaterials.PINEAPPLE_ARMOR_MATERIAL_KEY, "helmet", false);
        itemModelGenerator.registerArmor(ModItems.PINEAPPLE_CHESTPLATE, ModArmorMaterials.PINEAPPLE_ARMOR_MATERIAL_KEY, "chestplate", false);
        itemModelGenerator.registerArmor(ModItems.PINEAPPLE_LEGGINGS, ModArmorMaterials.PINEAPPLE_ARMOR_MATERIAL_KEY, "leggings", false);
        itemModelGenerator.registerArmor(ModItems.PINEAPPLE_BOOTS, ModArmorMaterials.PINEAPPLE_ARMOR_MATERIAL_KEY, "boots", false);

        // Utility
        itemModelGenerator.register(ModItems.CORRUPTED_NETHER_STAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARMOR_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGROVE_KNIFE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUICER, Models.GENERATED);

        // Craftables
        itemModelGenerator.register(ModItems.FRUIT_SNACK, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRUIT_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGO_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.POMEGRANATE_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINEAPPLE_JUICE, Models.GENERATED);
    }
}