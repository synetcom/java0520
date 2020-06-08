package DoubleCheck;

public class PostPre {

	public static void main(String[] args) {
		int x = 5;
		int a = x++;
//		postfix x++(in the same line doesn't change), prefix ++x(in the same line already incremented
		System.out.println(x); // 6
		System.out.println(a); // 5
	}

}
