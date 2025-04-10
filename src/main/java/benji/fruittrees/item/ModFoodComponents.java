package benji.fruittrees.item;

import benji.fruittrees.ModItems;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.sound.SoundEvents;

public class ModFoodComponents {
    // Food Components
    public static final FoodComponent MANGO_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(3)
            .alwaysEdible()
            .build();
    public static final FoodComponent COOKED_MANGO_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .alwaysEdible()
            .build();
    public static final FoodComponent POMEGRANATE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(3)
            .alwaysEdible()
            .build();
    public static final FoodComponent PARTIALLY_ROTTEN_POMEGRANATE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .alwaysEdible()
            .build();
    public static final FoodComponent ROTTEN_POMEGRANATE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(0)
            .alwaysEdible()
            .build();
    public static final FoodComponent PINEAPPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(3)
            .alwaysEdible()
            .build();
    public static final FoodComponent SLICED_PINEAPPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .alwaysEdible()
            .build();
    public static final FoodComponent FRUIT_SNACK_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(0)
            .alwaysEdible()
            .build();
    public static final FoodComponent FRUIT_SALAD_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(10)
            .build();
    public static final FoodComponent MANGO_JUICE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(10.0f)
            .alwaysEdible()
            .build();
    public static final FoodComponent POMEGRANATE_JUICE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(10.0f)
            .alwaysEdible()
            .build();
    public static final FoodComponent PINEAPPLE_JUICE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(10.0f)
            .alwaysEdible()
            .build();

    // Consumable Components
    public static final ConsumableComponent MANGO_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2 * ModItems.TICKS_PER_SECOND), 1.0f))
            .build();
    public static final ConsumableComponent COOKED_MANGO_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 4 * ModItems.TICKS_PER_SECOND, 1), 1.0f))
            .build();
    public static final ConsumableComponent POMEGRANATE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * ModItems.TICKS_PER_SECOND), 1.0f))
            .build();
    public static final ConsumableComponent PARTIALLY_ROTTEN_POMEGRANATE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 40 * ModItems.TICKS_PER_SECOND, 1), 1.0f))
            .build();
    public static final ConsumableComponent ROTTEN_POMEGRANATE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 60 * ModItems.TICKS_PER_SECOND, 2), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 10 * ModItems.TICKS_PER_SECOND), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 10 * ModItems.TICKS_PER_SECOND), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 10 * ModItems.TICKS_PER_SECOND), 1.0f))
            .build();
    public static final ConsumableComponent PINEAPPLE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 30 * ModItems.TICKS_PER_SECOND), 1.0f))
            .build();
    public static final ConsumableComponent SLICED_PINEAPPLE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 60 * ModItems.TICKS_PER_SECOND, 1), 1.0f))
            .build();
    public static final ConsumableComponent FRUIT_SNACK_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 4 * ModItems.TICKS_PER_SECOND, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 40 * ModItems.TICKS_PER_SECOND, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 60 * ModItems.TICKS_PER_SECOND, 1), 1.0f))
            .build();
    public static final ConsumableComponent MANGO_JUICE_CONSUMABLE_COMPONENT = ConsumableComponents.drink()
            .consumeParticles(true)
            .sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60 * ModItems.TICKS_PER_SECOND, 2)))
            .build();
    public static final ConsumableComponent POMEGRANATE_JUICE_CONSUMABLE_COMPONENT = ConsumableComponents.drink()
            .consumeParticles(true)
            .sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 60 * ModItems.TICKS_PER_SECOND, 2)))
            .build();
    public static final ConsumableComponent PINEAPPLE_JUICE_CONSUMABLE_COMPONENT = ConsumableComponents.drink()
            .consumeParticles(true)
            .sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 60 * ModItems.TICKS_PER_SECOND, 2)))
            .build();
}
