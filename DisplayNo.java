package day5;

public class DisplayNo {

	public static void main(String[] args) {
		int number = 100;
		printNos(number);
	}

	public static void printNos(int number) {
		if (number > 0) {
			printNos(number - 1);
			System.out.print(number + " ");
		}
	}

}
