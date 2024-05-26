
package net.samotaev_sobolev.alchemistry.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.samotaev_sobolev.alchemistry.procedures.ZloyyKazhdyiTikVoVriemiaEffiektaProcedure;

public class ZloyyMobEffect extends MobEffect {
	public ZloyyMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ZloyyKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
