package ThirdDay;

public class MultipleObject {
	int x = 10;

	public static void main(String[] args) {
		MultipleObject obj1 = new MultipleObject();
		MultipleObject obj2 = new MultipleObject();
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		System.out.println(obj1.x == obj2.x);

	}

}
