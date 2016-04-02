package net.krglok.realmStory.core;

import java.util.ArrayList;
import java.util.List;

import net.krglok.realmStory.common.Item;

/**
 * 
 * <pre>
 * Die StoryItem werden ueder den Namen verwaltet.
 * Der Name ist eine unique text referenz.
 * Zusätzlich kann ein Material angegeben werden.
 * Nur wenn das Material korrekt, kann das Item im Spiel erstellt werden.
 * 
 * Die StringList lore wird auf das Item geschhrieben, wenn das Item 
 * als Itemstack erzeugt wird.
 *
 * @author olaf.duda
 * @create 01.04.2016
 *
 *</pre>
 */
public class StoryItem extends Item 
{
	protected String name;
	ArrayList<String> lore; // = new ArrayList<String>(); 

	
	public StoryItem()
	{
		this.name = "";
		this.lore = new ArrayList<String>(); 
	}
	
	public StoryItem(String name,String itemRef, int data, int value )
	{
		super(itemRef, data, value);
		this.name = name;
	}

	public StoryItem(String name,String itemRef, int data, int value, ArrayList<String> lore )
	{
		super(itemRef, data, value);
		this.name = name;
		this.lore = lore;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String value)
	{
		this.name = value;
	}
	
	
	public ArrayList<String> getLore()
	{
		return lore;
	}
	
	public void setLore(ArrayList<String> values)
	{
		this.lore = values;
	}
	
	public void addLore(String value)
	{
		lore.add(value);
	}
	
	public void addallLore(ArrayList<String> values)
	{
		for (String value : values)
		{
			this.lore.add(value);
		}
		
	}
	
}
