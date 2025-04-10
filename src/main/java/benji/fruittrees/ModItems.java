package benji.fruittrees;

import benji.fruittrees.item.*;
import benji.fruittrees.item.custom.*;
import com.google.common.base.Function;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static benji.fruittrees.item.ModFoodComponents.FRUIT_SNACK_FOOD_COMPONENT;

public class ModItems {
    // Constants
    public static final int TICKS_PER_SECOND = 20;

    // Mango Items
    public static final Item COOKED_MANGO = register("cooked_mango", Item::new, new Item.Settings().food(ModFoodComponents.COOKED_MANGO_FOOD_COMPONENT, ModFoodComponents.COOKED_MANGO_CONSUMABLE_COMPONENT));
    public static final Item MANGO = register("mango", Item::new, new Item.Settings().food(ModFoodComponents.MANGO_FOOD_COMPONENT, ModFoodComponents.MANGO_CONSUMABLE_COMPONENT));
    public static final Item MANGO_INGOT = register("mango_ingot", Item::new, new Item.Settings());
    public static final Item MANGO_SWORD = register(
            "mango_sword",
            settings -> new SwordItem(ModToolMaterials.MANGO_TOOL_MATERIAL, 6f, -2.4f, settings),
            new Item.Settings()
    );
    public static final Item MANGO_AXE = register(
            "mango_axe",
            settings -> new AxeItem(ModToolMaterials.MANGO_TOOL_MATERIAL, 8f, -3.0f, settings),
            new Item.Settings()
    );
    public static final Item MANGO_PICKAXE = register(
            "mango_pickaxe",
            settings -> new PickaxeItem(ModToolMaterials.MANGO_TOOL_MATERIAL, 2f, -2.8f, settings),
            new Item.Settings()
    );
    public static final Item MANGO_SHOVEL = register(
            "mango_shovel",
            settings -> new ShovelItem(ModToolMaterials.MANGO_TOOL_MATERIAL, 1f, -3.0f, settings),
            new Item.Settings()
    );
    public static final Item MANGO_HOE = register(
            "mango_hoe",
            settings -> new HoeItem(ModToolMaterials.MANGO_TOOL_MATERIAL, 0f, -3.0f, settings),
            new Item.Settings()
    );
    public static final Item MANGO_HELMET = register(
            "mango_helmet",
            settings -> new ArmorItem(ModArmorMaterials.MANGO_ARMOR_MATERIAL, EquipmentType.HELMET, settings),
            new Item.Settings().maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );
    public static final Item MANGO_CHESTPLATE = register(
            "mango_chestplate",
            settings -> new ModArmorItem(ModArmorMaterials.MANGO_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, settings),
            new Item.Settings().maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );
    public static final Item MANGO_LEGGINGS = register(
            "mango_leggings",
            settings -> new ArmorItem(ModArmorMaterials.MANGO_ARMOR_MATERIAL, EquipmentType.LEGGINGS, settings),
            new Item.Settings().maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );
    public static final Item MANGO_BOOTS = register(
            "mango_boots",
            settings -> new ArmorItem(ModArmorMaterials.MANGO_ARMOR_MATERIAL, EquipmentType.BOOTS, settings),
            new Item.Settings().maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );

    // Pomegranate Items
    public static final Item POMEGRANATE = register("pomegranate", Item::new, new Item.Settings().food(ModFoodComponents.POMEGRANATE_FOOD_COMPONENT, ModFoodComponents.POMEGRANATE_CONSUMABLE_COMPONENT));
    public static final Item PARTIALLY_ROTTEN_POMEGRANATE = register("partially_rotten_pomegranate", Item::new, new Item.Settings().food(ModFoodComponents.PARTIALLY_ROTTEN_POMEGRANATE_FOOD_COMPONENT, ModFoodComponents.PARTIALLY_ROTTEN_POMEGRANATE_CONSUMABLE_COMPONENT));
    public static final Item ROTTEN_POMEGRANATE = register("rotten_pomegranate", Item::new, new Item.Settings().food(ModFoodComponents.ROTTEN_POMEGRANATE_FOOD_COMPONENT, ModFoodComponents.ROTTEN_POMEGRANATE_CONSUMABLE_COMPONENT));
    public static final Item POMEGRANATE_SWORD = register(
            "pomegranate_sword",
            settings -> new SwordItem(ModToolMaterials.POMEGRANATE_TOOL_MATERIAL, 6f, -2.4f, settings),
            new Item.Settings()
    );
    public static final Item POMEGRANATE_AXE = register(
            "pomegranate_axe",
            settings -> new AxeItem(ModToolMaterials.POMEGRANATE_TOOL_MATERIAL, 8f, -3.0f, settings),
            new Item.Settings()
    );
    public static final Item POMEGRANATE_PICKAXE = register(
            "pomegranate_pickaxe",
            settings -> new PickaxeItem(ModToolMaterials.POMEGRANATE_TOOL_MATERIAL, 2f, -2.8f, settings),
            new Item.Settings()
    );
    public static final Item POMEGRANATE_SHOVEL = register(
            "pomegranate_shovel",
            settings -> new ShovelItem(ModToolMaterials.POMEGRANATE_TOOL_MATERIAL, 1f, -3.0f, settings),
            new Item.Settings()
    );
    public static final Item POMEGRANATE_HOE = register(
            "pomegranate_hoe",
            settings -> new HoeItem(ModToolMaterials.POMEGRANATE_TOOL_MATERIAL, 0f, -3.0f, settings),
            new Item.Settings()
    );
    public static final Item POMEGRANATE_HELMET = register(
            "pomegranate_helmet",
            settings -> new ArmorItem(ModArmorMaterials.POMEGRANATE_ARMOR_MATERIAL, EquipmentType.HELMET, settings),
            new Item.Settings().maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );
    public static final Item POMEGRANATE_CHESTPLATE = register(
            "pomegranate_chestplate",
            settings -> new ModArmorItem(ModArmorMaterials.POMEGRANATE_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, settings),
            new Item.Settings().maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );
    public static final Item POMEGRANATE_LEGGINGS = register(
            "pomegranate_leggings",
            settings -> new ArmorItem(ModArmorMaterials.POMEGRANATE_ARMOR_MATERIAL, EquipmentType.LEGGINGS, settings),
            new Item.Settings().maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );
    public static final Item POMEGRANATE_BOOTS = register(
            "pomegranate_boots",
            settings -> new ArmorItem(ModArmorMaterials.POMEGRANATE_ARMOR_MATERIAL, EquipmentType.BOOTS, settings),
            new Item.Settings().maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );

    // Pineapple Items
    public static final Item PINEAPPLE = register("pineapple", Item::new, new Item.Settings().food(ModFoodComponents.PINEAPPLE_FOOD_COMPONENT, ModFoodComponents.PINEAPPLE_CONSUMABLE_COMPONENT));
    public static final Item SLICED_PINEAPPLE = register("sliced_pineapple", Item::new, new Item.Settings().food(ModFoodComponents.SLICED_PINEAPPLE_FOOD_COMPONENT, ModFoodComponents.SLICED_PINEAPPLE_CONSUMABLE_COMPONENT));
    public static final Item PINEAPPLE_SWORD = register(
            "pineapple_sword",
            settings -> new SwordItem(ModToolMaterials.PINEAPPLE_TOOL_MATERIAL, 6f, -2.4f, settings),
            new Item.Settings()
    );
    public static final Item PINEAPPLE_AXE = register(
            "pineapple_axe",
            settings -> new AxeItem(ModToolMaterials.PINEAPPLE_TOOL_MATERIAL, 8f, -3.0f, settings),
            new Item.Settings()
    );
    public static final Item PINEAPPLE_PICKAXE = register(
            "pineapple_pickaxe",
            settings -> new PickaxeItem(ModToolMaterials.PINEAPPLE_TOOL_MATERIAL, 2f, -2.8f, settings),
            new Item.Settings()
    );
    public static final Item PINEAPPLE_SHOVEL = register(
            "pineapple_shovel",
            settings -> new ShovelItem(ModToolMaterials.PINEAPPLE_TOOL_MATERIAL, 1f, -3.0f, settings),
            new Item.Settings()
    );
    public static final Item PINEAPPLE_HOE = register(
            "pineapple_hoe",
            settings -> new HoeItem(ModToolMaterials.PINEAPPLE_TOOL_MATERIAL, 0f, -3.0f, settings),
            new Item.Settings()
    );
    public static final Item PINEAPPLE_HELMET = register(
            "pineapple_helmet",
            settings -> new ArmorItem(ModArmorMaterials.PINEAPPLE_ARMOR_MATERIAL, EquipmentType.HELMET, settings),
            new Item.Settings().maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );
    public static final Item PINEAPPLE_CHESTPLATE = register(
            "pineapple_chestplate",
            settings -> new ModArmorItem(ModArmorMaterials.PINEAPPLE_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, settings),
            new Item.Settings().maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );
    public static final Item PINEAPPLE_LEGGINGS = register(
            "pineapple_leggings",
            settings -> new ArmorItem(ModArmorMaterials.PINEAPPLE_ARMOR_MATERIAL, EquipmentType.LEGGINGS, settings),
            new Item.Settings().maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );
    public static final Item PINEAPPLE_BOOTS = register(
            "pineapple_boots",
            settings -> new ArmorItem(ModArmorMaterials.PINEAPPLE_ARMOR_MATERIAL, EquipmentType.BOOTS, settings),
            new Item.Settings().maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.FRUIT_ARMOR_BASE_DURABILITY))
    );

    // Utility Items
    public static final Item CORRUPTED_NETHER_STAR = register("corrupted_nether_star", Item::new, new Item.Settings());
    public static final Item ARMOR_CORE = register("armor_core", CraftingItem::new, new Item.Settings().maxDamage(4).maxCount(1));
    public static final Item MANGROVE_KNIFE = register("mangrove_knife", CraftingItem::new, new Item.Settings().maxDamage(32).maxCount(1));
    public static final Item JUICER = register("juicer", CraftingItem::new, new Item.Settings().maxDamage(64).maxCount(1));

    // Craftable Items
    public static final Item FRUIT_SNACK = register("fruit_snack", FruitSnackItem::new, new Item.Settings().food(FRUIT_SNACK_FOOD_COMPONENT));
    public static final Item FRUIT_SALAD = register("fruit_salad", Item::new, new Item.Settings().food(ModFoodComponents.FRUIT_SALAD_FOOD_COMPONENT));
    public static final Item MANGO_JUICE = register("mango_juice", Item::new, new Item.Settings().food(ModFoodComponents.MANGO_JUICE_FOOD_COMPONENT, ModFoodComponents.MANGO_JUICE_CONSUMABLE_COMPONENT).maxCount(16));
    public static final Item POMEGRANATE_JUICE = register("pomegranate_juice", Item::new, new Item.Settings().food(ModFoodComponents.POMEGRANATE_JUICE_FOOD_COMPONENT, ModFoodComponents.POMEGRANATE_JUICE_CONSUMABLE_COMPONENT).maxCount(16));
    public static final Item PINEAPPLE_JUICE = register("pineapple_juice", Item::new, new Item.Settings().food(ModFoodComponents.PINEAPPLE_JUICE_FOOD_COMPONENT, ModFoodComponents.PINEAPPLE_JUICE_CONSUMABLE_COMPONENT).maxCount(16));


    public static void registerModItems() {
        FruitTrees.LOGGER.info("Registering Mod Items for " + FruitTrees.MOD_ID);
        Registry.register(Registries.ITEM_GROUP, ModItemGroups.FRUIT_TREES_GROUP_KEY, ModItemGroups.FRUIT_TREES_GROUP);

        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.FRUIT_TREES_GROUP_KEY).register(itemGroup -> {
            // Mango
            itemGroup.add(COOKED_MANGO);
            itemGroup.add(MANGO);
            itemGroup.add(MANGO_INGOT);
            itemGroup.add(MANGO_SWORD);
            itemGroup.add(MANGO_AXE);
            itemGroup.add(MANGO_PICKAXE);
            itemGroup.add(MANGO_SHOVEL);
            itemGroup.add(MANGO_HOE);
            itemGroup.add(MANGO_HELMET);
            itemGroup.add(MANGO_CHESTPLATE);
            itemGroup.add(MANGO_LEGGINGS);
            itemGroup.add(MANGO_BOOTS);

            // Pomegranate
            itemGroup.add(POMEGRANATE);
            itemGroup.add(PARTIALLY_ROTTEN_POMEGRANATE);
            itemGroup.add(ROTTEN_POMEGRANATE);
            itemGroup.add(POMEGRANATE_SWORD);
            itemGroup.add(POMEGRANATE_AXE);
            itemGroup.add(POMEGRANATE_PICKAXE);
            itemGroup.add(POMEGRANATE_SHOVEL);
            itemGroup.add(POMEGRANATE_HOE);
            itemGroup.add(POMEGRANATE_HELMET);
            itemGroup.add(POMEGRANATE_CHESTPLATE);
            itemGroup.add(POMEGRANATE_LEGGINGS);
            itemGroup.add(POMEGRANATE_BOOTS);

            // Pineapple
            itemGroup.add(PINEAPPLE);
            itemGroup.add(SLICED_PINEAPPLE);
            itemGroup.add(PINEAPPLE_SWORD);
            itemGroup.add(PINEAPPLE_AXE);
            itemGroup.add(PINEAPPLE_PICKAXE);
            itemGroup.add(PINEAPPLE_SHOVEL);
            itemGroup.add(PINEAPPLE_HOE);
            itemGroup.add(PINEAPPLE_HELMET);
            itemGroup.add(PINEAPPLE_CHESTPLATE);
            itemGroup.add(PINEAPPLE_LEGGINGS);
            itemGroup.add(PINEAPPLE_BOOTS);

            // Utility
            itemGroup.add(CORRUPTED_NETHER_STAR);
            itemGroup.add(ARMOR_CORE);
            itemGroup.add(MANGROVE_KNIFE);
            itemGroup.add(JUICER);

            // Craftable
            itemGroup.add(FRUIT_SNACK);
            itemGroup.add(FRUIT_SALAD);
            itemGroup.add(MANGO_JUICE);
            itemGroup.add(POMEGRANATE_JUICE);
            itemGroup.add(PINEAPPLE_JUICE);

            // Blocks
            itemGroup.add(ModBlocks.MANGO_LEAVES.asItem());
            itemGroup.add(ModBlocks.POMEGRANATE_LEAVES.asItem());
            itemGroup.add(ModBlocks.PINEAPPLE_LEAVES.asItem());
            itemGroup.add(ModBlocks.MANGO_SAPLING.asItem());
            itemGroup.add(ModBlocks.POMEGRANATE_SAPLING.asItem());
            itemGroup.add(ModBlocks.PINEAPPLE_SAPLING.asItem());
            itemGroup.add(ModBlocks.FRUIT_SNACK_CRAFTER.asItem());
        });
    }

    public static void initialize() {
        registerModItems();

        CompostingChanceRegistry.INSTANCE.add(MANGO, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(COOKED_MANGO, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(POMEGRANATE, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(PARTIALLY_ROTTEN_POMEGRANATE, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(ROTTEN_POMEGRANATE, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(PINEAPPLE, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(SLICED_PINEAPPLE, 0.3f);
    }

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FruitTrees.MOD_ID, name));

        Item item = itemFactory.apply(settings.registryKey(itemKey));

        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }
}
