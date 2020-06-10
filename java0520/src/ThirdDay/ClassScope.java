package ThirdDay;

public class ClassScope {
	private static Integer amount = 0;

	public static Integer exampleMethod() {
		amount++;
		return amount;
	}

	public static Integer anotherExampleMethod() {
		Integer anotherAmount = amount + 4;
		return anotherAmount;
	}

	public static void main(String[] args) {
		System.out.println(exampleMethod());
		System.out.println(anotherExampleMethod());
		System.out.println(anotherExampleMethod());
		System.out.println(anotherExampleMethod());
		System.out.println(exampleMethod());
		System.out.println(exampleMethod());

	}

}
