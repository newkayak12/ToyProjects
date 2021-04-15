package forStatement;

import java.util.Scanner;

public class Pnum2742_From_N {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			
				System.out.println("number");
		long n = scn.nextInt();
		
		long start = System.currentTimeMillis();
		
			for(long i = n; i>=1; i--) {
						System.out.println(i);
			}
			
		long end = System.currentTimeMillis();
			
			System.out.println("running time : " + (end-start)+"ms");
	}

}
