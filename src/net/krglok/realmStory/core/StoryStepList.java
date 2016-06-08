package net.krglok.realmStory.core;

import java.util.HashMap;

public class StoryStepList extends HashMap<Integer, StoryStep> 
{
	private static final long serialVersionUID = 1L;
	private static int ID = 0;
	
	protected int startStep ;
	protected int endStep;

	public StoryStepList()
	{
		startStep = 0;
		endStep = 0;
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
	
	
	
	/**
	 * fuegt einen StoryAktion zur Liste hinzu
	 * - die <id> wird vergeben, wenn der Wert < 1 ist
	 * - die <id> darf nicht in der Liste vorhanden sein oder wird neu vergeben
	 * - der Name darf nicht in der Liste vorhanden sein. 
	 * 
	 * @param storyEvent
	 */
	public void addStoryStep(StoryStep storyObject)
	{
		int key = storyObject.stepId;
		if (key < 1)
		{
			ID++;
		}
		while(this.containsKey(key))
		{
			key = ID++;
		}
		StoryStep sEvent = getStoryStep(storyObject.stepName);
		if (sEvent != null)
		{
			storyObject.stepName = storyObject.stepName+"_"+String.valueOf(key);
		}
		storyObject.stepId = key;
		this.put(key, storyObject);
	}
	
	public StoryStep getStoryStep(int id)
	{
		if (this.containsKey(id))
		{
			return get(id);
		}
		return null;
	}
	
	public StoryStep getStoryStep(String name)
	{
		for (StoryStep sEvent :values())
		{
			if (sEvent.stepName.equalsIgnoreCase(name))
			{
				return sEvent;
			}
		}
		return null;
	}
	
	public StoryStepList findStoryObject(String name)
	{
		StoryStepList subList = new StoryStepList();
		for (StoryStep sEvent : this.values())
		{
			if (sEvent.stepName.contains(name))
			{
				 subList.addStoryStep(sEvent);
			}
		}
		return subList;
	}
	
}
