package Textbook;

import java.util.Scanner;

public class Exercise0514 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("First number");
		int n1 = input.nextInt();
		System.out.println("First number");
		int n2 = input.nextInt();

		int gcd = n1 < n2 ? n1 : n2;

		while (n1 % gcd != 0 || n2 % gcd != 0) {
			gcd--;
		}
		System.out.println("Greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
	}

}
