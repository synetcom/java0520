package SecondDay;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		System.out.println("Tell me the number to check day");
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Tell me only 1 to 7");
		}
		input.close();
	}

}
