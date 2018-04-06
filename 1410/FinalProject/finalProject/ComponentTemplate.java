package finalProject;

public abstract class ComponentTemplate {

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
