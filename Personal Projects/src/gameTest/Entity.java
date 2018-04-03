package gameTest;

import java.util.HashSet;
import gameTest.EntityTemplate.ComponentTemplate;

public class Entity
{
	
	public class Component
	{
		public Component(ComponentTemplate comTemplate)
		{
			
		}
	}
	
	public class CapeColor extends Component
	{
		public ComponentTemplateCapeColor capeColorTemplate;
		
		public CapeColor(ComponentTemplate capeColor) 
		{
			super(capeColor);
			capeColorTemplate = (ComponentTemplateCapeColor) capeColor;
			System.out.println("Sucess! My cape color is: " + capeColorTemplate.str);
		}	
	}
	
//	public class BodyComponent extends Component
//	{
//		
//	}
//	
//	public class BehaviorComponent extends Component
//	{
//		
//	}
	
	private HashSet<Component> components = new HashSet<>();
	
	public Entity(EntityTemplate template)
	{
		for(ComponentTemplate el : template.componentTemplates)
		{
			switch (el.getClass().getSimpleName())
			{
			case "ComponentTemplateCapeColor" :
				CapeColor component = new CapeColor(el);
				components.add(component);
				break;
			default :
				System.err.println("I don't have a Component Template switch case for: "+ el);
				break;
				
			}
		}
	}
}