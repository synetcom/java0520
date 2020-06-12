package ArrayListPackage;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {
//List<String> array1 = new List<String>();

		List<Integer> cars = new ArrayList<>();

		System.out.println(cars);
		cars.add(9);
		cars.add(8);
		cars.add(11);
		cars.add(20);
		cars.add(33);
		cars.remove(2); // index number
		cars.add(1, 99);
		System.out.println(cars);
	}

}

//List is Interface