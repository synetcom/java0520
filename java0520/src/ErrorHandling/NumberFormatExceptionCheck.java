package ErrorHandling;

public class NumberFormatExceptionCheck {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("Java");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}

	}

}
