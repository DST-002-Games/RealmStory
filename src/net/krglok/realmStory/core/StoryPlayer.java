package net.krglok.realmStory.core;

import java.util.HashMap;

public class StoryPlayer 
{
	protected String uuid;
	protected String playerName;
	protected StoryRefList activeStory;
	protected StoryRefList activeStep;
	protected StoryRefList grantedList;

	protected Boolean isUser;
	protected String firstLogin;
	protected String lastLogin;
	protected String lastposition;
	protected String lastLogOff;
	
	
	public StoryPlayer()
	{
		isUser		= false;
		firstLogin  = "";
		lastLogin	= "";
		lastposition= "";
		lastLogOff  = "";
		activeStory	= new StoryRefList();
		activeStep  = new StoryRefList();
		grantedList = new StoryRefList();
	}
	
	public StoryPlayer(String uuid, String playerName, Boolean isUser, String firstLogin )
	{
		this.uuid		= uuid;
		this.playerName = playerName;
		this.isUser		= isUser;
		this.firstLogin  = firstLogin;
		this.lastLogin	= "";
		this.lastposition= "";
		this.lastLogOff  = "";
		activeStory	= new StoryRefList();
		activeStep  = new StoryRefList();
		grantedList = new StoryRefList();
	}
	
	
}
