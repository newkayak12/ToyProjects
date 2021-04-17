package forStatement;

import java.util.Scanner;

public class Pnum_2438_start_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
					System.out.println("how many times?");
			int n = scn.nextInt();
				for(int i=0; i<n; i++) {
					for(int j = 0; j<=i; j++) {
							System.out.print("*");
						
						
					}
					System.out.println();
				}
	}

}
