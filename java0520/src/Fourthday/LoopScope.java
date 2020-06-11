package Fourthday;

import java.util.Arrays;
import java.util.List;

public class LoopScope {
	// int[] array1 = {1,2,3,4,5} creating array
	List<String> listOfNames = Arrays.asList("John", "Josh", "Peter");

	public void iterationOfNames() {
		String allNames = " ";

		for (String name : listOfNames) {
			allNames = allNames + " " + name;
		}
		// only available inside the for loop
		String lastNmaeUsed = name;
	}
}
