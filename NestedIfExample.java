package demoifelse;

import java.util.Scanner;

public class NestedIfExample {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		System.out.println("enter days");
		String day=br.nextLine();
		System.out.println("enter meal");
		String meal=br.nextLine();
		if(day.equals("monday")) {
			if(meal.equals("breakfast")) {
				System.out.println("poha");}
		   else if(meal.equals("lunch")) {
			   System.out.println("rajma rice");
		   }
		   else {
			   System.out.println("roti sabji");
		   }		
				
				
			}
			if(day.equals("tuesday")) {
				if(meal.equals("breakfast")) {
					System.out.println("kheer");}
				else if (meal.equals("lunch")) {
					System.out.println("chhole chawal");
					}
				else {
					System.out.println("paneer pudi");
				}
				}
				
			}
		}
	


