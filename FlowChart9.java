package demoifelse;

import java.util.Scanner;

public class FlowChart9 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("user give any number");
		int number=sc.nextInt();
		if(number%5==0) {
			if(number%15==0) {
			System.out.println("divisible hain");
			
		}
		else
			System.out.println("divisible nahi hain");
		
	}

}
}
