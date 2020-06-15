package ArrayListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge1 {

	public static void main(String[] args) {
		/*
		 * Assign the value of list 1,3,5,7,9 Then, shows the value of 2,6,10,14,18
		 * using for loop and set(), get(), size() method 2,6,10,14,18 but doesn't show
		 * comma at the end
		 */
		List<Integer> grades = Arrays.asList(1, 3, 5, 7, 9);
		List<Integer> grades1 = new ArrayList<>();

		for (int i = 0; i < grades.size(); i++) {
			if (!(i == 4)) {
				grades1.add(i, grades.get(i) * 2);
				System.out.print(grades1.get(i) + ", ");
			} else {
				grades1.add(i, grades.get(i) * 2);
				System.out.print(grades1.get(i));
			}
		}
	}

}
