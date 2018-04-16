package finalProject;

import java.io.Serializable;
import java.util.HashSet;

public class EntityTemplate implements Serializable
{
	
	public EntityTemplate()
	{
		
	}
	
	public HashSet<ComponentTemplate> componentTemplates = new HashSet<>();
	
}