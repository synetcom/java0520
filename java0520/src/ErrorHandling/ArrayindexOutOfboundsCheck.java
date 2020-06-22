package ErrorHandling;

public class ArrayindexOutOfboundsCheck {

	public static void main(String[] args) {
		try {
			int[] a = new int[5];

			a[9] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds");
		}

	}

}
