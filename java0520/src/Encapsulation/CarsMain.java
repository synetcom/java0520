package Encapsulation;

public class CarsMain {

	public static void main(String[] args) {

		Cars car = new Cars("Tesla", 90000, 150.00);
		Cars car1 = new Cars("BENZ", 100000);
		System.out.printf("Name: %s  Price:$%s  Top Speed: %skm", car.getName(), car.getPrice(), car.getTopSpeed());

		System.out.println(" ");
		System.out.printf("Name: %s Price:$%s", car1.getName(), car1.getPrice());
	}

}
