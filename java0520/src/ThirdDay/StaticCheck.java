package ThirdDay;

public class StaticCheck {

	static void myStaticMethod() {
		System.out.println("Static method can be called without creating an object");
	}

	public void myPublicMethod() {
		System.out.println("Public method shoud be called by creaing an object");
	}

	public static void main(String[] args) {

		myStaticMethod();

		StaticCheck obj1 = new StaticCheck();

		obj1.myPublicMethod();
	}

}
