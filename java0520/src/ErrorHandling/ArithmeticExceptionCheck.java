package ErrorHandling;

public class ArithmeticExceptionCheck {

	public static void main(String[] args) {
		try {
			int a = 30, b = 0;
			int c = a / b;
			System.out.println("Result: " + c);

		} catch (ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}

	}

}
