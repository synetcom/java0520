package StaticMethod;

import java.util.ArrayList;
import java.util.List;

public class AddUserUsingGroup {

	public static void main(String[] args) {
		String[] firstNames = { "Steve", "Bill", "Hellen", "Tom" };
		String[] lastNames = { "Jobs", "Gates", "Keller", "Jones" };

		List<StaticMethodSample> users = new ArrayList<StaticMethodSample>();
		for (int i = 0; i < firstNames.length; i++) {
			StaticMethodSample user = new StaticMethodSample();
			user.setFirstName(firstNames[i]);
			user.setLastName(lastNames[i]);
			users.add(user);
		}
		for (StaticMethodSample user : users) {
			System.out.println(user.getFullName());
		}

	}
}