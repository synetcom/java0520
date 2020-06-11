package Fourthday;

import java.util.Arrays;

public class ThreeDimension {

	public static void main(String[] args) {
		int[][][] array1 = { { { 1, 3, 5 }, { 7, 9, 12 } }, { { 2, 4, 6 }, { 8, 10, 45 } } };
		int[] array2 = { 2, 4, 6, 8, 10, 12 };

		System.out.println(array1);
		System.out.println(array2);
		System.out.println(Arrays.deepToString(array1));
	}

}
