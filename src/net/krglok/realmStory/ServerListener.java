/**
 * @author Windu
 * @create 25.03.2016
 *
 */
package net.krglok.realmStory;


import net.krglok.realmStory.common.RealmsPermission;


import org.bukkit.ChatColor;
import org.bukkit.Material;

import java.util.logging.Level;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * @author Windu
 * @create 25.03.2016
 * <pre>
 * description:
 *
 * </pre>
 */
public class ServerListener implements Listener
{
	private RealmStory plugin;

	public ServerListener(RealmStory plugin)
	{
		this.plugin = plugin;
	}

	/**
	 * send update check message to ops
	 * @param event
	 */
    @EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerJoin(PlayerJoinEvent event) 
    {
    	//        String IP = player.getAddress().getHostString();

    	if (plugin.isEnabled() == false)
    	{
			event.getPlayer().sendMessage(ChatColor.RED+"Plugin not Enabled !");
    		return;
    	}
    	if (event.getPlayer()== null) return;    	
		if (event.getPlayer().isOp()) 
		{
			if (plugin.getConfigData() == null)
			{
				plugin.getLog().log(Level.WARNING,"[REALMS] event onPlayerJoin, getConfig == null ");
				return;
			}
			
			String msg = "[Realms] Updatecheck : "+plugin.getConfigData().getPluginName()+" Vers.: "+plugin.getConfigData().getVersion();
			plugin.getLog().log(Level.WARNING,msg);
		}
		if (plugin.getConfigData() == null)
		{
			plugin.getLog().log(Level.WARNING,"[REALMS] event onPlayerJoin, getConfig == null ");
			return;
		}

		if ((event.getPlayer().hasPermission(RealmsPermission.USER.getValue()))
			|| (event.getPlayer().hasPermission(RealmsPermission.ADMIN.getValue()))
			|| (event.getPlayer().isOp())
			)
		{
//			if(plugin.getData().getOwners().containUuid(event.getPlayer().getUniqueId().toString()) == false)
//			{
//				if(plugin.getData().getOwners().getOwnerName(event.getPlayer().getName()) == null)
//				{
//					Owner owner = Owner.initDefaultOwner();
//					owner.setIsNPC(false);
//					owner.isUser = true;
//					owner.setPlayerName(event.getPlayer().getName());
//					owner.setUuid(event.getPlayer().getUniqueId().toString());
//					owner.firstLogin = getDateTime();
//					owner.lastLogin = getDateTime();
//					owner.initColonist();
//					plugin.getData().getOwners().addOwner(owner);
//					plugin.getData().writeOwner(owner);
//					event.getPlayer().sendMessage("Owner is inilized for you !");
//	//				event.getPlayer().sendMessage("use /Realms Owner for link to your existing settlements");
//					plugin.getLog().log(Level.INFO,"Owner init for "+event.getPlayer().getName());
//				}
//			} else
//			{
//				Owner owner = plugin.getData().getOwners().getOwner(event.getPlayer().getUniqueId().toString());
//				owner.setIsNPC(false);
//				owner.isUser = true;
//				owner.setPlayerName(event.getPlayer().getName());
//				if (owner.firstLogin == "")
//				{
//					owner.firstLogin = getDateTime();
//				}
//				owner.lastLogin = getDateTime();
//				plugin.getData().writeOwner(owner);
//			}
		} else
		{
//			if(plugin.getData().getOwners().containUuid(event.getPlayer().getUniqueId().toString()) == false)
//			{
//				if(plugin.getData().getOwners().getOwnerName(event.getPlayer().getName()) == null)
//				{
//					Owner owner = Owner.initDefaultOwner();
//					owner.setIsNPC(false);
//					owner.isUser = false;
//					owner.setPlayerName(event.getPlayer().getName());
//					owner.setUuid(event.getPlayer().getUniqueId().toString());
//					owner.firstLogin = getDateTime();
//					owner.lastLogin = getDateTime();
//					plugin.getData().getOwners().addOwner(owner);
//					plugin.getData().writeOwner(owner);
//					event.getPlayer().sendMessage("Player is inilized for you !");
//					plugin.getLog().log(Level.INFO,"Player init for "+event.getPlayer().getName());
//				}
//			} else
//			{
//				Owner owner = plugin.getData().getOwners().getOwner(event.getPlayer().getUniqueId().toString());
//				owner.setIsNPC(false);
//				owner.isUser = false;
//				owner.setPlayerName(event.getPlayer().getName());
//				owner.lastLogin = getDateTime();
//				plugin.getData().writeOwner(owner);
//			}
			
		}
		return; // no OP => OUT
	}

    
    /**
     * handle action on WALL_SIGN, SIGN_POST
     * BLAZEROD and Books
     * @param event
     */
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerInteractEvent(PlayerInteractEvent event)
    {
    	if (event.getPlayer().isOp() == false)
    	{
			if (event.getPlayer().hasPermission(RealmsPermission.ADMIN.getValue().toLowerCase()) == false)
			{
				if (event.getPlayer().hasPermission(RealmsPermission.USER.getValue().toLowerCase()) == false)
				{
					event.getPlayer().sendMessage(ChatColor.RED+"You not have permission realms.user !");
					event.getPlayer().sendMessage(ChatColor.YELLOW+"Contact the OP or ADMIN for setup permission.");
					return ;
				}
			}
    	}
    	Block b = event.getClickedBlock();
    	if (b != null)
    	{
    		
	    	
	    	// Wallsign action
//	    	ArrayList<String> msg = new ArrayList<String>();
	    	if (b.getType() == Material.WALL_SIGN)
	    	{
	    		if (event.getAction() == Action.RIGHT_CLICK_BLOCK)
	    		{
	    	    	if (event.getPlayer().getItemInHand().getType() == Material.BLAZE_ROD)
	    	    	{
//	    	    		cmdRegisterSign(event, b);
	    	    	} else
	    	    	{
	    	    		doWallSign(event, b);
	    	    	}
	    		}
	    		if (event.getAction() == Action.LEFT_CLICK_BLOCK)
	    		{
	    	    	if (event.getPlayer().getItemInHand().getType() == Material.BLAZE_ROD)
	    	    	{
//	    	    		cmdSignUpdate(event, b);
	    	    	} else
	    	    	{
	    	    		doLeftWallSign(event,b);
	    	    	}
	    		}
	    		return;
	    	}
	    	


    	}
    }
    
    private void doWallSign(PlayerInteractEvent event, Block b)
    {
    	
    }
    
    
    private void doLeftWallSign(PlayerInteractEvent event, Block b)
    {
    	
    }
    
    
}
