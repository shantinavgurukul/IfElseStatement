package demoifelse;

import java.util.Scanner;

public class FlowChart8 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int firstnumber=sc.nextInt();
		System.out.println("Enter second number");
		int secondnumber=sc.nextInt();
		if(firstnumber>secondnumber) {
			System.out.println("Firstnumber");
		}
		else
			System.out.println("secondnumber");
	}

}
