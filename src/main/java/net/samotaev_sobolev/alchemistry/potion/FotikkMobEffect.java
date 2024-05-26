
package net.samotaev_sobolev.alchemistry.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.samotaev_sobolev.alchemistry.procedures.FotikkEffectStartedappliedProcedure;

public class FotikkMobEffect extends MobEffect {
	public FotikkMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13382656);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FotikkEffectStartedappliedProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
