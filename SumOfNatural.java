package day5;

public class SumOfNatural {

	public static void main(String[] args) {
		int number = 10;
		System.out.println(sumofno(number));
	}

	private static int sumofno(int number) {
		if (number > 0) {
			return number + sumofno(number - 1);
		} else {
			return number;
		}
	}

}
