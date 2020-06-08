import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hourly Rate: ");
		double hourlyRate = input.nextDouble();
		System.out.println("Hours Worked: ");
		int guessHoursWork = input.nextInt();
		int regularHours = 40;
		double overTime = 0;
		double salary = 0;
		input.close();

		if (hourlyRate >= 8.00 && guessHoursWork <= 60) {
			if (guessHoursWork > 40) {
				overTime = (guessHoursWork - regularHours) * 1.5;
				salary = (regularHours * hourlyRate) + (overTime * hourlyRate);
				System.out.println("Salary : $" + salary);
			} else {
				salary = guessHoursWork * hourlyRate;
				System.out.println("Salary : $" + salary);
			}

		} else if (hourlyRate < 8.00) {
			System.out.println("It should be bigger than or equal to 8");
		} else {
			System.out.println("You are not allowed to work more than 60 hpours");
		}

	}

}
/*
 * asking a week salary regularHours= 40; salary if you work more than 40 hours,
 * that is overtime(1.5 times) If hourLyRate is less than 8 hours, it should
 * show "It should be bigger than 8" If they worked more than 60 hours, it
 * should show" You are not allowed to work more than 60 hours
 * 
 * 1. You will ask HourlyRate= 14.50(in dollars) 2. You will ask HoursWorked= 80
 * hours
 * 
 * input.nextLine() input.nextDouble() input.nextInt()
 * 
 * Salary: $1200 It should be bigger than 8 You are not allowed to work more
 * than 60 hours
 */