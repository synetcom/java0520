package ThirdDay;

public class FinalText {
	final int x = 90;

	public static void main(String[] args) {
		FinalText obj1 = new FinalText();
		obj1.x = 25; // will generate an error
		System.out.println(obj1.x);

	}

}
