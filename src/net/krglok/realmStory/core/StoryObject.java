package net.krglok.realmStory.core;

import net.krglok.realmStory.common.MessageList;

public abstract class StoryObject
{
	protected int id;
	protected int sortnr;
	protected String name;
	protected MessageList hinweis;
	
	public StoryObject()
	{
		this.id = -1;
		this.name = "";
		this.hinweis = new MessageList();
		
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getSortnr()
	{
		return sortnr;
	}

	public void setSortnr(int sortnr)
	{
		this.sortnr = sortnr;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public MessageList getHinweis()
	{
		return hinweis;
	}

	public void setHinweis(MessageList hinweis)
	{
		this.hinweis = hinweis;
	}
	
	

}
