package Textbook;

public class Exercise0507 {

	public static void main(String[] args) {

		int totalCost = 0;
		int tuition = 10000;
		int tuitionTenthYear = 0;
		for (int year = 1; year <= 14; year++) {
//			Increase the tuition 5% each year
			tuition += (tuition * 0.05);

			if (year > 10) // after 10 years
				totalCost += tuition; // add all the tuitions from 11th to 14th
			if (year == 10)
				tuitionTenthYear = tuition;
		}
//		tuition of 10 years
		System.out.println("The tuition in 10 years : $" + tuitionTenthYear);
//	Display 4 years of tuition after 10th year
		System.out.println("THe total cost for four years' worth of tuition after 10th year $" + totalCost);

	}

}
