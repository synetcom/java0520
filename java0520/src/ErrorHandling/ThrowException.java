package ErrorHandling;

public class ThrowException {
	static void avg() {
		try {
			throw new ArithmeticException("Demo");
		}

		catch (ArithmeticException e) {
			System.out.println("Exception caught");
		}
	}

	public static void main(String[] args) {

		avg();
	}
}