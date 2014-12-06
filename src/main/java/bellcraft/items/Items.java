package bellcraft.items;

import bellcraft.core.BellCraft;
import bellcraft.core.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class Items {
	public static Item RandomBoxTier1 = new ItemRandomBox("RandomBoxTier1", "You can get a Tier 1 items.");
	public static Item RandomBoxTier2 = new ItemRandomBox("RandomBoxTier2", "You can get a Tier 2 items.");
	public static Item RandomBoxTier3 = new ItemRandomBox("RandomBoxTier3", "You can get a Tier 3 items.");
	public static Item RandomBoxTier4 = new ItemRandomBox("RandomBoxTier4", "You can get a Tier 4 items.");
	
	public static Item ingotRandom = new ItemIngot("Random", "You can get a Random Box.");
	
	public static Item dustRandom = new ItemDust("Random", "This random dust.");
	
	public static Item nuggetRandom = new ItemDust("Random", "This random nugget.");
	
	public static void registerItems()
	{
		if (Config.enableRandomBox)
		{
			GameRegistry.registerItem(Items.RandomBoxTier1, "RandomBoxTier1");
			GameRegistry.registerItem(Items.RandomBoxTier2, "RandomBoxTier2");
			GameRegistry.registerItem(Items.RandomBoxTier3, "RandomBoxTier3");
			GameRegistry.registerItem(Items.RandomBoxTier4, "RandomBoxTier4");
		}
		if (Config.enableRandomIngot)
		{
			GameRegistry.registerItem(Items.ingotRandom, "ingotRandom");
		}
		GameRegistry.registerItem(Items.dustRandom, "dustRandom");
		GameRegistry.registerItem(Items.nuggetRandom, "nuggetRandom");
		
		BellCraft.AddLog("Item register complete.");
	}
}
