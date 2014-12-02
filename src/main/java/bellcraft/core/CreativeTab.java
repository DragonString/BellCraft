package bellcraft.core;

import bellcraft.items.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {
	public CreativeTab()
	{
		super("tabBellCraft"); // 크리에이티브 탭 ID설정
	}
	
	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(Blocks.quartz_block); // 크리에이티브탭 아이콘 설정
	}
}
