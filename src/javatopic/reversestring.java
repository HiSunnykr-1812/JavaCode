package javatopic;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string for s1:");
		String s1 = sc.nextLine();

		String t = "";

		for (int i = s1.length() - 1; i >= 0; i--) {

			t = t + s1.charAt(i);
			// System.out.println(t);

		}

		if (s1.equals(t)) {
			System.out.println("The enter String is palindrome");
		} else {
			System.out.println("The enter String is not palindrome");
		}
	}

}
