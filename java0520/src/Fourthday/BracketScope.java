package Fourthday;

public class BracketScope {
	public void mathOperationExample() {
		Integer sum = 0;
		{
			Integer number = 2;
			sum = sum + number;
		}
		number++;
	}
}
