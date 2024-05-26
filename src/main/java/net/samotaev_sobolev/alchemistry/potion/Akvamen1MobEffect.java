
package net.samotaev_sobolev.alchemistry.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.samotaev_sobolev.alchemistry.procedures.Akvamen1EffectStartedappliedProcedure;

public class Akvamen1MobEffect extends MobEffect {
	public Akvamen1MobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16737793);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Akvamen1EffectStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
