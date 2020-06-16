package Encapsulation;

public class UsingGetterSetterMain {

	public static void main(String[] args) {
		UsingGetterSetter user = new UsingGetterSetter();
		user.setFirstName("Steve");
		user.setLastName("Jobs");
		System.out.println(user.getFirstName() + " " + user.getLastName());
	}

}
