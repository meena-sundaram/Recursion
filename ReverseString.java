package day5;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Welcome to Hell";
		String reversed = reverseString(str);
		System.out.println("The reversed string is: " + reversed);
	}

	public static String reverseString(String str) {
		if ((str == null) || (str.length() <= 1)) {
			return str;
		} else {
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}
}
