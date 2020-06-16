package ObjectMethod;

public class ConvertSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(answer.convertToFahrenheit(100));
//System.out.println(answer.convertToCelcius(212));

		/*
		 * Something.java javac Something.java
		 * 
		 * Something.class java Something
		 * 
		 */
		TemperatureDefine answer = new TemperatureDefine();
		System.out.println(answer.convertToCelcius(212));
		System.out.println(answer.convertToFahrenheit(100));
	}

}
