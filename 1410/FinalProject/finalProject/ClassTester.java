package finalProject;

public class ClassTester {

	public static void main(String[] args) {
		
		Properties properties = new Properties(PClass.WIZARD);
		
		
		
		System.out.println(PClass.WIZARD);
		System.out.println(properties.attributes.toString());
		System.out.println();
		System.out.println(properties.savingThrow.toString());
		System.out.println();
		System.out.println(properties.body.toString());
	}
}
