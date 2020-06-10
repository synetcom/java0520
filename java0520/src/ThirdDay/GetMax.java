package ThirdDay;

import java.util.Scanner;

public class GetMax {

	public static void main(String[] args) {
		System.out.println("Tell me the first integer number");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("Tell me the second integer number");
		int b = input.nextInt();

		int max = (a > b) ? a : b;
		input.close();
		System.out.println("The bigger number between " + a + " and " + b + " is " + max);

	}

}
