package finalProject;

import java.io.Serializable;

public abstract class ComponentTemplate implements Serializable{

	protected ComponentTemplateName componentTemplateName;
	
	public ComponentTemplate()
	{
		setComponentTemplateName();
	}
	
	public abstract void setComponentTemplateName();
	public ComponentTemplateName getComponentTemplateName()
	{
		return componentTemplateName;
	}
}
