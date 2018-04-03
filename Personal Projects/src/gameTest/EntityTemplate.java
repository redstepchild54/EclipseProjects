package gameTest;

import java.util.HashSet;

public class EntityTemplate
{
	
	public EntityTemplate()
	{
		
	}
	
	public abstract static class ComponentTemplate
	{
		
	}
	
	public HashSet<ComponentTemplate> componentTemplates = new HashSet<>();
	
}