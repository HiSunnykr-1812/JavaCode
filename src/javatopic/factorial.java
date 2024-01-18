package javatopic;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the num: ");
		int num, fact = 1;
		num = in.nextInt();
		

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
	}

}
