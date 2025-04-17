package net.primetime.tutorialmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.alchemy.Potion;

public class ModFoodProperties {
    public static final FoodProperties COFFEE = new FoodProperties.Builder().nutrition(0).saturationModifier(0f)
            .m_38762_(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1400, 1), .4F)
            .m_38762_(new MobEffectInstance(MobEffects.DIG_SPEED, 1400, 1), .25F)
            .m_38762_(new MobEffectInstance(MobEffects.HUNGER, 300, 1), .1F)
            .m_38762_(new MobEffectInstance(MobEffects.CONFUSION, 300, 1), .1F)
            .alwaysEdible().build();
}
