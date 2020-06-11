package Fourthday;

public class VariableShadowing {
	static String title = "Kimchi";

	public void printTitle() {
		System.out.println(title);
		String title = "Bulgogi";
		System.out.println(title);
	}

	public static void main(String[] args) {
		VariableShadowing obj1 = new VariableShadowing();
		obj1.printTitle();
		System.out.println(title);

	}

}
