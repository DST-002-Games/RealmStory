package net.krglok.realmStory.core;

/**
 * 
 */

import java.util.Collection;
import java.util.HashMap;

public class StoryStepList extends HashMap<Integer, StoryStep> 
{
	private static final long serialVersionUID = 1L;
	private static int ID = 0;
	

	public StoryStepList()
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
		for (StoryStep sStep : this.values())
		{
			if (sStep.stepName.contains(name))
			{
				 subList.addStoryStep(sStep);
			}
		}
		return subList;
	}
	
	/**
	 * Holt eine Liste der Steps, die alle zur gleichen Story gehoeren
	 * Die Liste ist nicht sortiert
	 * 
	 * @param storyId
	 * @return
	 */
	public StoryStepList getStorySteps(int storyId)
	{
		StoryStepList subList = new StoryStepList();
		for (StoryStep sStep : this.values())
		{
			if (sStep.storyId == storyId)
			{
			  subList.addStoryStep(sStep);
			}
		}
		return subList;
	}
	
	/**
	 * Holt den naechsten Step zur stepId.
	 * Prueft ob beide zur gleichen Story gehoeren.
	 * 
	 * @param stepId
	 * @return nextStoryStep
	 */
	public StoryStep findNextStep(int stepId )
	{
		StoryStep nextStep = null;
		StoryStep actualStep = getStoryStep(stepId);
		if (actualStep.nextStep > 0)
		{
			nextStep = getStoryStep(actualStep.nextStep);
			if (nextStep.storyId == actualStep.storyId)
			{
				return nextStep;
			}
		}
		return null;
	}
	
	public StoryStepList getRefList(Collection<Integer> refList)
	{
		StoryStepList subList = new StoryStepList();
		
		for (Integer ref : refList)
		{
			StoryStep item = getStoryStep(ref);
			if (item != null)
			{
				subList.addStoryStep(item);
			}
		}
		
		return subList;
	}
	
}
