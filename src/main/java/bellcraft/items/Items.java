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
	
	public static Item ingotRandom = new ItemSynthesis("Random", "You can get a Random Box.", "ingot", true);
	public static Item dustRandom = new ItemSynthesis("Random", "This random dust.", "dust", true);
	public static Item nuggetRandom = new ItemSynthesis("Random", "This random nugget.", "nugget", true);
	public static Item BellCredit1 = new ItemSynthesis("BellCredit1", "1 BC", 50);
	public static Item BellCredit2 = new ItemSynthesis("BellCredit2", "10 BC", 50);
	public static Item BellCredit3 = new ItemSynthesis("BellCredit3", "100 BC", 50);
	public static Item BellCredit4 = new ItemSynthesis("BellCredit4", "1,000 BC", 50);
	public static Item BellCredit5 = new ItemSynthesis("BellCredit5", "10,000 BC", 50);
	public static Item BellCredit6 = new ItemSynthesis("BellCredit6", "100,000 BC", 50);
	public static Item BellCredit7 = new ItemSynthesis("BellCredit7", "1,000,000 BC", 50);
	public static Item BellCredit8 = new ItemSynthesis("BellCredit8", "10,000,000 BC", 50);
	public static Item TierCoin1 = new ItemSynthesis("TierCoin1", "1 Tier Coin", 50);
	public static Item TierCoin2 = new ItemSynthesis("TierCoin2", "2 Tier Coin", 50);
	public static Item TierCoin3 = new ItemSynthesis("TierCoin3", "3 Tier Coin", 50);
	public static Item EventCoin = new ItemSynthesis("EventCoin", "Event Coin", 50);
	public static Item RandomCoin = new ItemSynthesis("RandomCoin", "Random Coin", 50);
	public static Item TicketCommon1 = new ItemSynthesis("TicketCommon1", "1 Tier Common Item Ticket", 50);
	public static Item TicketCommon2 = new ItemSynthesis("TicketCommon2", "2 Tier Common Item Ticket", 50);
	public static Item TicketCommon3 = new ItemSynthesis("TicketCommon3", "3 Tier Common Item Ticket", 50);
	public static Item TicketCommon4 = new ItemSynthesis("TicketCommon4", "4 Tier Common Item Ticket", 50);
	public static Item TicketCommon5 = new ItemSynthesis("TicketCommon5", "5 Tier Common Item Ticket", 50);
	public static Item TicketSpecial1 = new ItemSynthesis("TicketSpecial1", "1 Tier Special Item Ticket", 50);
	public static Item TicketSpecial2 = new ItemSynthesis("TicketSpecial2", "2 Tier Special Item Ticket", 50);
	public static Item TicketSpecial3 = new ItemSynthesis("TicketSpecial3", "3 Tier Special Item Ticket", 50);
	public static Item TicketSpecial4 = new ItemSynthesis("TicketSpecial4", "4 Tier Special Item Ticket", 50);
	public static Item TicketSpecial5 = new ItemSynthesis("TicketSpecial5", "5 Tier Special Item Ticket", 50);
	public static Item TicketMachine1 = new ItemSynthesis("TicketMachine1", "1 Tier Machine Item Ticket", 50);
	public static Item TicketMachine2 = new ItemSynthesis("TicketMachine2", "2 Tier Machine Item Ticket", 50);
	public static Item TicketMachine3 = new ItemSynthesis("TicketMachine3", "3 Tier Machine Item Ticket", 50);
	public static Item TicketMachine4 = new ItemSynthesis("TicketMachine4", "4 Tier Machine Item Ticket", 50);
	public static Item TicketMachine5 = new ItemSynthesis("TicketMachine5", "5 Tier Machine Item Ticket", 50);
	public static Item TicketMagic1 = new ItemSynthesis("TicketMagic1", "1 Tier Magic Item Ticket", 50);
	public static Item TicketMagic2 = new ItemSynthesis("TicketMagic2", "2 Tier Magic Item Ticket", 50);
	public static Item TicketMagic3 = new ItemSynthesis("TicketMagic3", "3 Tier Magic Item Ticket", 50);
	public static Item TicketMagic4 = new ItemSynthesis("TicketMagic4", "4 Tier Magic Item Ticket", 50);
	public static Item TicketMagic5 = new ItemSynthesis("TicketMagic5", "5 Tier Magic Item Ticket", 50);
	public static Item TicketRandom1 = new ItemSynthesis("TicketRandom1", "1 Tier Random Item Ticket", 50);
	public static Item TicketRandom2 = new ItemSynthesis("TicketRandom2", "2 Tier Random Item Ticket", 50);
	public static Item TicketRandom3 = new ItemSynthesis("TicketRandom3", "3 Tier Random Item Ticket", 50);
	public static Item TicketRandom4 = new ItemSynthesis("TicketRandom4", "4 Tier Random Item Ticket", 50);
	public static Item TicketRandom5 = new ItemSynthesis("TicketRandom5", "5 Tier Random Item Ticket", 50);
		
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
		GameRegistry.registerItem(Items.BellCredit1, "BellCredit1");
		GameRegistry.registerItem(Items.BellCredit2, "BellCredit2");
		GameRegistry.registerItem(Items.BellCredit3, "BellCredit3");
		GameRegistry.registerItem(Items.BellCredit4, "BellCredit4");
		GameRegistry.registerItem(Items.BellCredit5, "BellCredit5");
		GameRegistry.registerItem(Items.BellCredit6, "BellCredit6");
		GameRegistry.registerItem(Items.BellCredit7, "BellCredit7");
		GameRegistry.registerItem(Items.BellCredit8, "BellCredit8");
		GameRegistry.registerItem(Items.TierCoin1, "TierCoin1");
		GameRegistry.registerItem(Items.TierCoin2, "TierCoin2");
		GameRegistry.registerItem(Items.TierCoin3, "TierCoin3");
		GameRegistry.registerItem(Items.EventCoin, "EventCoin");
		GameRegistry.registerItem(Items.RandomCoin, "RandomCoin");
		GameRegistry.registerItem(Items.TicketCommon1, "TicketCommon1");
		GameRegistry.registerItem(Items.TicketCommon2, "TicketCommon2");
		GameRegistry.registerItem(Items.TicketCommon3, "TicketCommon3");
		GameRegistry.registerItem(Items.TicketCommon4, "TicketCommon4");
		GameRegistry.registerItem(Items.TicketCommon5, "TicketCommon5");
		GameRegistry.registerItem(Items.TicketSpecial1, "TicketSpecial1");
		GameRegistry.registerItem(Items.TicketSpecial2, "TicketSpecial2");
		GameRegistry.registerItem(Items.TicketSpecial3, "TicketSpecial3");
		GameRegistry.registerItem(Items.TicketSpecial4, "TicketSpecial4");
		GameRegistry.registerItem(Items.TicketSpecial5, "TicketSpecial5");
		GameRegistry.registerItem(Items.TicketMachine1, "TicketMachine1");
		GameRegistry.registerItem(Items.TicketMachine2, "TicketMachine2");
		GameRegistry.registerItem(Items.TicketMachine3, "TicketMachine3");
		GameRegistry.registerItem(Items.TicketMachine4, "TicketMachine4");
		GameRegistry.registerItem(Items.TicketMachine5, "TicketMachine5");
		GameRegistry.registerItem(Items.TicketMagic1, "TicketMagic1");
		GameRegistry.registerItem(Items.TicketMagic2, "TicketMagic2");
		GameRegistry.registerItem(Items.TicketMagic3, "TicketMagic3");
		GameRegistry.registerItem(Items.TicketMagic4, "TicketMagic4");
		GameRegistry.registerItem(Items.TicketMagic5, "TicketMagic5");
		GameRegistry.registerItem(Items.TicketRandom1, "TicketRandom1");
		GameRegistry.registerItem(Items.TicketRandom2, "TicketRandom2");
		GameRegistry.registerItem(Items.TicketRandom3, "TicketRandom3");
		GameRegistry.registerItem(Items.TicketRandom4, "TicketRandom4");
		GameRegistry.registerItem(Items.TicketRandom5, "TicketRandom5");
		
		BellCraft.AddLog("Item register complete.");
	}
}
