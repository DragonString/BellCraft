package bellcraft.items;

import java.util.List;
import java.util.Random;

import bellcraft.core.BellCraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
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
		setMaxStackSize(64); // 아이템을 한칸에 최대 한개씩 가질 수 있게한다.
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
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4)
	{
		list.add(EnumChatFormatting.AQUA + customName); // 아이템 정보 등록, 앞은 글씨 색
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (!par2World.isRemote)
		{
			Item item = par3EntityPlayer.inventory.getCurrentItem().getItem(); // 들고있는 아이템 정보 가져옴
			if (par3EntityPlayer.inventory.addItemStackToInventory(randomItem(item))) // 랜덤 아이템 증정 성공시
			{
				--par1ItemStack.stackSize; // 들고있는 랜덤박스 한개를 소모함
				par3EntityPlayer.inventoryContainer.detectAndSendChanges(); // 서버에서 변경된 값을 클라에 전달해줌
			} else { // 아이템 증정 실패시 (인벤 풀)
				BellCraft.AddLog("인벤 꽉참");
			}
		}
		return par1ItemStack; // 수정된 아이템 값을 리턴해줌
	}
	
	@Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.block;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 72000;
    }

	private ItemStack randomItem(Item item)
	{
		ItemStack[] itemlist = {new ItemStack(net.minecraft.init.Items.arrow, 1)};
		Random r = new Random();
		BellCraft.AddLog("니미럴 시벌탱 : " + itemlist.length);
		
		if (item == Items.RandomBoxTier1)
		{
			BellCraft.AddLog("시벌것 배열 추가한다잉?");
			itemlist[0] = new ItemStack(net.minecraft.init.Items.apple, 1);
			itemlist[1] = new ItemStack(net.minecraft.init.Items.blaze_rod, 1);
			BellCraft.AddLog("배열렝스" + itemlist.length);
			itemlist[itemlist.length] = new ItemStack(net.minecraft.init.Items.bed, 1);
			BellCraft.AddLog("시벌것 배열 추가됬다잉!");
		}
		else if (item == Items.RandomBoxTier2)
		{
			itemlist[itemlist.length] = new ItemStack(net.minecraft.init.Items.beef, 3);
		}
		else if (item == Items.RandomBoxTier3)
		{
			itemlist[itemlist.length] = new ItemStack(net.minecraft.init.Items.bread, 2);
		}
		else if (item == Items.RandomBoxTier4)
		{
			itemlist[itemlist.length] = new ItemStack(net.minecraft.init.Items.diamond_pickaxe, 1);
		}
		
		BellCraft.AddLog("니미럴 시벌탱2 : " + itemlist.length);
		int i = r.nextInt(itemlist.length);
		BellCraft.AddLog("시벌것 랜덤 수 : " + i);
		return itemlist[i];
	}
}
