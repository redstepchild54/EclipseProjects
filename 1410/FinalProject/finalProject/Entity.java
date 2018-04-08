package finalProject;

import java.util.HashSet;
import java.util.Hashtable;

public class Entity {

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

	private void initialize(EntityTemplate template, PClass pClass) {
		myTemplate = template;
		for (ComponentTemplate el: template.componentTemplates)
		{
			switch(el.getComponentTemplateName())
			{
			case PLAYERCHARACTER:
				ComponentAttributes attributes = new ComponentAttributes(el, pClass);
				ComponentBody body = new ComponentBody(el, pClass, attributes);
				ComponentClass cClass = new ComponentClass(el, pClass);
				ComponentSavingThrows savingThrows = new ComponentSavingThrows(el, pClass, attributes);
				ComponentLevel level = new ComponentLevel(el, 1);
				ComponentXP xp = new ComponentXP(el, 0);
				
				ComponentRace race = null;
				ComponentSize size = null;
				
				for(ComponentTemplate raceEl: template.componentTemplates)
				{
					switch (raceEl.getComponentTemplateName())
					{
					case RACEDWARF:
						race = new ComponentRace(raceEl, Race.DWARF, attributes);
						size = new ComponentSize(raceEl, Size.MEDIUM);
						break;
					case RACEELF:
						race = new ComponentRace(raceEl, Race.ELF, attributes);
						size = new ComponentSize(raceEl, Size.MEDIUM);
						break;
					case RACEHUMAN:
						race = new ComponentRace(raceEl, Race.HUMAN, attributes);
						size = new ComponentSize(raceEl, Size.MEDIUM);
						break;
					default:
						break;
					}
				}
				
				componentSet.add(attributes);
				componentSet.add(body);
				componentSet.add(cClass);
				componentSet.add(savingThrows);
				componentSet.add(race);
				componentSet.add(level);
				componentSet.add(xp);
				componentSet.add(size);
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
