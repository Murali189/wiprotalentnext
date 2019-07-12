
public class Calc {
	public static void main(String[] args) {
		System.out.println(Calculator.powerInt(10, 3));
		System.out.println(Calculator.powerDouble(1.05, 3));
	}
}
class Calculator {
	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
}
