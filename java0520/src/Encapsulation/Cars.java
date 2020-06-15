package Encapsulation;

public class Cars {
	private String name;
	private double price;
	private double topSpeed;

	public Cars() {
	}

	public Cars(String name, double price, double topSpeed) {
		this.setName(name);
		this.setPrice(price);
		this.setTopSpeed(topSpeed);
	}

	public Cars(String name, double price) {
		this.setName(name);
		this.setPrice(price);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
}
