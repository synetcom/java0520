package Fourthday;

public class FindIndex {

	public static void main(String[] args) {
		/*
		 * Assign an array of {1,45,46,77,87,97,98}
		 * 
		 * Find the value of 77 and shows the index number on the screen
		 * 
		 */
		int[] numbers = { 1, 45, 46, 77, 87, 97, 98 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 77) {
				System.out.println("Found the value at index number [" + i + "]");
			}
		}
	}

}
