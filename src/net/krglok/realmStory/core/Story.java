package net.krglok.realmStory.core;

import java.util.HashMap;

import net.krglok.realmStory.common.MessageList;

public class Story 
{
	protected int storyId;
	protected String storyName;
	protected int startStep;
	protected MessageList storyStartText;
	protected HashMap<Integer,String> requiredStep;
	protected HashMap<Integer,String> requiredPerm;
	protected HashMap<Integer,String> grantedPerm;

	protected int endStep;
	protected MessageList StoryEndText;
	
	
	public Story()
	{
		storyId = 0;
		storyName = "";
		startStep = 0;
		storyStartText = new MessageList();
		requiredStep = new HashMap<Integer,String>();
		requiredPerm = new HashMap<Integer,String>();
		grantedPerm  = new HashMap<Integer,String>();
	}
	
}
