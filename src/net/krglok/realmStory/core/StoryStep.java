package net.krglok.realmStory.core;


/**
 * 
 * <pre> 
 * beinhaltet die Daten fuer einen Story Event. 
 * Die propertys werden in der Datenbank persistent gespeichert.
 * Die Texte des StoryStep werden in ein Book geschrieben und an den
 * player gegeben.
 * 
 * 
 * @author olaf.duda
 * @create 08.06.2016
 * </pre>
 */

import java.util.HashMap;

import net.krglok.realmStory.common.MessageList;

public abstract class StoryStep
{
	protected int storyId;
	protected int stepId;
	protected int sortnr;
	protected String stepName;
	protected MessageList stepText;
	protected HashMap<Integer,String> requiredStep;
	protected HashMap<Integer,String> requiredPerm;
	protected HashMap<Integer,String> grantedPerm;
	protected String resultAchivement;
	protected String actionName;
	protected String actionType;
	protected String actionStatus;
	protected int nextStep;
	protected Boolean isAutoStep;
	
	public StoryStep()
	{
		this.stepId = -1;
		this.stepName = "";
		this.stepText = new MessageList();
		requiredStep = new HashMap<Integer,String>();
		requiredPerm = new HashMap<Integer,String>();
		grantedPerm  = new HashMap<Integer,String>();
		resultAchivement	= "";
		actionName = "";;
		actionType = "";
		actionStatus = "";
		nextStep = 0;
		isAutoStep = true;
		
	}

	public int getId()
	{
		return stepId;
	}

	public void setId(int id)
	{
		this.stepId = id;
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
		return stepName;
	}

	public void setName(String name)
	{
		this.stepName = name;
	}

	public MessageList getHinweis()
	{
		return stepText;
	}

	public void setHinweis(MessageList hinweis)
	{
		this.stepText = hinweis;
	}
	
	

}
