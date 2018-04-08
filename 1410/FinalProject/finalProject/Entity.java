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
				componentSet.add(attributes);
				componentSet.add(body);
				componentSet.add(cClass);
				componentSet.add(savingThrows);
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
