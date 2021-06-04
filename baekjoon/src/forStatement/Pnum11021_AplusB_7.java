package forStatement;

import java.util.Scanner;

public class Pnum11021_AplusB_7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
				System.out.println("how many??");
		int n = scn.nextInt();
			for(int i=0; i<n; i++) {
						System.out.println("first number");
				int a = scn.nextInt();
						System.out.println("second number");
				int b = scn.nextInt();
						System.out.println("Case #"+(i+1)+" :  "+a+ " + "+b+" = "+ a+b+"\n" );
			}
	}
}
