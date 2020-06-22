package ErrorHandling;

public class NullPointExceptionCheck {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}

	}

}
