package Fourthday;

public class AddArrayNumbers {

	public static void main(String[] args) {
		/*
		 * Initialize an array of 10 integers Then, add all numbers inside the array And
		 * show the sum on the screen.
		 */
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i : array1) {
			sum += i;
		}
		System.out.println("The sum is " + sum);
	}

}
