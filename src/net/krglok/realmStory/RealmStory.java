package net.krglok.realmStory;

import java.util.logging.Logger;

import net.krglok.realmStory.common.MessageData;
import net.krglok.realmStory.command.CommandList;
import net.krglok.realmStory.data.ConfigData;
import net.krglok.realmStory.data.DataStore;
import net.milkbowl.vault.economy.Economy;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class RealmStory extends JavaPlugin 
{
	private Logger log = Logger.getLogger("Minecraft"); 
	private final MessageData messageData = new MessageData();
	protected FileConfiguration configFile;	
	private ConfigData configData; // = new ConfigData(this);
	public ServerListener serverListener; // = new ServerListener(this);
	private final CommandList commandList = new CommandList(this);
	private DataStore data; 
	
	protected Economy economy;

	/**
	 * the logger has status relevant out ERROR, WARNING, INFO etc. 
	 * @return the logger 
	 */
	public Logger getLog()
	{
		return log;
	}

	/**
     * necessary for Command.run()
     * 
     * @return
     */
    public Economy economy()
    {
    	return this.economy;
    }

    /**
     * necessary for Command.run()
     * @return
     */
    public MessageData getMessageData()
    {
    	return this.messageData;
    }
    
    /**
     * necessary for Command.run()
     * @return
     */
    public ConfigData getConfigData()
    {
    	return configData;
    }
    
    /**
     * necessary for Command.run()
     * @return
     */
    public String getVersion()
    {
    	return this.getDescription().getVersion();
    }
    
    public CommandList commandList()
    {
    	return commandList;
    }
    
    public DataStore getData()
    {
    	return data;
    }


}
