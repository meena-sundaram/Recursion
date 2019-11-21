package day5;

public class Factorial {

	public static void main(String[] args) {
		int number = 5;
		System.out.println("factorila of given no is: " + factorial(number));
	}

	private static int factorial(int i) {
		if (i == 0) {
			return 1;
		} else {
			return i * factorial(i - 1);
		}
	}
}
