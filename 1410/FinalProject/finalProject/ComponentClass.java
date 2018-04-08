package finalProject;

public class ComponentClass extends Component {

	PClass pClass;
	
	public ComponentClass(ComponentTemplate componentTempate, PClass pClass) 
	{
		super(componentTempate);
		this.pClass = pClass;
		
	}

	@Override
	public String toString() {
		return pClass.toString();
	}

	public PClass getpClass() {
		return pClass;
	}

}
