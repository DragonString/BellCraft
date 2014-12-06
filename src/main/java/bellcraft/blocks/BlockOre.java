package bellcraft.blocks;

import java.util.Random;

import bellcraft.core.BellCraft;
import bellcraft.items.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockOre extends Block {
	
	@SideOnly(Side.CLIENT) // 클라이언트에서만 작동
	private IIcon icon;
	private final String customUnlocalizedName;
	
	public BlockOre(String arg1)
	{
		super(Material.rock); // 돌 재질의 블럭으로 설정
		customUnlocalizedName = arg1; // 블럭 이름 받아옴
		setHardness(2.0F); // 아이템 강도
		setLightLevel(0.95F); // 블럭 밝기 (0 ~ 1.0 / 1.0일시 용암밝기)
		setLightOpacity(0); // 블럭 투명도 (낮으면 불투명)
		setStepSound(Block.soundTypeStone); // 설치 및 그 위를 달렸을때 나는소리 설정
		setBlockName("ore" + customUnlocalizedName); // 블럭 이름 설정
		setHarvestLevel("pickaxe", 1); // 철 곡괭이 이상등급으로만 캐짐
		setCreativeTab(BellCraft.tab); // 크리에이티브탭 지정
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return BellCraft.MODID + ".ore" + customUnlocalizedName; // 다들 아시는 아이템 이름 설정 메소드
	}
	
	@Override
	public void registerBlockIcons(IIconRegister register)
	{
		icon = register.registerIcon(BellCraft.MODID + ":ore" + customUnlocalizedName); // 블럭 아이콘 지정 ore[이름].png 형식
	}
	
	@Override
	@SideOnly(Side.CLIENT) // 클라에서만 작동함
	public IIcon getIcon(int side, int meta)
	{
		return icon;
	}
	
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return Items.ingotRandom; // 광석 부술시 인곳으로 나오게함
    }
}
