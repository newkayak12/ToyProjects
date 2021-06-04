package forStatement;

import java.util.Scanner;

public class Pnum2741_To_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
				
		
				System.out.println("number ?");
		long n = scn.nextInt();
			
		long start = System.currentTimeMillis();
		
			for(long i = 1; i<=n; i++ ) {
						System.out.println(i);
			}
			
			scn.close();
			
		long end = System.currentTimeMillis();
			
				System.out.println("running time : " + (end-start)+"ms");
		

	}

}
