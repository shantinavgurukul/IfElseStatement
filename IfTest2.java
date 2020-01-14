package demoifelse;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[]args) {
		Scanner guess = new Scanner(System.in);
		System.out.println("enter any city");
		String js= guess.nextLine();
		String value  = "delhi";
		if(js.equals(value)) {
			System.out.println("apka guess sahi hai");
		}else {
			System.out.println("apka guess glt hai");
		}
		
	}

	

	
		
	

}
