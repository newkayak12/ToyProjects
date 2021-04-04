package ifStatement;

import java.time.LocalDate;
import java.util.Scanner;

public class Pnum2753_leapYear {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
			System.out.println("enter:");
		int test = scn.nextInt();
		
			if( ( (test%4==0) && (test%100!=0) )|| (test%400==0) ){
				System.out.println("1");
				
			} else {
				System.out.println("2");
			}
			
			
			LocalDate date = LocalDate.of(2012,01,01);
			System.out.println(date.isLeapYear());
	}
}
