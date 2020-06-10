package SecondDay;

public class StaticCheck {

	static void callMe() {
		System.out.println("You can call me");
	}

	public void textMe() {
		System.out.println("You can text me");
	}

	public static void main(String[] args) {
		callMe();
		StaticCheck obj1 = new StaticCheck();
		obj1.textMe();
	}

}
