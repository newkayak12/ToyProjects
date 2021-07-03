package basicMath;

import java.util.Scanner;

public class Pnum_2869_snail {
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);

		int total = 0;
		
		int up = 0;
		int down = 0;
		
		int progress = 0;
		int day =0;
		System.out.println("total");
		total=scn.nextInt();
		
		System.out.println("up");
		up=scn.nextInt();
		
		System.out.println("down");
		down=scn.nextInt();
		
		for(day = 0; total > progress; day++) {
			
			progress+=up;
			progress-=down;
			
		}
		
		System.out.println((day)+"일 걸림");
	}

		
		
}
