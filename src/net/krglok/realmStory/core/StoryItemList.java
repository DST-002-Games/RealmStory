package net.krglok.realmStory.core;

import java.util.HashMap;

import net.krglok.realmStory.common.Item;

/**
 * <pre>
 * Die StoryItem werden ueber den Namen verwaltet.
 * Nicht ueber das Material.
 *
 * @author olaf.duda
 * @create 01.04.2016
 *
 *</pre>
 */
public class StoryItemList extends HashMap<String, StoryItem> 
{

	private static final long serialVersionUID = 1L;

	protected int itemCount;
	
	public StoryItemList()
	{
		itemCount = 0;
	}
	
	/**
	 * add item to the list
	 * if exist values are  add to exiting items
	 * @param item
	 */
	public boolean addStoryItem(StoryItem item)
	{
		if (this.containsKey(item.ItemRefData()))
		{
			Item exist = this.get(item.ItemRefData());
			exist.setValue(exist.value()+item.value());
		} else
		{
			this.put(item.ItemRefData(), item);
		}
		itemCount = itemCount + item.value();
//		Item item = new Item(itemRef, iValue);
		return true;
	}
	
	/**
	 * add item to the list
	 * if exist values are  overwrite
	 * @param itemRef
	 * @param iValue
	 * @return added item or null
	 */
	public boolean addStoryItem(String name, String itemRef, int data, int iValue)
	{
		if (this.containsKey(name))
		{
			Item exist = this.get(name);
			exist.setItemRef(itemRef);
			exist.setData(data);
			exist.setValue(iValue);
		} else
		{
			this.put(name, new StoryItem(name,itemRef, data, iValue)); 
		}
		itemCount = itemCount + iValue;
//		Item item = new Item(itemRef, iValue);
		return true;
	}
	
	/**
	 * add value to the item in the list
	 * if not exist add item
	 * @param itemRef
	 * @param iValue
	 * @return
	 */
	public Item addValue(String name, int iValue)
	{
		Item item;
		if (this.containsKey(name))
		{
			item = this.get(name);
			item.setValue(item.value()+iValue);
			itemCount = itemCount + iValue;
			return item; 
		}
		return null;
	}
	
	/**
	 * 
	 * @param itemRef
	 * @return
	 */
	public Item getStoryItem(String name)
	{
		return this.get(name);
	}
		
	
	
	
}
