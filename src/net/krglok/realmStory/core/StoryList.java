package net.krglok.realmStory.core;

import java.util.HashMap;

public class StoryList extends HashMap<Integer, Story> 
{
	private static final long serialVersionUID = -5959232754425545917L;
	private static int ID = 0;

	public StoryList()
	{
		
	}
	
	public void initID(int value)
	{
		ID = value;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public int getNextID()
	{
		ID++;
		return ID;
	}

	public void addStory(Story story)
	{
		int key = story.storyId;
		if (key < 1)
		{
			ID++;
		}
		while(this.containsKey(key))
		{
			key = ID++;
		}
		Story sEvent = getStory(story.storyName);
		if (sEvent != null)
		{
			story.storyName = story.storyName+"_"+String.valueOf(key);
		}
		story.storyId = key;
		this.put(key, story);
	}
	
	public Story getStory(int id)
	{
		if (this.containsKey(id))
		{
			return get(id);
		}
		return null;
	}
	
	public Story getStory(String name)
	{
		for (Story sEvent :values())
		{
			if (sEvent.storyName.equalsIgnoreCase(name))
			{
				return sEvent;
			}
		}
		return null;
	}
	
	public StoryList findStoryObject(String name)
	{
		StoryList subList = new StoryList();
		for (Story sEvent : this.values())
		{
			if (sEvent.storyName.contains(name))
			{
				 subList.addStory(sEvent);
			}
		}
		return subList;
	}
	
	
}
