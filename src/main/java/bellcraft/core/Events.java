package bellcraft.core;

import net.minecraft.util.ChatComponentTranslation;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class Events {
	
	public static void registerEvents()
	{
		MinecraftForge.EVENT_BUS.register(new Events());
		FMLCommonHandler.instance().bus().register(new Events());
		
		BellCraft.AddLog("Event register complete.");
	}
	
	@SubscribeEvent
	public void PlayerLoggedIn(PlayerLoggedInEvent event) // 플레이어 로그인 이벤트 발생시
	{
		event.player.addChatMessage(new ChatComponentTranslation("Text.WelcomeBellCraft"));
		//event.player.setDead(); // 죽이기!
	}
}
