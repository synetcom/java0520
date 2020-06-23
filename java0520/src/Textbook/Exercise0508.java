package Textbook;

import java.util.Scanner;

public class Exercise0508 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int highestScore = 0;
		String highstScoreName = "";

//		prompt the user to enter the number of students
		System.out.println("Enter the number of students");
		int numberOfStudents = input.nextInt();

//		prompt the user to enter name and score
		System.out.println("Enter each student's name and score");
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Student: " + (i + 1) + "\n Name: ");
			String name = input.next();
			System.out.print(" Score: ");
			int score = input.nextInt();

//			Test if the score is higher than the highest score
			if (score > highestScore) {
				highestScore = score;
				highstScoreName = name;
			}
		}

//Display the highest score and the stuent's name
		System.out.println("Student with the highest score: " + highstScoreName + " and the Score: " + highestScore);
	}

}
