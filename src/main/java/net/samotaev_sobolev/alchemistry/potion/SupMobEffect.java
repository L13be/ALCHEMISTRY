
package net.samotaev_sobolev.alchemistry.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.samotaev_sobolev.alchemistry.procedures.SupEffectStartedappliedProcedure;

public class SupMobEffect extends MobEffect {
	public SupMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3407872);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SupEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
