package Fourthday;

import java.util.Arrays;

public class ToStringTest {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 3, 5, 7, 9, 11, 13, 15 };
		int[] numbers2 = { 1, 3, 5, 7, 9, 11, 13, 15 };
		System.out.println(numbers1);
		System.out.println(numbers2);
		System.out.println(numbers1.toString());
		System.out.println(Arrays.toString(numbers1));
		System.out.println(Arrays.toString(numbers2));

	}

}
