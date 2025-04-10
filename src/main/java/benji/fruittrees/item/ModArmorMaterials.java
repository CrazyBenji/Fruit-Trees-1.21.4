package benji.fruittrees.item;

import benji.fruittrees.FruitTrees;
import benji.fruittrees.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class ModArmorMaterials {
    // Armor Materials

    // public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_MANGO = registerReference("block.honey_block.place");
    public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_MANGO = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    public static final int FRUIT_ARMOR_BASE_DURABILITY = 128;
    public static final RegistryKey<EquipmentAsset> MANGO_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(FruitTrees.MOD_ID, "mango"));
    public static final ArmorMaterial MANGO_ARMOR_MATERIAL = new ArmorMaterial(
            FRUIT_ARMOR_BASE_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 4,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 7,
                    EquipmentType.BOOTS, 4
            ),
            5,
            ITEM_ARMOR_EQUIP_MANGO,
            1.0F,
            0.2F,
            ModTags.Items.REPAIRS_MANGO_ARMOR,
            MANGO_ARMOR_MATERIAL_KEY
    );

    public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_POMEGRANATE = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    public static final RegistryKey<EquipmentAsset> POMEGRANATE_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(FruitTrees.MOD_ID, "pomegranate"));
    public static final ArmorMaterial POMEGRANATE_ARMOR_MATERIAL = new ArmorMaterial(
            FRUIT_ARMOR_BASE_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 4,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 7,
                    EquipmentType.BOOTS, 4
            ),
            5,
            ITEM_ARMOR_EQUIP_POMEGRANATE,
            1.0F,
            0.2F,
            ModTags.Items.REPAIRS_POMEGRANATE_ARMOR,
            POMEGRANATE_ARMOR_MATERIAL_KEY
    );

    public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_PINEAPPLE = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    public static final RegistryKey<EquipmentAsset> PINEAPPLE_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(FruitTrees.MOD_ID, "pineapple"));
    public static final ArmorMaterial PINEAPPLE_ARMOR_MATERIAL = new ArmorMaterial(
            FRUIT_ARMOR_BASE_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 4,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 7,
                    EquipmentType.BOOTS, 4
            ),
            5,
            ITEM_ARMOR_EQUIP_PINEAPPLE,
            1.0F,
            0.2F,
            ModTags.Items.REPAIRS_PINEAPPLE_ARMOR,
            PINEAPPLE_ARMOR_MATERIAL_KEY
    );




    private static RegistryEntry.Reference<SoundEvent> registerReference(String id) {
        return registerReference(Identifier.ofVanilla(id));
    }
    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id) {
        return registerReference(id, id);
    }
    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id, Identifier soundId) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }
}
