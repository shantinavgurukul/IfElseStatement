package demoifelse;

import java.util.Scanner;

public class FlowChart7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("divisible hain");

		} else
			System.out.println("divisible nahi hain");
	}
}
