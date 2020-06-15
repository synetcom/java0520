package ArrayListPackage;

import java.util.Arrays;
import java.util.List;

public class ArraysToString {

	public static void main(String[] args) {
		List<Integer> grades = Arrays.asList(90, 87, 99, 70);
		System.out.println(Arrays.toString(grades.toArray()));
		System.out.println(grades);

	}

}
