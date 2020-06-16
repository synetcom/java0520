package Encapsulation;

public class FirstName {
	private String firstName;

	FirstName() {
		System.out.println("The constructor was made");
	}

	public String getFirstName() {
		return "Hi, nice to meet you, " + firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
