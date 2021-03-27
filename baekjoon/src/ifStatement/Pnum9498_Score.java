package ifStatement;

import java.util.Scanner;

public class Pnum9498_Score {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num =0;
		boolean flag = false;
			
			do {
				
					System.out.println("su");
				num = scn.nextInt();
				flag = false;
					
					if(!(num>=0 && num<=100)) {
						flag = true;
						
					}
				
			}while(flag);
			
			if(num>=90 && num<=100) {
				System.out.println("A");
				
			} else if(num>=80 && num<=89){
				System.out.println("B");
				
			} else if (num>=70 && num<=79) {
				System.out.println("C");
				
			} else if (num>=60 && num<=69) {
				System.out.println("D");
				
			} else {
				System.out.println("F");
			}
			
	}

}
