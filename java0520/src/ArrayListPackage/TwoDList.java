package ArrayListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDList {

	public static void main(String[] args) {
		List<List<Integer>> allGrades = new ArrayList<List<Integer>>();

		allGrades.add(Arrays.asList(1, 2, 3, 4, 5));
		allGrades.add(Arrays.asList(6, 7, 8, 9, 10));
		allGrades.add(Arrays.asList(11, 12, 13, 14, 15));
		System.out.println(allGrades);

		for (List<Integer> grades : allGrades) {
			for (int grade : grades)
				if (grade % 5 == 0) {
					System.out.print(grade);

				} else {
					System.out.print(grade + ", ");
				}
			System.out.println("");
		}

	}

}
