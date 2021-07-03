package basicMath;

import java.util.Scanner;

public class Pnum_2292_HonyComb {
	
	
	
		// TODO Auto-generated constructor stub
		/*
		 * 1                1개
		 * 2 3 4 5 6 7      6개
		 * 8 9 10 11  12 13 14 15  16 17 18 19         12개
		 * 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37   18개
		 * 38 ~ 61 
		 *  각 레벨은 1, 6, 12, 18, 24
		 *  
		 *  
		 * 1 7 19 37
		 *  6 12 18
		 */
		
		
		

		
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
			System.out.println("number");
			int select = s.nextInt();
			
			int fin =1;
			for(int i=1; i<100; i++) {
				
				fin += 6*i;
				
				
					if((fin-(6*i))+1<=select && select<=fin) {
						System.out.println((i+1)+"개의 방을 지난다.");
					}
			}
		
		
	}
}
