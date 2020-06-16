package ObjectMethod;

public class TemperatureDefine {

	public int celcius;
	public int fahrenheit;

	TemperatureDefine() {
		System.out.println("constructor has been created");
	}

//	1. convertToFahrenheit(int celcius)
	public int convertToFahrenheit(int celcius) {
		return celcius * 9 / 5 + 32;
	}

	public int convertToCelcius(int fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
//	2. convertToCelcius(int fahrenheit)

}
