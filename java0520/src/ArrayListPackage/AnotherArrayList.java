package ArrayListPackage;

import java.util.ArrayList;
import java.util.List;

public class AnotherArrayList {

	public static void main(String[] args) {
		List<String> array2 = new ArrayList<String>();

		array2.add(0, "Hello");
		array2.add(1, "Bye");
		array2.remove(1);
		array2.clear();
		System.out.println(array2);

	}

}
