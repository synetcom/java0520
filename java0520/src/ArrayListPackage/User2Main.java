package ArrayListPackage;

import java.util.ArrayList;
import java.util.List;

public class User2Main {

	public static void main(String[] args) {
		User2 you = new User2();
		you.setFirstName("Steve");
		you.setLastName("Jobs");

		User2 me = new User2();
		me.setFirstName("Bill");
		me.setLastName("Gates");

		List<User2> users = new ArrayList<User2>();
		users.add(you);
		users.add(me);
		System.out.println(users.get(0).fullName());
	}

}
