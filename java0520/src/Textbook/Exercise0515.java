package Textbook;

public class Exercise0515 {

	public static void main(String[] args) {
		// (int)
		// (double)
		// (char)
		// ASCII: American Standard Code for Information Interchange
		// A-65, Z-90, a- 978, z-122
		// 33 to 126
		final int NUMBER_OF_CHARACTERS_PER_LINE = 10;
		int count = 0;

		for (int i = 33; i <= 126; i++) {
			count++;
			if (count % NUMBER_OF_CHARACTERS_PER_LINE == 0) {
				System.out.println((char) i);
			} else {
				System.out.print((char) i + " ");
			}
		}
	}

}
