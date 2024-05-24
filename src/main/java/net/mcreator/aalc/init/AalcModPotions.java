
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aalc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.aalc.AalcMod;

public class AalcModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, AalcMod.MODID);
	public static final RegistryObject<Potion> ZLOYI = REGISTRY.register("zloyi", () -> new Potion(new MobEffectInstance(AalcModMobEffects.ZLOYY.get(), 600, 0, false, true)));
	public static final RegistryObject<Potion> FOTOZ = REGISTRY.register("fotoz", () -> new Potion(new MobEffectInstance(AalcModMobEffects.FOTIKK.get(), 600, 0, false, true)));
	public static final RegistryObject<Potion> AKVA = REGISTRY.register("akva", () -> new Potion(new MobEffectInstance(AalcModMobEffects.AKVAS_1.get(), 3000, 0, false, true)));
	public static final RegistryObject<Potion> SYPER = REGISTRY.register("syper", () -> new Potion(new MobEffectInstance(AalcModMobEffects.SUP.get(), 1800, 0, false, true)));
	public static final RegistryObject<Potion> SHIELDS = REGISTRY.register("shields", () -> new Potion(new MobEffectInstance(AalcModMobEffects.SHIE.get(), 10, 0, false, true)));
	public static final RegistryObject<Potion> FIRE = REGISTRY.register("fire", () -> new Potion(new MobEffectInstance(AalcModMobEffects.DFGGDBF.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> NEG = REGISTRY.register("neg", () -> new Potion(new MobEffectInstance(AalcModMobEffects.NEGE.get(), 100, 0, false, true)));
}
