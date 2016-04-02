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
public class StoryAktionList extends StoryObjectList
{
	
	private static final long serialVersionUID = 1L;

	public StoryAktionList()
	{
		super();
		this.initID(0);
	}

	public StoryAktion getStoryAktion(int id)
	{
		return (StoryAktion) this.getStoryObject(id);
	}
	
	public StoryAktion getStoryAktion(String name)
	{
		return (StoryAktion) getStoryObject(name);
	}
	
}
