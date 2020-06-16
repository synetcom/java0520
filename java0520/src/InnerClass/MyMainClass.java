package InnerClass;

class OuterClass {
	int x = 10;

	class InnerClass {
		int y = 6;
	}
}

public class MyMainClass {

	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}

}
