package bellcraft.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import bellcraft.blocks.Blocks;
import bellcraft.core.BellCraft;

public class OreGeneration implements IWorldGenerator {
	
	public static void registerOre() {
		GameRegistry.registerWorldGenerator(new OreGeneration(), 1); // 광물 ?��?��?��?��?�� ?��벤트 ?���?
		
		BellCraft.AddLog("Ore register complete.");
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId) // ?��멘션 ID 받아?��
		{
		case -1: // �??��
			break;
		case 0: // ?��버월?��
			generateOverworld(world, random, chunkX * 16, chunkZ * 16); // 광물 ?��?��
			break;
		case 1: // ?��?��?��?���?
			break;
		}
	}
	
	private void generateOverworld(World world, Random random, int x, int z)
	{
		for (int i = 0; i < 2; i++) // i 최�?값�? 광물 ?�� ?���?
		{
			int chunkX = x + random.nextInt(16); // 광물?��?�� ?��같�? 광물?�� 붙어?��?�� ?���? x�?
			int chunkZ = z + random.nextInt(16); // ?��?? 마찬�?�? z�?
			int chunkY = random.nextInt(150); // 광물 ?�� ?��?�� (Y 150 미만 무작?�� ?��?��?��)
			
			new WorldGenMinable(Blocks.oreRandom, 50).generate(world, random, chunkX, chunkY, chunkZ);
		}
	}
}
