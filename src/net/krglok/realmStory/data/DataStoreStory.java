package net.krglok.realmStory.data;

import java.util.HashMap;
import net.krglok.realmStory.common.AbstractDataStore;
import net.krglok.realmStory.common.SQliteConnection;
import net.krglok.realmStory.core.Story;
import org.bukkit.configuration.ConfigurationSection;

public class DataStoreStory extends AbstractDataStore<Story> {

	public DataStoreStory(String dataFolder, SQliteConnection sql) {
		super(dataFolder, "npc", "NPCNAME", false, sql);
	}

	/**
	 * Override this for the concrete class
	 * 
	 * @param T dataObject, instance of real data Class
	 */
	@Override
	public void initDataSection(ConfigurationSection section, Story dataObject) {

		section.set("id", dataObject.getId());
		section.set("storyName", dataObject.getStoryName());
		section.set("startStep", dataObject.getStartStep());
		section.set("endStep", dataObject.getEndStep());
		section.set("isPublic", dataObject.isPublic());

		HashMap<Integer, String> values = new HashMap<Integer, String>();

		values = new HashMap<Integer, String>();
		int ref = 0;
		for (String itemref : dataObject.getGrantedPerm().values()) {
			ref++;
			values.put(ref, itemref);
		}
		section.set("grantedPerm", values);

		values = new HashMap<Integer, String>();
		ref = 0;
		for (String itemref : dataObject.getRequiredPerm().values()) {
			ref++;
			values.put(ref, itemref);
		}
		section.set("requiredPerm", values);
		ref = 0;
		for (String itemref : dataObject.getRequiredStep().values()) {
			ref++;
			values.put(ref, itemref);
		}
		section.set("requiredStep", values);
		values = new HashMap<Integer, String>();
		for (int i = 1; i <= dataObject.getOverviewText().size(); i++) {
			values.put(i, dataObject.getOverviewText().get(i));
		}
		section.set("overviewText", values);
		values = new HashMap<Integer, String>();
		for (int i = 1; i <= dataObject.getStoryStartText().size(); i++) {
			values.put(i, dataObject.getStoryStartText().get(i));
		}
		section.set("storyStartText", values);
		values = new HashMap<Integer, String>();
		for (int i = 1; i <= dataObject.getStoryEndText().size(); i++) {
			values.put(i, dataObject.getStoryEndText().get(i));
		}
		section.set("storyEndText", values);

	}

	/**
	 * Override this for the concrete class
	 * 
	 * @return T , real data Class
	 */
	@Override
	public Story initDataObject(ConfigurationSection data) {
		// //
		Story story = new Story();
		story.setId(data.getInt("id"));
		story.setStoryName(data.getString("npcType", "Name(" + String.valueOf(story.getId()) + ")"));
		return story;


	}

}
