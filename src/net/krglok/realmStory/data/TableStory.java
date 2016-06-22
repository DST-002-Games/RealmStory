package net.krglok.realmStory.data;

/**
 * <pre>
 * This is a SQLite version for store Storyobject in a SQL Table
 *  * create tables and indices  on given definition
 * use PRIMARY KEY as Integer
 * the table structure is predefined
 * - column 0 = Integer ID  = storyId
 * - column 1 = Text 	Name = storyName
 * - column 1 = Integer Enabled = used as Boolean 0=False 1=True
 * - column 2 = Text    Section = other object data in YML Format
 *   
 * 
 * the YML data stored in YML-format in the text-field Section
 * the YML formatted and extracted with the configfile class from Bukkit

 * @author Windu
 * </pre>
 * 
 */

import java.util.HashMap;

import net.krglok.realmStory.common.MessageList;
import net.krglok.realmStory.common.SQliteConnection;
import net.krglok.realmStory.common.TableData;

public class TableStory extends TableData 
{

	public TableStory(SQliteConnection sql, String tableName) 
	{
		super(sql, tableName);
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * <pre>
	 * fields: 
		"ID",
		"Section",
	 * indices:
		tablename+"_idx1",
	 * indexfields:
		"ID",
	 * 
	 * @param tablename
	 * </pre>
	 */
	public void makeDefaultDefinitions(String tablename)
	{
		this.tablename = tablename;
		this.fieldnames = new String[] 
		{  
			"ID",
			"Section"
		};
		this.fieldtypes = new String[]
		{
				"INTEGER",
				"TEXT"
				
		};
		this.indexnames = new String[]
		{
			tablename+"_idx1"
		};
		this.indexfields = new String[]
			{  
				"ID"
			};
	}
	
}
