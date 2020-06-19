package ErrorHandling;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String words = null;
		String[] wordArray = null;
		if (words != null) {
			wordArray = words.split("\t");
		}
		if (wordArray != null) {
			for (String word : wordArray) {
				System.out.println(word);
			}
		}
		System.out.println(words);
		System.out.println(wordArray);
		System.out.println("Program NullPointer Exception");
	}

}
