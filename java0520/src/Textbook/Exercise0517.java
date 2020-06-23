package Textbook;

import java.util.Scanner;

public class Exercise0517 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("ENter the number of lines");
		int numberOfLines = input.nextInt();

		for (int rows = 1; rows <= numberOfLines; rows++) {
			// create space in each row
			for (int s = numberOfLines - rows; s >= 1; s--) {
				System.out.print("  ");
			}
			// create descending numbers in each row
			for (int l = rows; l >= 2; l--) {
				System.out.print(l + " ");
			}
			// create ascending number in each row
			for (int r = 1; r <= rows; r++) {
				System.out.print(r + " ");
			}
			System.out.println();
		}

	}

}
