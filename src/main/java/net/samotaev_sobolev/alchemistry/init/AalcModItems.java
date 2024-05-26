
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.samotaev_sobolev.alchemistry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.samotaev_sobolev.alchemistry.item.OpalItem;
import net.samotaev_sobolev.alchemistry.item.NakidkaItem;
import net.samotaev_sobolev.alchemistry.AalcMod;

public class AalcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AalcMod.MODID);
	public static final RegistryObject<Item> BLACK_OPAL = block(AalcModBlocks.BLACK_OPAL);
	public static final RegistryObject<Item> OPAL = REGISTRY.register("opal", () -> new OpalItem());
	public static final RegistryObject<Item> NAKIDKA_CHESTPLATE = REGISTRY.register("nakidka_chestplate", () -> new NakidkaItem.Chestplate());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
