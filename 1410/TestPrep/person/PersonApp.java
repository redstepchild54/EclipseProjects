package person;

public class PersonApp {
	public static void main(String[] args) {
		
		Address address = new Address("Street 123", 87654, "HomeTown", "UT");
		Person person = new Person ("Tara", "Rice", address);
		
		System.out.println(person);
		
		address.setCity("Moab");
		address.setZip(84532);
		person.setAddress(address);
		
		System.out.println(person);
		
	}
}
