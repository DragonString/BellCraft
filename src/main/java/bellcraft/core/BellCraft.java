package bellcraft.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import bellcraft.blocks.Blocks;
import bellcraft.items.Items;
import bellcraft.server.Commands;
import bellcraft.world.OreGeneration;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = BellCraft.MODID, version = BellCraft.VERSION)
public class BellCraft {
	public static final String MODID = "BellCraft";
	public static final String VERSION = "1.0.0.4a";
	
	public static CreativeTabs tab = new CreativeTab();	
	@EventHandler
	public void Initialize(FMLInitializationEvent event) //초기화
	{
		AddLog("Initialize");
	}
	
	@EventHandler
	public void PreInitialize(FMLPreInitializationEvent event)
	{
		BellCraft.AddLog("PreInitialize");
		Registry.register(); // 레지스터
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		BellCraft.AddLog("Server Load");
		event.registerServerCommand(new Commands());;
	}
	
	public static void AddLog(String str)
	{
		System.out.println("[Bell Craft] " + str);
	}
}
