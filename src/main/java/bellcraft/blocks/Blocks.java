package bellcraft.blocks;

import bellcraft.core.BellCraft;
import bellcraft.items.Items;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks {
	public static Block oreRandom = new BlockOre("Random");
	
	
	public static void registerBlocks()
	{
		GameRegistry.registerBlock(Blocks.oreRandom, "oreRandom");
		
		BellCraft.AddLog("Block register complete.");
	}
}
