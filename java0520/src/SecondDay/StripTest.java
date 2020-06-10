package SecondDay;

public class StripTest {

	public static void main(String[] args) {
		String sentence = "    Today is very rainy.   ";
		System.out.println(sentence);
//		System.out.println(sentence.strip());
		System.out.println(sentence.stripLeading());
		System.out.println(sentence.stripTrailing());
	}

}
