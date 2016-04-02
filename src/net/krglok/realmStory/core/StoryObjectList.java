package net.krglok.realmStory.core;

import java.util.HashMap;

public class StoryObjectList extends HashMap<Integer, StoryObject> 
{
	private static final long serialVersionUID = 1L;
	private static int ID = 0;

	public StoryObjectList()
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
	
	
	
	/**
	 * fuegt einen StoryAktion zur Liste hinzu
	 * - die <id> wird vergeben, wenn der Wert < 1 ist
	 * - die <id> darf nicht in der Liste vorhanden sein oder wird neu vergeben
	 * - der Name darf nicht nicht in der List evorhanden sein. 
	 * 
	 * @param storyEvent
	 */
	public void addStoryObject(StoryObject storyObject)
	{
		int key = storyObject.id;
		if (key < 1)
		{
			ID++;
		}
		while(this.containsKey(key))
		{
			key = ID++;
		}
		StoryObject sEvent = getStoryObject(storyObject.name);
		if (sEvent == null)
		{
			storyObject.id = key;
			this.put(key, storyObject);
		}
	}
	
	public StoryObject getStoryObject(int id)
	{
		if (this.containsKey(id))
		{
			return get(id);
		}
		return null;
	}
	
	public StoryObject getStoryObject(String name)
	{
		for (StoryObject sEvent :values())
		{
			if (sEvent.name.equalsIgnoreCase(name))
			{
				return sEvent;
			}
		}
		return null;
	}
	
	public StoryObject findStoryObject(String name)
	{
		for (StoryObject sEvent : this.values())
		{
			if (sEvent.name.contains(name))
			{
				return sEvent;
			}
		}
		return null;
	}
	
}
