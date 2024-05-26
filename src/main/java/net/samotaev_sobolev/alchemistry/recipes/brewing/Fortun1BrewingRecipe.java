
package net.samotaev_sobolev.alchemistry.recipes.brewing;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.samotaev_sobolev.alchemistry.init.AalcModPotions;
import net.samotaev_sobolev.alchemistry.init.AalcModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Fortun1BrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new Fortun1BrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		Item inputItem = input.getItem();
		return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION) && PotionUtils.getPotion(input) == AalcModPotions.FIRE.get();
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(new ItemStack(AalcModItems.OPAL.get())).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionUtils.setPotion(new ItemStack(input.getItem()), AalcModPotions.SHIELDS.get());
		}
		return ItemStack.EMPTY;
	}
}
