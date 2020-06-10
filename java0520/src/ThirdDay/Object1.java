package ThirdDay;

public class Object1 {

	public static void main(String[] args) {
		MethodFirst user = new MethodFirst();
//		Scanner input = new Scanner(System.in);
		user.firstName = "George";
		user.lastName = "Bush";
		System.out.println(user.getFullName());

	}

}
