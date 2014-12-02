package bellcraft.server;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;

public class Commands implements ICommand { // ICommand 구현
	private List aliases; // 명령어를 저장할 리스트 선언
	
	public Commands()
	{
		this.aliases = new ArrayList(); // 명령어 배열 인스턴스 생성
		this.aliases.add("bc");
		this.aliases.add("bellcraft");
	}
	
	@Override
	public int compareTo(Object arg0)
	{
		return 0;
	}
	
	@Override
	public String getCommandName() // 명령어 이름 가져옴
	{
		return "bellcraft";
	}
	
	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) // 명령어 사용법 가져옴
	{
		return "bc <Text>";
	}
	
	@Override
	public List getCommandAliases() // 명령어 리스트를 가져옴
	{
		return this.aliases;
	}
	
	@Override
	public void processCommand(ICommandSender icommandsender, String[] argString) // 명령어 처리 함수
	{
		if (icommandsender instanceof EntityPlayer) // 명령어 센더가 플레이어일때
		{
			EntityPlayer player = (EntityPlayer) icommandsender; // 센더 객체생성
			if (argString.length == 0) // 입력된 추가 인자가 없다면
			{
				player.addChatMessage(new ChatComponentTranslation(player.getGameProfile().getName() + "님 반갑습니다."));
			} else { // 추가 인자 입력시
				player.addChatMessage(new ChatComponentTranslation("추가 인자 입력감지 : " + argString[0]));
			}
		}
	}
	
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_)
	{
		return true;
	}
	
	@Override
	public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_)
	{
		return null;
	}
	
	@Override
	public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_)
	{
		return false;
	}
}
