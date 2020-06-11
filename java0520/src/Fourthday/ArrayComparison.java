package Fourthday;

import java.util.StringJoiner;

public class ArrayComparison {

	public static void main(String[] args) {
		String[] array1 = { "VANCouver", "Boston" };
		String[] array2 = { "vancouver", "boston" };

		StringJoiner joiner1 = new StringJoiner("");
		for (int i = 0; i < array1.length; i++) {
			joiner1.add(array1[i]);
		}
		String str1 = joiner1.toString().toLowerCase();
		System.out.println(str1);

		StringJoiner joiner2 = new StringJoiner("");
		for (int i = 0; i < array2.length; i++) {
			joiner2.add(array2[i]);
		}
		String str2 = joiner2.toString().toLowerCase();
		System.out.println(str2);
		System.out.println(str1.equals(str2));

		if (str1 == str2) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
	}

}
