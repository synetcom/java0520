package lab1;

public class Number2 {

	public static void main(String[] args) {
		int number = 11;
		int rows = 3;
		int cols = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				if (j % 5 != 0)
					System.out.print(number + ", ");
				else
					System.out.print(number);
				number++;
			}
			if (i != rows) {
				System.out.println();
			}

		}

	}
}
