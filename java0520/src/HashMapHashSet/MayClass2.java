package HashMapHashSet;

import java.util.HashMap;

public class MayClass2 {

	public static void main(String[] args) {
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		people.put("John", 32);
		people.put("Josh", 30);
		people.put("Melanie", 34);
		for (String i : people.keySet()) {
			System.out.println("Name: " + i + " Age: " + people.get(i));
		}
	}

}
