package net.krglok.realmStory.core;

import net.krglok.realmStory.common.MessageList;



/**
 * 
 * <pre>
 * 
 * Die Texte des Achivement werden in ein Book geschrieben und an den
 * player gegeben.
 *
 * @author olaf.duda
 * @create 01.04.2016
 *
 *</pre>
 */
public class StoryAchivement 
{
	protected int AchivementId;
	protected String AchivementName;
	protected MessageList AchivementText;
	protected Boolean isEnabled;
	
	
	
	public StoryAchivement()
	{
		super();
		AchivementId		= 0;
		AchivementName	= "";
		AchivementText	= new MessageList();
		isEnabled	= false;
	}
	
	public StoryAchivement(int id, String name, String stepType, boolean isEnabled
					, String actionName, String actionType )
	{
		super();
		this.AchivementId		= id;
		this.AchivementName	= name;
		this.AchivementText	= new MessageList();
		this.isEnabled	= isEnabled;
	}

	public int getAchivementId()
	{
		return AchivementId;
	}

	public void setAchivementId(int achivementId)
	{
		AchivementId = achivementId;
	}

	public String getAchivementName()
	{
		return AchivementName;
	}

	public void setAchivementName(String achivementName)
	{
		AchivementName = achivementName;
	}

	public MessageList getAchivementText()
	{
		return AchivementText;
	}

	public void setAchivementText(MessageList achivementText)
	{
		AchivementText = achivementText;
	}

	public Boolean getIsEnabled()
	{
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled)
	{
		this.isEnabled = isEnabled;
	}
	
	

}
