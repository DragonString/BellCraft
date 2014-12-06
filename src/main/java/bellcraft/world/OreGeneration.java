package bellcraft.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import bellcraft.blocks.Blocks;
import bellcraft.core.BellCraft;
import bellcraft.core.Config;

public class OreGeneration implements IWorldGenerator {
	
	public static void registerOre() {
		if (Config.enableRandomOreGen)
		{
			GameRegistry.registerWorldGenerator(new OreGeneration(), 1); // 광물 생성 메서드
		}
		
		BellCraft.AddLog("Ore register complete.");
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId) // 디멘션 ID 받아오기
		{
		case -1: // 지옥
			break;
		case 0: // 오버월드
			generateOverworld(world, random, chunkX * 16, chunkZ * 16); // 광물 생성
			break;
		case 1: // 엔더드래곤
			break;
		}
	}
	
	private void generateOverworld(World world, Random random, int x, int z)
	{
		for (int i = 0; i < 2; i++) // i 최댓값 = 광물 희기성
		{
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(150);
			int chunkZ = z + random.nextInt(16);			
			
			new WorldGenMinable(Blocks.oreRandom, 3).generate(world, random, chunkX, chunkY, chunkZ);
		}
	}
}
