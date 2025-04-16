package net.primetime.tutorialmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.primetime.tutorialmod.item.ModItems;
import org.w3c.dom.events.Event;

public class LaunchBlock extends Block {
    public LaunchBlock (BlockBehaviour.Properties properties){
        super(properties);
    }
    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity){
        if(pEntity instanceof LivingEntity creature){
            if(!pLevel.isClientSide){
                creature.move(MoverType.SELF,new Vec3(0,4,0));
            }
            if(creature instanceof Player player){


                player.move(MoverType.PLAYER,new Vec3(0,4,0));
                player.setDeltaMovement(player.getViewVector(.4f).scale(3f));
            }
        }

        super.stepOn(pLevel,pPos,pState,pEntity);
    }
}
