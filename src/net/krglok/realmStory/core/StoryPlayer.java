package net.krglok.realmStory.core;

import java.util.HashMap;

public class StoryPlayer 
{
	protected String uuid;
	protected String playerName;
	protected HashMap<Integer, Story> activeStory;
	protected HashMap<Integer, StoryStep> activeStep;
	protected HashMap<Integer, StoryAchivement> resultList;

	public Boolean isUser;
	public String firstLogin;
	public String lastLogin;
	public String lastposition;
	public String lastLogOff;
	
}
