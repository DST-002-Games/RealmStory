package net.krglok.realmStory.command;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import net.krglok.realmStory.RealmStory;
import net.krglok.realmStory.common.ConfigBasis;
import net.krglok.realmStory.common.MessageList;
import net.krglok.realmStory.common.aRealmsCommand;

public class CmdRealmStory extends aRealmsCommand 
{

	public CmdRealmStory()
	{
		super(RealmsCommandType.REALMSTORY, RealmsSubCommandType.NONE);
		description = new String[] {
				ChatColor.RED+"command not found , use one of the following ",
//				ChatColor.YELLOW+"/realms [HELP] [page] {String} ",
				ChatColor.GREEN+"/story HELP player command for story management",
				ChatColor.GREEN+"/storyadmin HELP op/admin for story configuration",
		    	" "
				};
	}

	@Override
	public void setPara(int index, String value) 
	{

	}

	@Override
	public void setPara(int index, int value) 
	{

	}

	@Override
	public void setPara(int index, boolean value) 
	{

	}

	@Override
	public void setPara(int index, double value) 
	{

	}

	@Override
	public String[] getParaTypes() 
	{
		return null;
	}

	@Override
	public void execute(RealmStory plugin, CommandSender sender) 
	{
		MessageList msg = new MessageList();
		msg.add(ChatColor.YELLOW+"========================================");
		msg.add(ChatColor.YELLOW+ConfigBasis.PLUGIN_NAME+"  Ver. "+ConfigBasis.CONFIG_VER);
		msg.add(ChatColor.GREEN+"Commandlist :");
		msg.add(ChatColor.GREEN+"/STORY HELP , player command  for story management ");
		msg.add(ChatColor.GREEN+"/STORYADMIN HELP , OP or Admin command for story configure ");
		msg.add(ChatColor.GREEN+"");
		
	}

	@Override
	public boolean canExecute(RealmStory plugin, CommandSender sender) 
	{
		return true;
	}

}
