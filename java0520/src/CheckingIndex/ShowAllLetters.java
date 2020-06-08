package CheckingIndex;

import java.util.Scanner;

public class ShowAllLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tell me a sentence");

		String sentence = input.nextLine();
		for (int i = 0; i < sentence.length(); i++) {
			System.out.println(sentence.charAt(i));
		}

		input.close();
	}

}
