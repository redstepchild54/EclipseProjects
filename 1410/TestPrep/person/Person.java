package person;

public class Person {

	private String firstName;
	private String lastName;
	private Address address;
	
	Person(String fName, String lName, Address a)
	{
		firstName = fName;
		lastName = lName;
		address = a;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + address;
	}
	
}
