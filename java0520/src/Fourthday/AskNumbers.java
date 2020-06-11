package Fourthday;

import java.util.Arrays;
import java.util.Scanner;

public class AskNumbers {

	public static void main(String[] args) {
		/*
		 * Ask user about the array size and the numbers will go inside the array. Then
		 * it prints the numbers on screen. If you type 5, it will ask five times for
		 * each number will show the answer as below; [1,5,6,7,9]
		 */
		System.out.println("Tell me a number to create an array of that size");
		Scanner input = new Scanner(System.in);
		int element = input.nextInt();
		int[] array1 = new int[element];
		for (int i = 0; i < element; i++) {
			System.out.println("Tell me an integer number to add to the array");
			int k = input.nextInt();
			array1[i] = k;
		}
		System.out.println("The array numbers are: " + Arrays.toString(array1));

		int sum = 0;
		for (int num : array1) {
			sum += num;
		}
		System.out.println("The total sum of the array numbers are " + sum);
		input.close();
	}

}
