package numbers;

import java.util.Scanner;

public class Pnum11720_plus {
	
	public static void main(String[] args) {
		int a = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("how many times?");
		int limit = s.nextInt();
		
		for(int i =0; i<limit; i++) {
			
			System.out.println("number?");
			
			a+=s.nextInt();
			
		}
		
		
		System.out.println("result : " + a);
		
		
	}
	
	
	
}
