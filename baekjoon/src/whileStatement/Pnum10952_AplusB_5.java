package whileStatement;

import java.util.Scanner;

public class Pnum10952_AplusB_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
				System.out.println("how many times do you want to operate");
		int count = scn.nextInt();
			while(count > 0) {
						System.out.println("fisrt number");
				int a = scn.nextInt();
						System.out.println("second number");
				int b = scn.nextInt();
						System.out.println(a+" + "+b+" = " + (a+b));
					count--;
				
			}
			
;	}

}
