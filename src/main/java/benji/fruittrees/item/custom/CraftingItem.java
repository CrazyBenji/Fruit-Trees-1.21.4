package benji.fruittrees.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingItem extends Item {
    public CraftingItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        ItemStack newStack = stack.copy();
        newStack.setDamage(newStack.getDamage() + 1);
        if (newStack.getDamage() == newStack.getMaxDamage()) {
            return super.getRecipeRemainder();
        }
        return newStack;
    }
}