package finalProject;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Hashtable;

public class Entity implements Serializable{

	private EntityTemplate myTemplate= null;
	private HashSet<Component> componentSet = new HashSet<>();
	public Hashtable<Class, Component> components = new Hashtable<>();
	
	public Entity(EntityTemplate template)
	{
		initialize(template, PClass.NONE);
	}
	
	public Entity(EntityTemplate template, PClass pClass)
	{
		initialize(template, pClass);
	}

	public Component getComponent(Class key	)
	{
		return components.get(key);
	}
	
	
	private void initialize(EntityTemplate template, PClass pClass) {
		myTemplate = template;
		for (ComponentTemplate el: template.componentTemplates)
		{
			switch(el.getComponentTemplateName())
			{
			case PLAYERCHARACTER:
				ComponentAttributes attributes = new ComponentAttributes(el, pClass);
				ComponentPClass cClass = new ComponentPClass(el, pClass);
				ComponentLevel level = new ComponentLevel(el, 1);
				ComponentXP xp = new ComponentXP(el, 0);
				
				ComponentCharacterDescription characterDescription = null;
				
				ComponentRace race = null;
				ComponentSize size = null;
				
				for(ComponentTemplate raceEl: template.componentTemplates)
				{
					switch (raceEl.getComponentTemplateName())
					{
					case RACEDWARF:
						race = new ComponentRace(raceEl, Race.DWARF, pClass, attributes);
						size = new ComponentSize(raceEl, Size.MEDIUM);
						break;
					case RACEELF:
						race = new ComponentRace(raceEl, Race.ELF, pClass, attributes);
						size = new ComponentSize(raceEl, Size.MEDIUM);
						break;
					case RACEHUMAN:
						race = new ComponentRace(raceEl, Race.HUMAN, pClass, attributes);
						size = new ComponentSize(raceEl, Size.MEDIUM);
						break;
					default:
						break;
					}
				}
				
				characterDescription = new ComponentCharacterDescription(el, pClass, race.getRace());
				ComponentBody body = new ComponentBody(el, pClass, attributes);
				ComponentSavingThrows savingThrows = new ComponentSavingThrows(el, pClass, attributes);
				
				componentSet.add(attributes);
				componentSet.add(body);
				componentSet.add(cClass);
				componentSet.add(savingThrows);
				componentSet.add(race);
				componentSet.add(level);
				componentSet.add(xp);
				componentSet.add(size);
				componentSet.add(characterDescription);
			default:
				break;
			}
		}
		
		for (Component el: componentSet)
		{
			components.put(el.getClass(), el);
		}
	}
}
