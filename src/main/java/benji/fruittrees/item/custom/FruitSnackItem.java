package benji.fruittrees.item.custom;

import benji.fruittrees.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FruitSnackItem extends Item {
    private String[] ingredients = {"mango", "pomegranate", "pineapple"};
    public FruitSnackItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient) {
            for (String ingredient : ingredients) {
                StatusEffectInstance effect = getStatusEffect(ingredient);
                user.addStatusEffect(effect);
            }
        }

        return super.finishUsing(stack, world, user);
    }

    private StatusEffectInstance getStatusEffect(String ingredient) {
        switch (ingredient) {
            case "mango":
                return new StatusEffectInstance(StatusEffects.REGENERATION, 4 * ModItems.TICKS_PER_SECOND, 1);
            case "pomegranate":
                return new StatusEffectInstance(StatusEffects.STRENGTH, 40 * ModItems.TICKS_PER_SECOND, 1);
            case "pineapple":
                return new StatusEffectInstance(StatusEffects.HASTE, 60 * ModItems.TICKS_PER_SECOND, 1);
            default:
                return new StatusEffectInstance(StatusEffects.REGENERATION, 4 * ModItems.TICKS_PER_SECOND, 1);
        }
    }

    public void setIngredient(String ingredient, int index) {
        if (index < ingredients.length) {
            ingredients[index] = ingredient;
        }
    }
}