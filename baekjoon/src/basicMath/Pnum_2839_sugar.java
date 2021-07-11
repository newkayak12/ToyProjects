package basicMath;

import java.util.Scanner;

public class Pnum_2839_sugar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
			System.out.println("N kilogram");
		int number = scn.nextInt();
		
		int three= 0;
		int five = 0;
		
			do {
				if(number>5) {
					number -=5;
					five++;
				} else {
					number -=3;
					three++;
				}
				
			}while(number>0);
			
			System.out.println("five : "+five);
			System.out.println("three : "+three);
			
			System.out.println("total : "+ (five+three));
	}
}
