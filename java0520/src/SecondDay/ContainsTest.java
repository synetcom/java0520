package SecondDay;

public class ContainsTest {

	public static void main(String[] args) {
		String str1 = "In the future, we need to work remotely.";
		System.out.println(str1.contains("remotely"));
// will show Boolean 
		if (str1.contains("remotely") == true) {
			System.out.println("Remote working");
		} else {
			System.out.println("Physical working");
		}
	}

}
