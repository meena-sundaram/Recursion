package day5;

public class Gcd {
	public static void main(String[] args) {
		int n1 = 98, n2 = 56;
		System.out.println("Enter two positive integers: ");
		System.out.println("G.C.D of" + n1 + " and " + n2 + " is" + hcf(n1, n2));
	}
	public static int hcf(int n1, int n2) {
		if (n2 != 0)
			return hcf(n2, n1 % n2);
		else
			return n1;
	}
}
