package HashMapHashSet;

import java.util.HashMap;

public class MyClass1 {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("Japan", "Tokyo");
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}

	}

}
