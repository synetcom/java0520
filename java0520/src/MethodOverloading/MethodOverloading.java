package MethodOverloading;

public class MethodOverloading {
//	Method Overloading
	static int plusMethod(int x, int y) {
		return x + y;
	}

	static double plusMethod(double x, double y) {
		return x + y + 2;
	}

	static double plusMethod(double x, double y, double z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		int myNum1 = plusMethod(9, 5);
		double myNum2 = plusMethod(9.0, 5.0);
		double myNum3 = plusMethod(9.0, 5.0, 14.3);
		System.out.println("int: " + myNum1);
		System.out.println("double: " + myNum2);
		System.out.println("double: " + myNum3);

	}

}
