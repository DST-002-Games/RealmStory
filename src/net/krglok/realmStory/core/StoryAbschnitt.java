package net.krglok.realmStory.core;

import java.util.HashMap;

import net.krglok.realmStory.common.MessageList;

/**
 * 
 * @author Windu
 * @create 01.04.2016
 * <pre>
 * description:
 *
 * </pre>
 */
public class StoryAbschnitt extends StoryObject
{
	protected HashMap<Integer, Integer> aktionLinks;
	protected HashMap<Integer, Integer> locationLinks;
	protected HashMap<Integer, Integer> buchLinks;
	protected HashMap<Integer, Integer> itemLinks;
	
	
	
	public StoryAbschnitt()
	{
		super();
		aktionLinks = new HashMap<Integer, Integer>();
		locationLinks = new HashMap<Integer, Integer>();
		buchLinks = new HashMap<Integer, Integer>();
		itemLinks = new HashMap<Integer, Integer>();
	}

}
