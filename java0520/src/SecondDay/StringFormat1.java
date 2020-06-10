package SecondDay;

public class StringFormat1 {

	public static void main(String[] args) {
		String greeting = "Rainy day today!";
		System.out.println(greeting);

		String sentence = "students!";
		System.out.println(String.format("Nice to study on a rainy day, %s", sentence));
		System.out.printf("Nice to study on a rainy day, %s", sentence);
	}

}
