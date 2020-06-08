package DoubleCheck;

public class StringCheck {

	public static void main(String[] args) {
		String sentence = "  I  love      Vancouver    ";
		System.out.println(sentence);
		System.out.println(sentence.trim());
		System.out.println(sentence.replaceAll(" ", ""));
	}

}
