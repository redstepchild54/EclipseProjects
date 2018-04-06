package finalProject;

import java.util.Hashtable;

/**
 * The Entity Factory is the class that has the ability to create any entity. 
 * The constructor of the EntityFactory, sets up all the EntityTemplates and the Component Templates that correspond 
 * @author William McConnell
 *
 */

public class EntityFactory {

	private Hashtable<EntityTemplateName, EntityTemplate> entityTemplates = new Hashtable<>();
	
	public EntityFactory()
	{
		entityTemplates.clear();
		
		EntityTemplate playerCharacterDwarf = new EntityTemplate();
		ComponentTemplatePlayerCharacter playerCharacter = new ComponentTemplatePlayerCharacter();
		playerCharacterDwarf.componentTemplates.add(playerCharacter);
		entityTemplates.put(EntityTemplateName.PLAYERCHARACTERDWARF, playerCharacterDwarf);
	}
	
	public Entity produceEntity(EntityTemplateName key)
	{
		
		if (entityTemplates.containsKey(key))
		{
			EntityTemplate template = entityTemplates.get(key);
			Entity entity = new Entity(template);
			return entity;
		}
		else
			System.err.println("There are no current EntityTemplates stored by the name:" + key);
		return null;
	}
	
	public Entity produceEntity(EntityTemplateName key, PClass pClass)
	{
		return null;
	}
	
}
