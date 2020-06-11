package Fourthday;

import java.util.Arrays;
import java.util.Scanner;

public class AskNumbersAndFind {

	public static void main(String[] args) {
		/*
		 * Ask number for the size of array first it will ask that time of numbers if it
		 * can't find the element it shows not found finding number is 7 if it finds it,
		 * it will show Found at index number i
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

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 7) {
				System.out.println("Found the number at index " + i);
			} else {
				System.out.println("Not Found the number at index " + i);
			}
		}

	}

}
