package entityProjectTest;

public class Properties {
	
	public static Attributes attributes;
	public static Body body;
	public static SavingThrow savingThrow;
	
	public Properties(PClass pClass)
	{
		attributes = new Attributes(pClass);
		body = new Body(pClass, attributes);
		savingThrow = new SavingThrow(pClass, attributes);
	}

}
