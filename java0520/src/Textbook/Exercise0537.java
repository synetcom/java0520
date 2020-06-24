package Textbook;

import java.util.Scanner;

public class Exercise0537 {

	public static void main(String[] args) {
		// String binary =""
		// binary = decimal % 2 + binary;
		// 01101
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int decimal = input.nextInt();

		String binary = "";
		for (int i = decimal; i > 0; i /= 2) {
			binary = (i % 2) + binary;
		}
		System.out.println("The binary value of" + decimal + " is " + binary);
	}

}
