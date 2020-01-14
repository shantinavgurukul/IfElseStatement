package demoifelse;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		Scanner speed=new Scanner(System.in);
		System.out.println("enter any speed");
		int s=speed.nextInt();
		if(s<=60) {
			System.out.println("gaadi ka speed limit ke ander hai");
		}
		else {
			System.out.println("gaadi ka speed limit ke bahar hain");
		}
	}

}
