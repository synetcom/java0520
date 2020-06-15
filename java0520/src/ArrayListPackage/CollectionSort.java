package ArrayListPackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 3, 2, 33, 24);
		Collections.sort(numbers);
		Collections.reverse(numbers);
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}

}
