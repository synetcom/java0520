package ArrayListPackage;

import java.util.ArrayList;
import java.util.List;

public class ListArraySample {

	public static void main(String[] args) {

		List<Integer> grades = new ArrayList<Integer>();
		grades.add(99);
		grades.add(98);

		grades.add(1, 70);
		System.out.println(grades);
		System.out.println(grades.get(0));
		System.out.println(grades.indexOf(70));
		System.out.println(grades.contains(60));

	}

}
