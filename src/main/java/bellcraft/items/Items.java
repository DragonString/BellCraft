package bellcraft.items;

import bellcraft.core.BellCraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentStyle;

public class Items {
	public static Item RandomBoxTier1 = new ItemRandomBox("RandomBoxTier1", "당신은 1단계 아이템을 얻을 수 있습니다."); //"You can get a Tier 1 items.");;
	public static Item RandomBoxTier2 = new ItemRandomBox("RandomBoxTier2", "당신은 2단계 아이템을 얻을 수 있습니다."); //"You can get a Tier 2 items.");;
	public static Item RandomBoxTier3 = new ItemRandomBox("RandomBoxTier3", "당신은 3단계 아이템을 얻을 수 있습니다."); //"You can get a Tier 3 items.");;
	public static Item RandomBoxTier4 = new ItemRandomBox("RandomBoxTier4", "당신은 4단계 아이템을 얻을 수 있습니다."); //"You can get a Tier 4 items.");;
	
	public static Item ingotRandom = new ItemIngots("Random", "이 주괴로 랜덤상자를 조합할 수 있습니다.");
	
	
	public static void registerItems()
	{
		GameRegistry.registerItem(Items.RandomBoxTier1, "RandomBoxTier1");
		GameRegistry.registerItem(Items.RandomBoxTier2, "RandomBoxTier2");
		GameRegistry.registerItem(Items.RandomBoxTier3, "RandomBoxTier3");
		GameRegistry.registerItem(Items.RandomBoxTier4, "RandomBoxTier4");
		GameRegistry.registerItem(Items.ingotRandom, "ingotRandom");
		
		BellCraft.AddLog("Item register complete.");
	}
}
