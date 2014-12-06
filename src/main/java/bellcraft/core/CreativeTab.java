package bellcraft.core;

import bellcraft.blocks.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {
	public CreativeTab()
	{
		super("tabBellCraft"); // 크리에이티브 탭 ID설정
	}
	
	@Override
	public Item getTabIconItem()
	{
		if (Config.enableRandomOre)
		{
			return Item.getItemFromBlock(Blocks.oreRandom); // 크리에이티브탭 아이콘 설정
		} else {
			return Item.getItemFromBlock(net.minecraft.init.Blocks.quartz_block);
		}
	}
}
