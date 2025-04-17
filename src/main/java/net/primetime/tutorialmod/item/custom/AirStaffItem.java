package net.primetime.tutorialmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class AirStaffItem extends Item{
    public AirStaffItem(Item.Properties pProperties){
        super(pProperties);
    }



    //LEft click block slings player upwards in direction faced.
    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Player player = pContext.getPlayer();

       // Block clickedBlock = level.getBlockState(pContext.getClickedPos()).getBlock();

            player.addEffect( new MobEffectInstance(MobEffects.SLOW_FALLING,130,1));
            player.move(MoverType.PLAYER,new Vec3(0,4,0));
            player.setDeltaMovement(player.getViewVector(.4f).scale(3f));
        return super.useOn(pContext);
    }


    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.move(MoverType.PLAYER,new Vec3(0,1,0));
        pTarget.setDeltaMovement(pAttacker.getViewVector(.4f).scale(3f));
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        pTooltipComponents.add(Component.translatable("tooltip.tutorialmod.air_staff.tooltip"));
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
