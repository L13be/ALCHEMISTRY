
package net.samotaev_sobolev.alchemistry.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OpalItem extends Item {
	public OpalItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
