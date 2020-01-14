package demoifelse;

import java.util.Scanner;

public class FlowChart4 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=br.nextInt();
		if(num>10) {
			System.out.println("10 se bada hain");
			}
		else if(num>10 && num<=20) {
		System.out.println("20 se chhota hain");
		}
	
	else
		System.out.println("20 se bada hain");
		
	}
}
