package benji.fruittrees.item.custom;

import benji.fruittrees.ModItems;
import benji.fruittrees.item.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.world.World;

public class ModArmorItem extends ArmorItem {
    public ModArmorItem(ArmorMaterial material, EquipmentType type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()) {
            if(entity instanceof PlayerEntity player) {
                if(hasFullSuitOfArmorOn(player)) {
                    evaluateArmorEffects(player);
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        ArmorMaterial currentFullArmorMaterial = getFullArmorMaterial(player);
        if (currentFullArmorMaterial == ModArmorMaterials.MANGO_ARMOR_MATERIAL) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, (int)(0.05 * ModItems.TICKS_PER_SECOND), 1, false, false));
        }
        else if (currentFullArmorMaterial == ModArmorMaterials.POMEGRANATE_ARMOR_MATERIAL) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, (int)(0.05 * ModItems.TICKS_PER_SECOND), 1, false, false));
        }
        else if (currentFullArmorMaterial == ModArmorMaterials.PINEAPPLE_ARMOR_MATERIAL) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, (int)(0.05 * ModItems.TICKS_PER_SECOND), 1, false, false));return;
        }
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack breastplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private ArmorMaterial getFullArmorMaterial(PlayerEntity player) {
        ArmorItem boots = ((ArmorItem)player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
        ArmorItem chestplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());

        if (boots.equals(ModItems.MANGO_BOOTS) && leggings.equals(ModItems.MANGO_LEGGINGS)
                && chestplate.equals(ModItems.MANGO_CHESTPLATE) && helmet.equals(ModItems.MANGO_HELMET)) {
            return ModArmorMaterials.MANGO_ARMOR_MATERIAL;
        }
        else if (boots.equals(ModItems.POMEGRANATE_BOOTS) && leggings.equals(ModItems.POMEGRANATE_LEGGINGS)
                && chestplate.equals(ModItems.POMEGRANATE_CHESTPLATE) && helmet.equals(ModItems.POMEGRANATE_HELMET)) {
            return ModArmorMaterials.POMEGRANATE_ARMOR_MATERIAL;
        }
        else if (boots.equals(ModItems.PINEAPPLE_BOOTS) && leggings.equals(ModItems.PINEAPPLE_LEGGINGS)
                && chestplate.equals(ModItems.PINEAPPLE_CHESTPLATE) && helmet.equals(ModItems.PINEAPPLE_HELMET)){
            return ModArmorMaterials.PINEAPPLE_ARMOR_MATERIAL;
        }
        else {
            return null;
        }
    }
}