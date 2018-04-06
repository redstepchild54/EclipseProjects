package finalProject;

import java.util.HashSet;

public class Entity {

	private HashSet<Component> components = new HashSet<>();
	
	public Entity(EntityTemplate template)
	{
		for (ComponentTemplate el: template.componentTemplates)
		{
			switch(el.getComponentTemplateName())
			{
			case PLAYERCHARACTER:
				break;
			}
		}
	}
	
}
