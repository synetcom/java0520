package HashMapHashSet;

import java.util.HashSet;

public class MyClass3 {

	public static void main(String[] args) {
		// element inside all unique
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);
	}

}
