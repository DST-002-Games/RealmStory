package net.krglok.realmStory.core;

import java.util.HashMap;

/**
 * 
 * @author Windu
 * @create 01.04.2016
 * <pre>
 * description:
 *
 * </pre>
 */
public class StoryAchivementList extends  HashMap<Integer, StoryAchivement>
{
	
	private static final long serialVersionUID = 1L;
	private static int ID = 0;

	public StoryAchivementList()
	{
		super();
		this.initID(0);
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
	
	public void addStoryObject(StoryAchivement storyAchivement)
	{
		int key = storyAchivement.AchivementId;
		if (key < 1)
		{
			ID++;
		}
		while(this.containsKey(key))
		{
			key = ID++;
		}
		StoryAchivement sEvent = getStoryAchivement(storyAchivement.AchivementName);
		if (sEvent == null)
		{
			storyAchivement.AchivementId  = key;
			this.put(key, storyAchivement);
		}
	}
	
	
	
	public StoryAchivement getStoryAchivement(int id)
	{
		if (this.containsKey(id))
		{
			return get(id);
		}
		return null;
	}
	
	public StoryAchivement getStoryAchivement(String name)
	{
		for (StoryAchivement sEvent :values())
		{
			if (sEvent.AchivementName.equalsIgnoreCase(name))
			{
				return sEvent;
			}
		}
		return null;
	}
	
	public StoryAchivementList findStoryObject(String name)
	{
		StoryAchivementList subList = new StoryAchivementList();
		for (StoryAchivement sEvent : this.values())
		{
			if (sEvent.AchivementName .contains(name))
			{
				 subList.addStoryObject(sEvent) ;
			}
		}
		return subList;
	}
	
}
