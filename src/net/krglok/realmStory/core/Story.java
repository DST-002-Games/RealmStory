package net.krglok.realmStory.core;

import java.util.HashMap;

import net.krglok.realmStory.common.MessageList;

public class Story 
{
	protected int storyId;
	protected String storyName;
	protected int startStep;
	protected int endStep;
	protected MessageList storyStartText;
	protected HashMap<Integer,String> requiredStep;
	protected HashMap<Integer,String> requiredPerm;
	protected HashMap<Integer,String> grantedPerm;
	protected MessageList storyEndText;
	protected MessageList overviewText;
	protected Boolean isPublic;
	protected StoryStepList stepList;
	


	public Story()
	{
		storyId = 0;
		storyName = "";
		startStep = 0;
		endStep	  = 0;
		isPublic  = true;
		storyStartText = new MessageList();
		storyEndText = new MessageList();
		overviewText = new MessageList();
		requiredStep = new HashMap<Integer,String>();
		requiredPerm = new HashMap<Integer,String>();
		grantedPerm  = new HashMap<Integer,String>();
		stepList = new StoryStepList();
	}



	public int getStoryId()
	{
		return storyId;
	}



	public void setStoryId(int storyId)
	{
		this.storyId = storyId;
	}



	public String getStoryName()
	{
		return storyName;
	}



	public void setStoryName(String storyName)
	{
		this.storyName = storyName;
	}



	public int getStartStep()
	{
		return startStep;
	}



	public void setStartStep(int startStep)
	{
		this.startStep = startStep;
	}



	public int getEndStep()
	{
		return endStep;
	}



	public void setEndStep(int endStep)
	{
		this.endStep = endStep;
	}



	public MessageList getStoryStartText()
	{
		return storyStartText;
	}



	public void setStoryStartText(MessageList storyStartText)
	{
		this.storyStartText = storyStartText;
	}



	public HashMap<Integer, String> getRequiredStep()
	{
		return requiredStep;
	}



	public void setRequiredStep(HashMap<Integer, String> requiredStep)
	{
		this.requiredStep = requiredStep;
	}



	public HashMap<Integer, String> getRequiredPerm()
	{
		return requiredPerm;
	}



	public void setRequiredPerm(HashMap<Integer, String> requiredPerm)
	{
		this.requiredPerm = requiredPerm;
	}



	public HashMap<Integer, String> getGrantedPerm()
	{
		return grantedPerm;
	}



	public void setGrantedPerm(HashMap<Integer, String> grantedPerm)
	{
		this.grantedPerm = grantedPerm;
	}



	public MessageList getStoryEndText()
	{
		return storyEndText;
	}



	public void setStoryEndText(MessageList storyEndText)
	{
		this.storyEndText = storyEndText;
	}



	public MessageList getOverviewText()
	{
		return overviewText;
	}



	public void setOverviewText(MessageList overviewText)
	{
		this.overviewText = overviewText;
	}



	public Boolean getIsPublic()
	{
		return isPublic;
	}



	public void setIsPublic(Boolean isPublic)
	{
		this.isPublic = isPublic;
	}
	
	
	public StoryStepList getStepList()
	{
		return stepList;
	}



	public void setStepList(StoryStepList stepList)
	{
		this.stepList = stepList;
	}

	
	
}
