package ObjectMethod;

public class User1Main {

	public static void main(String[] args) {
		User1 obj1 = new User1();
		obj1.firstName = "Paul";
		obj1.lastName = "Newman";

		String message = obj1.fullName();
		System.out.println(message);

	}

}
