package Textbook;

import java.util.Scanner;

public class Exercise0516 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		int index = 2;

		// Find the smallest factors in ascending order
		while (number / index != 1) {
			if (number % index == 0) {
				System.out.print(index + ", ");
				number /= index;
			} else {
				index++;
			}

		}
		System.out.println(number + ".");
	}

}
