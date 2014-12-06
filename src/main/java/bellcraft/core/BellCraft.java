package bellcraft.core;

import net.minecraft.creativetab.CreativeTabs;
import bellcraft.server.Commands;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = BellCraft.MODID, version = BellCraft.VERSION)
public class BellCraft {
	public static final String MODID = "BellCraft";
	public static final String VERSION = "1.0.0.7a";
	
	public static CreativeTabs tab;	
	@EventHandler
	public void Initialize(FMLInitializationEvent event) //초기화
	{
		AddLog("Initialize");
		if (Config.enableBellCraft)
		{
			tab = new CreativeTab();
			Registry.register(event);
		} else {
			AddLog("Bell Craft is disabled");
		}
	}
	
	@EventHandler
	public void PreInitialize(FMLPreInitializationEvent event)
	{
		BellCraft.AddLog("PreInitialize");
		Registry.register(event); // 레지스터
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
