package Textbook;

import java.util.Scanner;

public class Exercise0501 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//	Initialize or define variable
		int positives = 0; // count all positives
		int negatives = 0; // counting all negatives
		int count = 0; // counting the numbers
		double total = 0; // total

		System.out.println("Enter an integer, the input ends when it is 0: ");
		int number = input.nextInt();

		if (number == 0) {
			System.out.println("No numbers are entered except 0");
//			return;
			System.exit(1);
		}

		while (number != 0) { // Test for sentinel value (0)
			if (number > 0)
				positives++; // Increase positives
			else
				negatives++; // Increase negatives
			total += number;
			count++;
			number = input.nextInt();
		}

		// calculate the average
		double average = total / count;

		// output
		System.out.println("The number of positives is " + positives + "\nThe numbers of negatives is " + negatives
				+ "\nThe total is " + total + "\nThe average is " + average);

	}
}
