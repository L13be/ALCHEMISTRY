
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aalc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.aalc.potion.ZloyyMobEffect;
import net.mcreator.aalc.potion.SupMobEffect;
import net.mcreator.aalc.potion.ShieMobEffect;
import net.mcreator.aalc.potion.NegeMobEffect;
import net.mcreator.aalc.potion.FotikkMobEffect;
import net.mcreator.aalc.potion.DfggdbfMobEffect;
import net.mcreator.aalc.potion.Akvamen1MobEffect;
import net.mcreator.aalc.AalcMod;

public class AalcModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AalcMod.MODID);
	public static final RegistryObject<MobEffect> ZLOYY = REGISTRY.register("zloyy", () -> new ZloyyMobEffect());
	public static final RegistryObject<MobEffect> FOTIKK = REGISTRY.register("fotikk", () -> new FotikkMobEffect());
	public static final RegistryObject<MobEffect> AKVAS_1 = REGISTRY.register("akvas_1", () -> new Akvamen1MobEffect());
	public static final RegistryObject<MobEffect> SUP = REGISTRY.register("sup", () -> new SupMobEffect());
	public static final RegistryObject<MobEffect> SHIE = REGISTRY.register("shie", () -> new ShieMobEffect());
	public static final RegistryObject<MobEffect> DFGGDBF = REGISTRY.register("dfggdbf", () -> new DfggdbfMobEffect());
	public static final RegistryObject<MobEffect> NEGE = REGISTRY.register("nege", () -> new NegeMobEffect());
}
