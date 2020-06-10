package SecondDay;

import java.util.Scanner;

public class SecondClass {

	public static void main(String[] args) {
		FirstClass object1 = new FirstClass();

		Scanner input = new Scanner(System.in);
		System.out.println("First Name: ");
		object1.firstName = input.nextLine();
		System.out.println("Last Name: ");
		object1.lastName = input.nextLine();
		System.out.println(object1.getFullName());
		input.close();
	}

}
