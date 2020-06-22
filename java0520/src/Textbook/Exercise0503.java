package Textbook;

public class Exercise0503 {
	public static void main(String[] args) {
		final double POUNDS_PER_KILOGRAM = 2.2;

//		header display
		System.out.println("Kilograms      Pounds");

//		Display Table
		for (int i = 1; i <= 199; i += 2) {
			System.out.printf("%-15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAM));
		}
//System.out.printf( "%-15d%6.1f     ", variable1, variable2 );
	}
}
