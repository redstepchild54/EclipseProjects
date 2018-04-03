package gameTest;

import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import gameTest.EntityTemplate.ComponentTemplate;

public class EntityFactory {
	
	private Hashtable<String, EntityTemplate> entityTemplates = new Hashtable<>();
	
	public EntityFactory()
	{
		entityTemplates.clear();
		
		EntityTemplate batman = new EntityTemplate();
		ComponentTemplateCapeColor batmanCape = new ComponentTemplateCapeColor("Black");
		batman.componentTemplates.add(batmanCape);
		entityTemplates.put("Batman", batman);
		
		EntityTemplate robin = new EntityTemplate();
		ComponentTemplateCapeColor robinCape = new ComponentTemplateCapeColor("Yellow");
		robin.componentTemplates.add(robinCape);
		entityTemplates.put("Robin", robin);
	}
	
	public Entity ProduceEntity(String key)
	{
		
		if(entityTemplates.containsKey(key))
		{
			EntityTemplate template = entityTemplates.get(key);
			Entity ent = new Entity(template);
			return ent;
		}
		else
		{
			System.err.println("Aint no such template by the name :" + key);
		}
		
		return null;
	}
	
}


