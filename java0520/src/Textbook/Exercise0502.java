package Textbook;

import java.util.Scanner;

public class Exercise0502 {

	public static void main(String[] args) {
		// (int)(Math.random() * 15) + 1 (0 through 14 add 1)
		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = " ";
		Scanner input = new Scanner(System.in);

		while (count < NUMBER_OF_QUESTIONS) {
//			Generate two random numbers from 1 through 15
			int number1 = 1 + (int) (Math.random() * 15);
			int number2 = 1 + (int) (Math.random() * 15);

//		Prompt the users to answer "WHat is number1 + number2
			System.out.println("What is " + number1 + " + " + number2 + "?");
			int answer = input.nextInt();

//			Grade the answer and display the result
			if (number1 + number2 == answer) {
				System.out.println("You are correct");
				correctCount++;
			} else
				System.out.println(
						"Your answer is wrong. \n " + number1 + " + " + number2 + "should be " + (number1 + number2));

//				Increase the count
			count++;
			output += "\n" + number1 + " + " + number2 + " = " + answer
					+ ((number1 + number2 == answer) ? " Correct" : " wrong");

		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println(
				"Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds \n" + output);
	}

}
