package finalProject;

public class ComponentPClass extends Component {

	PClass pClass;
	
	public ComponentPClass(ComponentTemplate componentTempate, PClass pClass) 
	{
		super(componentTempate);
		this.pClass = pClass;
		
	}

	public PClass getpClass() {
		return pClass;
	}
	
	@Override
	public String toString() {
		return pClass.toString();
	}
}
