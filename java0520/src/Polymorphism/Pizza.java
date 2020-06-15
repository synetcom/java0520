package Polymorphism;

public class Pizza extends Food {

	@Override
//	Method Overriding
	void eat() {
		System.out.println("Pizza is good");
	}

	public static void main(String[] args) {
		Food meal = new Food();
		meal.eat();

		Pizza meal1 = new Pizza();
		meal1.eat();

	}

}
