package ThirdDay;

import java.util.Scanner;

public class CheckingValidation {

	public static final int PASSWOD_LENGTH = 8;

	public static void main(String[] args) {
//		int unicodValue = Character.getNumericValue('A');
//		System.out.println(unicodValue);
		/*
		 * ICU(initialization, Condition, Update) for loop
		 * 
		 * Write a java program to check whether the string is valid password
		 * 
		 * Password Rules; - must have at least 8 characters - consists of only letters
		 * and digits - must contain at least two digit numbers and two character, not
		 * symbols
		 * 
		 * 
		 * Password is valid: password Password is not valid : password
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("================================\n" + "1. password should be at least 8 characters.\n"
				+ "2. password should be only letters and characters\n"
				+ "3. It should have at least two digit numbers and two characters\n"
				+ "===============================\n" + "Input a password: ");
		String s = input.nextLine();

		if (is_valid_Password(s)) {
			System.out.println("Password is valid: " + s);
		} else {
			System.out.println("Password is invalid: " + s);
		}

	}

	// Checking the password is valid (Boolean)
	public static boolean is_valid_Password(String password) {
		if (password.length() < PASSWOD_LENGTH)
			return false;

		int charCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);

			if (is_Numeric(ch))
				numCount++;
			else if (is_Letter(ch))
				charCount++;
			else
				return false;
		}
		return (charCount >= 2 && numCount >= 2);
	}

	// Is letter method(boolean)
	public static boolean is_Letter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');

		// A will be 10 in unicode
		// Z will be 35 in unicode
	}

	// checking number(boolean)
	public static boolean is_Numeric(char ch) {
		return (ch >= '0' && ch <= '9');
	}
}
