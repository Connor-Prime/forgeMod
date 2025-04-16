package net.primetime.tutorialmod.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;

public class AirStaffItem extends Item{
    public AirStaffItem(Item.Properties pProperties){
        super(pProperties);
    }



    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Player player = pContext.getPlayer();

        Block clickedBlock = level.getBlockState(pContext.getClickedPos()).getBlock();


            player.move(MoverType.PLAYER,new Vec3(0,4,0));
            player.setDeltaMovement(player.getViewVector(.4f).scale(3f));
        return super.useOn(pContext);
    }


}
