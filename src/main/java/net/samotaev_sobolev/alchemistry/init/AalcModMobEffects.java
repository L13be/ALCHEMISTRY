
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.samotaev_sobolev.alchemistry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.samotaev_sobolev.alchemistry.potion.ZloyyMobEffect;
import net.samotaev_sobolev.alchemistry.potion.SupMobEffect;
import net.samotaev_sobolev.alchemistry.potion.ShieMobEffect;
import net.samotaev_sobolev.alchemistry.potion.NegeMobEffect;
import net.samotaev_sobolev.alchemistry.potion.FotikkMobEffect;
import net.samotaev_sobolev.alchemistry.potion.DfggdbfMobEffect;
import net.samotaev_sobolev.alchemistry.potion.Akvamen1MobEffect;
import net.samotaev_sobolev.alchemistry.AalcMod;

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
