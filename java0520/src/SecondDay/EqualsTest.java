package SecondDay;

import java.util.Scanner;

/*
You will ask three times, if your answer is correct, it shows "You
are logged in and stops, if the answer is not correct, then it
shows "your account is locked"
 */
public class EqualsTest {

	public static void main(String[] args) {
//		String password = "Ilove123";
		String password = new String("Ilove123");
		System.out.println("Password: ");
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		if (password.equals(answer)) {
			System.out.println("You are logged in");
		} else {
			System.out.println("Your password is wrong");
		}
		input.close();
	}

}
