package Polymorphism;

public class Burger extends Food {

	void eat() {
		System.out.println("Burger is good");
	}

	public static void main(String[] args) {
		Food[] burger1 = new Food[2];
		burger1[0] = new Pizza();
		burger1[1] = new Burger();

		for (int i = 0; i < burger1.length; i++) {
			burger1[i].eat();
		}
	}
}
