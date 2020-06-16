package Encapsulation;

public class UsingGetterSetter {
	private String firstName;
	private String lastName;

	UsingGetterSetter() {
		System.out.println("This one also created defualt constructor");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
