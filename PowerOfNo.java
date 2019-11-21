package day5;

import java.util.Scanner;

public class PowerOfNo {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter base number: ");
		int base = input.nextInt();
		System.out.print("Enter power number(positive integer): ");
		int power = input.nextInt();
		int result = power(base, power);
		System.out.print(result);
	}

	public static int power(int base, int powerRaised) {
		if (powerRaised != 0)
			return (base * power(base, powerRaised - 1));
		else
			return 1;
	}
}
