package net.krglok.realmStory.core;

import java.util.HashMap;



/**
 * 
 * <pre>
 * beinhaltet die Daten fuer einen Story Event. 
 * Die propertys werden in der Datenbank persitsent gespeichert.
 * 
 *
 * @author olaf.duda
 * @create 01.04.2016
 *
 *</pre>
 */
public class StoryAktion extends StoryObject
{
	
	protected HashMap<Integer, Integer> locationLinks;
	protected HashMap<Integer, Integer> buchLinks;
	protected HashMap<Integer, Integer> itemLinks;
	
	public StoryAktion()
	{
		super();
		locationLinks = new HashMap<Integer, Integer>();
		buchLinks = new HashMap<Integer, Integer>();
		itemLinks = new HashMap<Integer, Integer>();
	}
	
	public StoryAktion(int id, String name, String description, String location)
	{
		super();
		locationLinks = new HashMap<Integer, Integer>();
		buchLinks = new HashMap<Integer, Integer>();
		itemLinks = new HashMap<Integer, Integer>();
	}
	

}
