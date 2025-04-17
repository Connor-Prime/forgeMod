package net.primetime.tutorialmod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class CoffeeItem extends Item {
    public CoffeeItem(Properties pProperties){
        super(pProperties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack){
        return UseAnim.DRINK;
    }
}
