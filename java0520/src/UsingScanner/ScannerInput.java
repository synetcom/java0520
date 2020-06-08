package UsingScanner;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");

		String firstName = input.nextLine();
		System.out.println("Hi nice to meet you, " + firstName);
		input.close();
	}

}
