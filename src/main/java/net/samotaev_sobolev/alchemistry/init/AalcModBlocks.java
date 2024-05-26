
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.samotaev_sobolev.alchemistry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.samotaev_sobolev.alchemistry.block.BlackOpalBlock;
import net.samotaev_sobolev.alchemistry.AalcMod;

public class AalcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AalcMod.MODID);
	public static final RegistryObject<Block> BLACK_OPAL = REGISTRY.register("black_opal", () -> new BlackOpalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
