
public class StringFormat {

	public static void main(String[] args) {
		String greet = "Hello all";
		System.out.println(greet + " boys!");

		String words = "girls!";
		System.out.println(String.format("Hello all %s", words));
	}

}
