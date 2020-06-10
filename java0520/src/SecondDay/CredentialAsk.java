package SecondDay;

import java.util.Scanner;

/*
You will ask three times, if your answer is correct, it shows "You
are logged in and stops, if the answer is not correct, then it
shows "your account is locked"
 */
public class CredentialAsk {

	public static void main(String[] args) {
//		String password = "Ilove123";
		String password = new String("Ilove123");
		int counter = 0;
		do {
			System.out.println("Password: ");
			Scanner input = new Scanner(System.in);
			String answer = input.nextLine();
			if (password.equals(answer)) {
				System.out.println("You are logged in");
				break;
			} else {
				if (counter == 2) {
					System.out.println("Your password is wrong");
					System.out.println("Your account is locked.");
				} else {
					System.out.println("Your password is wrong");
				}
				counter++;
			}
		} while (counter < 3);

//		for (int i = 0; i < 3; i++) {
//			System.out.println("Password: ");
//			Scanner input = new Scanner(System.in);
//			String answer = input.nextLine();
//			if (password.equals(answer)) {
//				System.out.println("You are logged in");
//				return;
//			} else {
//				System.out.println("Your password is wrong");
//			}
//
//		}

//		System.out.println("Your account is locked.");

	}

}
