package lab1;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tell me a positive integer number bigger than 1");

		int number = input.nextInt();
		int i = 2;
		boolean flag = false;
		while (i <= number / 2) {
			if (number % i == 0) {
				flag = true;
				break;
			}
			++i;
		}

		if (!flag)
			System.out.println(number + " is a prime number");
		else
			System.out.println(number + " is not a prime number");
		input.close();
	}

}
