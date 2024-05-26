
package net.samotaev_sobolev.alchemistry.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.samotaev_sobolev.alchemistry.procedures.ShiePriNalozhieniiEffiektaProcedure;

public class ShieMobEffect extends MobEffect {
	public ShieMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13312);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		ShiePriNalozhieniiEffiektaProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
