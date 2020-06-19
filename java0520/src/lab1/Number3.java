package lab1;

public class Number3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int k = 1; k <= 6; k++)
				if (k == i)
					System.out.print(12 * k);
				else
					System.out.print("-");
			System.out.println();
		}
	}

}
