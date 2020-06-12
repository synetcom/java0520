package ArrayListPackage;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListSample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me the the list of integer numbers ");
		String array1 = input.nextLine();
		String[] arr1 = array1.split(" ");

		for (String element : arr1) {
			System.out.print(element + " ");
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println();
		List<String> arr2 = Arrays.asList(arr1);
		System.out.println(arr2);
		input.close();

//		Array: it's fixed size
//		ArrayList: You can modify the element and size as well
	}

}
