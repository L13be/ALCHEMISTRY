package net.samotaev_sobolev.alchemistry.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.samotaev_sobolev.alchemistry.init.AalcModMobEffects;

public class NakidkaKazhdyiTikDliaNaghrudnikaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.EMERALD)) : false) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(AalcModMobEffects.FOTIKK.get(), 600, 1));
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.HEART_OF_THE_SEA)) : false) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(AalcModMobEffects.AKVAS_1.get(), 600, 1));
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.MAGMA_CREAM)) : false) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(AalcModMobEffects.DFGGDBF.get(), 600, 1));
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.DIAMOND_SWORD)) : false) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(AalcModMobEffects.SUP.get(), 600, 1));
		}
	}
}
