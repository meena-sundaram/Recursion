package day5;

public class DecimaltoBinary {
	public static void main(String args[]) {
		int number = 25;
		System.out.println(binarnumber(number));
	}

	public static String binarnumber(int number) {
		int a;
		if (number > 0) {
			a = number % 2;
			return (binarnumber(number / 2) + "" + a);
		}
		return "";
	}
}
