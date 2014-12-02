package bellcraft.core;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class Config
{
  	public static Configuration bcConfig;
  	public static boolean enableBellCraft;
  	public static boolean enableRandomBox;
	public static boolean enableRandomIngot;
	public static boolean enableRandomOreGen;
	public static boolean enableRandomOre;

	public static void Initialize(FMLPreInitializationEvent event)
  	{
		bcConfig = new Configuration(event.getSuggestedConfigurationFile());
		bcConfig.load();
		
		bcConfig.addCustomCategoryComment("General", "Here you can disable or re-enable any general options you choose.");
		enableBellCraft = bcConfig.get("General", "EnableBellCraft", true).getBoolean(true);
		
		bcConfig.addCustomCategoryComment("Ore Gen Enabled", "Here you can disable or re-enable any ore gen you choose. Change value to false to disable selected ore gen.");
		enableRandomOreGen = bcConfig.get("Ore Gen Enabled", "RandomOreGen", true).getBoolean(true);
		
		bcConfig.addCustomCategoryComment("Blocks Enabled", "Here you can disable or re-enable any blocks you choose. Change value to false to disable selected block.");
		enableRandomOre = bcConfig.get("Blocks Enabled", "RandomOre", true).getBoolean(true);
		
		bcConfig.addCustomCategoryComment("Items Enabled", "Here you can disable or re-enable any items you choose. Change value to false to disable selected item.");
		enableRandomIngot = bcConfig.get("Items Enabled", "RandomIngot", true).getBoolean(true);
		enableRandomBox = bcConfig.get("Items Enabled", "RandomBox", true).getBoolean(true);
			
		bcConfig.save();
		BellCraft.AddLog("Configuration load complete.");
	}
}