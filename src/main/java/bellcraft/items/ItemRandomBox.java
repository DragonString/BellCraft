package bellcraft.items;

import java.util.List;
import java.util.Random;

import bellcraft.core.BellCraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemRandomBox extends Item {
	private final String customUnlocalizedName;
	private final String customName;
	
	public ItemRandomBox(String arg1, String arg2)
	{
		super();
		setCreativeTab(BellCraft.tab); // 방울크래프트 탭에 아이템 추가
		setMaxStackSize(1); // 아이템을 한칸에 최대 한개씩 가질 수 있게한다.
		customUnlocalizedName = arg1; // 아이템명 받아옴
		customName = arg2; // 아이템 정보 받아옴
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return BellCraft.MODID + ".item" + customUnlocalizedName; //아이템 고유이름 지정
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item)
	{
		return BellCraft.MODID + ".item" + customUnlocalizedName; //아이템 고유이름 지정 
	}
	
	@Override
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(BellCraft.MODID + ":Item" + customUnlocalizedName); //아이템의 이미지 경로지정
	}
	
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4)
	{
		list.add(EnumChatFormatting.AQUA + customName); // 아이템 정보 등록, 앞은 글씨 색
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par3EntityPlayer.inventory.setInventorySlotContents(par3EntityPlayer.inventory.currentItem, randomItem()); // 아이템 교환
				
		return super.onItemRightClick(par1ItemStack, par2World, par3EntityPlayer);
	}
	
	private ItemStack randomItem()
	{
		Random r = new Random();
		int i = r.nextInt(1000); // 0~999 까지의 랜덤 정수 생성
		
		if(i == 0)
		{
			return new ItemStack(net.minecraft.init.Items.diamond_pickaxe, 1);
		} else if (i < 100) {
			return new ItemStack(net.minecraft.init.Items.arrow, 32);		
		} else if (i < 200) {
			return new ItemStack(net.minecraft.init.Items.bed, 1);
		} else if (i < 300) {
			return new ItemStack(net.minecraft.init.Items.beef, 32);
		} else if (i < 400) {
			return new ItemStack(net.minecraft.init.Items.boat, 1);
		} else if (i < 500) {
			return new ItemStack(net.minecraft.init.Items.book, 32);
		} else if (i < 600) {
			return new ItemStack(net.minecraft.init.Items.bread, 32);
		} else if (i < 650) {
			return new ItemStack(net.minecraft.init.Items.bucket, 8);
		} else if (i < 700) {
			return new ItemStack(net.minecraft.init.Items.cake, 8);
		} else if (i < 800) {
			return new ItemStack(net.minecraft.init.Items.apple, 32);
		} else {
			return new ItemStack(net.minecraft.init.Items.baked_potato, 32);
		}
	}
}
