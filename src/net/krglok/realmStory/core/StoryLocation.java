package net.krglok.realmStory.core;

import java.util.HashMap;

import net.krglok.realmStory.common.LocationData;

/**
 * 
 * @author Windu
 * @create 01.04.2016
 * <pre>
 * description:
 *
 * </pre>
 */
public class StoryLocation extends StoryStep
{
	protected LocationData position;
	protected HashMap<Integer, Integer> aktionLinks;
	protected HashMap<Integer, Integer> buchLinks;
	protected HashMap<Integer, Integer> itemLinks;

	public StoryLocation()
	{
		super();
		position = new LocationData("", 0.0, 0.0, 0.0);
		aktionLinks = new HashMap<Integer, Integer>();
		buchLinks = new HashMap<Integer, Integer>();
		itemLinks = new HashMap<Integer, Integer>();
	}
	
}
