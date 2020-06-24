package Textbook;

import java.util.Scanner;

public class Exercise0546 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String string = input.nextLine();

		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse += string.charAt(i);
		}

		System.out.println("The reversed string is " + reverse);
		if (string.equals(reverse))
			System.out.println("That's a palindrome");
		else
			System.out.println("That's not a palindrome");
	}

}
