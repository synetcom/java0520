package Textbook;

public class Exercise0527 {

	public static void main(String[] args) {
		System.out.println("All the leap years form 101 to 3000");

		int count = 0;
		for (int year = 101; year <= 3000; year++) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				count++;

				System.out.print(year + (count % 10 == 0 ? " \n" : " "));
			}

		}
		System.out.println("\nThe number of whole leap yeas are " + count);
	}

}
