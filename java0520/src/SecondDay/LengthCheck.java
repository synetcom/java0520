package SecondDay;

public class LengthCheck {

	public static void main(String[] args) {
		String str1 = new String("Welcome to Java Course");
//		String str1 = "Welcome to Java Course";
		String str2 = "  WMAD   A0520    ";
		System.out.print("String length: ");
		System.out.println(str1.length());
		System.out.print("String length: ");
		System.out.println(str2.length());
		System.out.println(str2);
		System.out.println(str2.trim());
		System.out.println(str2.replaceAll("\\s+", ""));

	}

}
