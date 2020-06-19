package lab1;

import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tell me the number of arrays");
		int numberOfelements = input.nextInt();

		int[] array = new int[numberOfelements];
		for (int k = 0; k < numberOfelements; k++) {
			System.out.println("Tell me one number");
			int elementsOfArray = input.nextInt();
			array[k] = elementsOfArray;
		}
		input.close();
		int first_element, second_element, arr_size = array.length;

		if (arr_size < 2) {
			System.out.println("Array size is less than two");
			return;
		}

		first_element = second_element = Integer.MAX_VALUE;
		for (int i = 0; i < arr_size; i++) {
			if (array[i] < first_element) {
				second_element = first_element;
				first_element = array[i];
			} else if (array[i] < second_element && array[i] != first_element)
				second_element = array[i];
		}
		if (second_element == Integer.MAX_VALUE)
			System.out.println("No second smallest element");
		else
			System.out.println("The smallest element is " + first_element + "The second smallest number is "
					+ second_element + ".");
	}

}
