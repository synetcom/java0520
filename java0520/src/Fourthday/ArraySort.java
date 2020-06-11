package Fourthday;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = { 13, 5, 6, 7, 89, 67, 55 };

		Arrays.sort(arr, 2, 6);

		System.out.printf("Modified arr[] : %s", Arrays.toString(arr));

	}

}
