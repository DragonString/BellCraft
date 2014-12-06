package bellcraft.blocks;

import bellcraft.core.BellCraft;
import bellcraft.core.Config;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks {
	public static Block oreRandom = new BlockOre("Random");
	
	
	public static void registerBlocks()
	{
		if (Config.enableRandomOre)
		{
			GameRegistry.registerBlock(Blocks.oreRandom, "oreRandom");
		}
		
		BellCraft.AddLog("Block register complete.");
	}
}
