package bellcraft.items;

import java.util.List;

import bellcraft.core.BellCraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.oredict.OreDictionary;

public class ItemIngots extends Item {
	
	private final String customUnlocalizedName;
	private final String customName;
	
	public ItemIngots(String arg1, String arg2)
	{
		super();
		setCreativeTab(BellCraft.tab); // 방울크래프트 탭에 아이템 추가
		customUnlocalizedName = arg1; // 아이템명 받아옴
		customName = arg2; // 아이템 정보 받아옴
		OreDictionary.registerOre("ingot" + customUnlocalizedName, this); // 오어 딕셔너리 등록
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return BellCraft.MODID + ".ingot" + customUnlocalizedName;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item)
	{
		return BellCraft.MODID + ".ingot" + customUnlocalizedName;
	}
	
	@Override
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(BellCraft.MODID + ":ingot" + customUnlocalizedName);
	}
	
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4)
	{
		list.add(EnumChatFormatting.AQUA + customName); // 아이템 정보 등록, 앞은 글씨 색
	}
	
}
