package com.slasherman.doulacontinent.item.custom;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

//          烈火凤凰第一魂技：凤凰之火
//      效果:
//          1.点燃方块
//          2.点燃自己
//          3.为自己增加抗火
public class hunji1_phoenix_fire extends Item {

    public hunji1_phoenix_fire(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world  = context.getWorld();
        if(!world.isClient())
        {
            ItemStack item = context.getStack();
            BlockState blockState = world.getBlockState(context.getBlockPos());
            PlayerEntity player = context.getPlayer();
            lightFire(blockState,context,player);
            item.damage(1,context.getPlayer(),playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));
        }
        return ActionResult.SUCCESS;
    }

    private void lightFire(BlockState blockState, ItemUsageContext context, PlayerEntity player) {
        boolean playerNotOnFire = !player.isOnFire();
        /*
        这里是Besson的代码
        注释外我稍微修改一下
        if (context.getWorld().getRandom().nextFloat() > 0.5f) {
            lightEntityOnFire(player,200);
        } else if (playerNotOnFire) {
            gainFireResistanceAndDestoryBlock(player,context.getWorld(),context.getBlockPos());
        } else {
            lightGround(context);
        }*/

        lightEntityOnFire(player,50);

        gainFireResistanceAndDestoryBlock(player, context.getWorld(), context.getBlockPos());

        lightGround(context);

    }
    //搬用原版打火石代码
    private void lightGround(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockPos blockPos1 = blockPos.offset(context.getSide());
        if (AbstractFireBlock.canPlaceAt(world, blockPos1, context.getHorizontalPlayerFacing())) {
            world.playSound(player, blockPos1, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS
            , 1.0f, world.getRandom().nextFloat() * 0.4f + 0.8f);
            BlockState blockState2 = AbstractFireBlock.getState(world, blockPos1);
            world.setBlockState(blockPos1, blockState2, AbstractFireBlock.NOTIFY_ALL | AbstractFireBlock.REDRAW_ON_MAIN_THREAD);
            world.emitGameEvent(player, GameEvent.BLOCK_PLACE, blockPos);
        }
    }

    private void gainFireResistanceAndDestoryBlock(PlayerEntity player, World world, BlockPos blockPos) {
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200));
        //world.breakBlock(blockPos,false);
    }

    private void lightEntityOnFire(PlayerEntity player, int i) {
        player.setFireTicks(i);
    }
}
