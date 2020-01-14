package demoifelse;

import java.util.Scanner;

public class NestedifTest {

	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.println("Enter an age");
		int age =number.nextInt();
		if(age>5) {
			System.out.println("school ja skte hai");}
		
		 if(age>18) {
			System.out.println("vote de skte hai");
		}
		if(age>21) {
			System.out.println("car drive kar skta hain");
		}
		if(age>24) {
			System.out.println("shadi kr skta hain");
		}
		if(age>25) {
			System.out.println("drink kr skta hain");
		}
		else {
			System.out.println("outof country ja skta hain");
		}
	}

}
