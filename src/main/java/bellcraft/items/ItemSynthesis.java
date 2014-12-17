package bellcraft.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.oredict.OreDictionary;
import bellcraft.core.BellCraft;

public class ItemSynthesis extends Item {
	private final String customUnlocalizedName;
	private final String customName;
	private String itemcategory;
	
	public ItemSynthesis(String itemname, String itemdata, String itemcategory, int stacksize, boolean registerore, CreativeTabs tab)
	{
		super();
		setCreativeTab(BellCraft.tab); // 방울크래프트 탭에 아이템 추가
		customUnlocalizedName = itemname; // 아이템명 받아옴
		customName = itemdata; // 아이템 정보 받아옴
		setMaxStackSize(stacksize);
		this.itemcategory = itemcategory;
		if (registerore)
			OreDictionary.registerOre(itemcategory + customUnlocalizedName, this); // 오어 딕셔너리 등록
	}
	
	public ItemSynthesis(String itemname, String itemdata, String itemcategory, int stacksize, boolean registerore)
	{
		this(itemname, itemdata, itemcategory, stacksize, registerore, BellCraft.tab);
	}
	
	public ItemSynthesis(String itemname, String itemdata, String itemcategory, int stacksize)
	{
		this(itemname, itemdata, itemcategory, stacksize, false, BellCraft.tab);
	}
	
	public ItemSynthesis(String itemname, String itemdata, String itemcategory, boolean registerore)
	{
		this(itemname, itemdata, itemcategory, 64, registerore, BellCraft.tab);
	}
	
	public ItemSynthesis(String itemname, String itemdata, String itemcategory)
	{
		this(itemname, itemdata, itemcategory, 64, false, BellCraft.tab);
	}
	
	public ItemSynthesis(String itemname, String itemdata, int stacksize)
	{
		this(itemname, itemdata, "item", stacksize, false, BellCraft.tab);
	}
	
	public ItemSynthesis(String itemname, String itemdata)
	{
		this(itemname, itemdata, "item", 64, false, BellCraft.tab);
	}
	
	public ItemSynthesis(String itemname)
	{
		this(itemname, null, "item", 64, false, BellCraft.tab);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return BellCraft.MODID + "." + itemcategory + customUnlocalizedName;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item)
	{
		return BellCraft.MODID + "." + itemcategory + customUnlocalizedName;
	}
	
	@Override
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(BellCraft.MODID + ":" + itemcategory + customUnlocalizedName);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4)
	{
		if (customName != null)
			list.add(EnumChatFormatting.AQUA + customName); // 아이템 정보 등록, 앞은 글씨 색
	}
}
