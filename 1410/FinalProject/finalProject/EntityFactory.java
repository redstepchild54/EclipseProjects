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
		
		
		ComponentTemplatePlayerCharacter playerCharacter = new ComponentTemplatePlayerCharacter();
		
		EntityTemplate playerCharacterDwarf = new EntityTemplate();
		ComponentTemplateRaceDwarf raceDwarf = new ComponentTemplateRaceDwarf();
		playerCharacterDwarf.componentTemplates.add(playerCharacter);
		playerCharacterDwarf.componentTemplates.add(raceDwarf);
		entityTemplates.put(EntityTemplateName.PLAYERCHARACTERDWARF, playerCharacterDwarf);
		
		EntityTemplate playerCharacterElf = new EntityTemplate();
		ComponentTemplateRaceElf raceElf = new ComponentTemplateRaceElf();
		playerCharacterElf.componentTemplates.add(playerCharacter);
		playerCharacterElf.componentTemplates.add(raceElf);
		entityTemplates.put(EntityTemplateName.PLAYERCHARACTERELF, playerCharacterElf);
		
		EntityTemplate playerCharacterHuman = new EntityTemplate();
		ComponentTemplateRaceHuman raceHuman = new ComponentTemplateRaceHuman();
		playerCharacterHuman.componentTemplates.add(playerCharacter);
		playerCharacterHuman.componentTemplates.add(raceHuman);
		entityTemplates.put(EntityTemplateName.PLAYERCHARACTERHUMAN, playerCharacterHuman);
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
			System.err.println("There are no current EntityTemplates stored by the name: " + key);
		return null;
	}
	
	public Entity produceEntity(EntityTemplateName key, PClass pClass)
	{
		
		if (entityTemplates.containsKey(key))
		{
			EntityTemplate template = entityTemplates.get(key);
			Entity entity = new Entity(template, pClass);
			return entity;
		}
		else
			System.err.println("There are no current EntityTemplates stored by the name: " + key);
		return null;
	}
	
}
