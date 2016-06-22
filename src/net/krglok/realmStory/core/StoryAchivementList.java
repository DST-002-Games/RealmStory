package net.krglok.realmStory.core;

import java.util.Collection;
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
	
	/**
	 * speichert das Achivement in der Liste, wenn den Namen noch nicht gibt
	 * 
	 * @param storyAchivement
	 */
	public int addStoryAchivement(StoryAchivement storyAchivement)
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
		StoryAchivement item = getStoryAchivement(storyAchivement.AchivementName);
		if (item == null)
		{
			storyAchivement.AchivementId  = key;
			this.put(key, storyAchivement);
			return key;
		}else
		{
			return 0;
		}
	}
	
	
	/**
	 * Suchtdas Achivement mit der Id
	 * 
	 * @param id
	 * @return
	 */
	public StoryAchivement getStoryAchivement(int id)
	{
		if (this.containsKey(id))
		{
			return get(id);
		}
		return null;
	}
	
	/**
	 * Sucht ein Achivement mit dem Namen
	 * @param name
	 * @return
	 */
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
	
	/**
	 * Sucht alle Achivements die den String innerhalb des Namens haben
	 *  
	 * @param name
	 * @return gefundenes StoryAchivementList oder nil
	 */
	public StoryAchivementList searchStoryAchivement(String word)
	{
		StoryAchivementList subList = new StoryAchivementList();
		for (StoryAchivement sEvent : this.values())
		{
			if (sEvent.AchivementName .contains(word))
			{
				 subList.addStoryAchivement(sEvent) ;
			}
		}
		return subList;
	}

	
	public StoryAchivementList getRefList(Collection<Integer> refList)
	{
		StoryAchivementList subList = new StoryAchivementList();
		
		for (Integer ref : refList)
		{
			StoryAchivement item = getStoryAchivement(ref);
			if (item != null)
			{
				subList.addStoryAchivement(item);
			}
		}
		
		return subList;
	}
	
}
