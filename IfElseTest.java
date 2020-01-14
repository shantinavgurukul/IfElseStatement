package demoifelse;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter days");
		String day = sc.nextLine();
		if (day.equals("monday")) {
			System.out.println("rajma chawal");
		} else if (day.equals("tuesday")) {
			System.out.println("kheer");
		} else if (day.equals("wednesday")) {
			System.out.println("fride rice");
		} else if (day.equals("thursday")) {
			System.out.println("puri allu");
		} else if (day.equals("friday")) {
			System.out.println("chhle chawal");
		} else if (day.equals("saturday")) {
			System.out.println("paneer puri");
		} else if (day.equals("sunday")) {
			System.out.println("kheer puri with julab jamun");
		} else {
			System.out.println("poha");
		}

	}
}
