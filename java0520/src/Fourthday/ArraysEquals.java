package Fourthday;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 3, 5, 7, 9 };
		int[] numbers2 = { 1, 3, 5, 7, 9 };
		System.out.println(numbers1);
		System.out.println(numbers2);
		System.out.println(Arrays.equals(numbers1, numbers2));
		if (numbers1 == numbers2) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
	}

}
