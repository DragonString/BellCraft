package bellcraft.recipes;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import bellcraft.core.BellCraft;
import bellcraft.items.Items;

public class ItemRecipe {
	public static void registerRecipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Items.RandomBoxTier1, 1), Items.ingotRandom, Items.ingotRandom, Items.ingotRandom, Items.ingotRandom);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.RandomBoxTier2, 1), Items.RandomBoxTier1, Items.RandomBoxTier1, Items.RandomBoxTier1, Items.RandomBoxTier1);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.RandomBoxTier3, 1), Items.RandomBoxTier2, Items.RandomBoxTier2, Items.RandomBoxTier2, Items.RandomBoxTier2);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.RandomBoxTier4, 1), Items.RandomBoxTier3, Items.RandomBoxTier3, Items.RandomBoxTier3, Items.RandomBoxTier3);
		
		BellCraft.AddLog("Item Recipe register complete.");
	}
}
