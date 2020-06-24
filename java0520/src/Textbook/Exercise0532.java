package Textbook;

import java.util.Scanner;

public class Exercise0532 {

	public static void main(String[] args) {
		// if else
		// Math.random() * 10 lottery1 lottery2
		// $10,000(two numbers) $3,000(two numbers, but different location) $1,000(only
		// one number)

		// guess1 guess /10
		// guess2 guess %10

//		Create two lottery numbers
		int lotteryDigit1, lotteryDigit2;
		lotteryDigit1 = (int) (Math.random() * 10);

		do {
			lotteryDigit2 = (int) (Math.random() * 10);
		} while (lotteryDigit1 == lotteryDigit2);

		Scanner input = new Scanner(System.in);
		System.out.println("Tell me two distinct numbers: ");
		int guess = input.nextInt();

//		Separate the digits
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		System.out.println("The lottery num,ber is " + lotteryDigit1 + lotteryDigit2);
//		Compare numbers
		if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2)
			System.out.println("Youwill get $10,000");
		else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1)
			System.out.println("You will get $3,000");
		else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit2 == guessDigit1
				|| lotteryDigit2 == guessDigit2)
			System.out.println("You will get $1,000");
		else
			System.out.println("Sorry, you got nothing");
		input.close();
	}

}
