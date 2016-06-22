package net.krglok.realmStory.core;

import java.util.HashMap;

public class StoryRefList extends  HashMap<Integer,Integer>
{
	private static final long serialVersionUID = 3494203773806466128L;
	private static int ID = 0;
	
	public StoryRefList()
	{
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


	public Integer findRef(int refId)
	{
		for (Integer ref : values())
		{
			if (ref == refId)
			{
				return ref;
			}
		}
		
		return -1;
	}
	
	public boolean checkRefId(int refId)
	{
		for (Integer ref : values())
		{
			if (ref == refId)
			{
				return true;
			}
		}
		
		return false;
	}
	
}
