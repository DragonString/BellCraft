package bellcraft.recipes;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import bellcraft.core.BellCraft;
import bellcraft.items.Items;

public class ItemRecipe {
	public static void registerRecipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Items.RandomBoxTier1, 1), Items.ingotRandom, Items.ingotRandom, Items.ingotRandom, Items.ingotRandom);
		GameRegistry.addShapedRecipe(new ItemStack(Items.RandomBoxTier2, 1), "XXX", "XXX", "XXX", 'X', Items.RandomBoxTier1);
		GameRegistry.addShapedRecipe(new ItemStack(Items.RandomBoxTier3, 1), "XXX", "XXX", "XXX", 'X', Items.RandomBoxTier2);
		GameRegistry.addShapedRecipe(new ItemStack(Items.RandomBoxTier4, 1), "XXX", "XXX", "XXX", 'X', Items.RandomBoxTier3);
		
		BellCraft.AddLog("Item Recipe register complete.");
	}
}
