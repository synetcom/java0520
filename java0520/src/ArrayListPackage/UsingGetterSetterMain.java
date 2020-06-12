package ArrayListPackage;

public class UsingGetterSetterMain {

	public static void main(String[] args) {
		UsingGetterSetter user = new UsingGetterSetter();
		user.setFirstName("Ariel");
		user.setLastName("Cardoso");
		System.out.println("Today is " + user.getFirstName() + " " + user.getLastName() + "'s Birthday");
	}

}
