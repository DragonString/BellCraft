package bellcraft.recipes;

import bellcraft.blocks.Blocks;
import bellcraft.core.BellCraft;
import bellcraft.items.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class FurnaceRecipe {
	public static void registerRecipe()
	{
		// (블럭, new ItemStack(아이템, 개수, 메타태그), 필요한 열)
		GameRegistry.addSmelting(Blocks.oreRandom, new ItemStack(Items.ingotRandom, 1), 0.1F);
		
		BellCraft.AddLog("Furnace Recipe register complete.");
	}
}
