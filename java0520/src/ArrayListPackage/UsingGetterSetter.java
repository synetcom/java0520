package ArrayListPackage;

public class UsingGetterSetter {
	private String firstName;
	private String lastName;
//	these two lines are field
//	Data Hiding or Encapsulation 

	public String getFirstName() {
		return firstName;
	}

//getter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
//	setter

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
