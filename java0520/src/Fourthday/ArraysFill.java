package Fourthday;

import java.util.Arrays;

public class ArraysFill {

	public static void main(String[] args) {
		int[] array1 = { 2, 4, 5, 6, 8, 9, 13 };
		int[] array2 = array1;

		System.out.println(array1);
		System.out.println(array2);

		int[] array3 = new int[5];
		Arrays.fill(array3, 77);
		System.out.println(Arrays.toString(array3));
	}

}
