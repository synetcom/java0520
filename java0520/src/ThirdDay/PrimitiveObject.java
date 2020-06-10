package ThirdDay;

public class PrimitiveObject {

	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		System.out.println(x == y);
		System.out.println(Integer.toHexString(System.identityHashCode(x)));
		System.out.println(Integer.toHexString(System.identityHashCode(y)));
//Boolean true or false
//		they pass by the value

		String a = "hi";
		String b = new String("hi");
		System.out.println(a.equals(b));

		System.out.println(Integer.toHexString(System.identityHashCode(a)));
		System.out.println(Integer.toHexString(System.identityHashCode(b)));

//		they pass by reference
		// reference1 reference2

//		object1("hi")                   object2("hi")

	}

}
