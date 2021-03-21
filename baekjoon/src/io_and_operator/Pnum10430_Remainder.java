package io_and_operator;

import java.util.Scanner;

public class Pnum10430_Remainder {
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
			System.out.println("fir num");
		int a = scn.nextInt();
			System.out.println("sec num");
		int b = scn.nextInt();
			System.out.println("thr num");
		int c = scn.nextInt();
		
			System.out.print("( A + B ) % C = ");
			System.out.println((a+b) % c);
			
			System.out.print("( A % C ) + ( B % C ) = ");
			System.out.println((a%c) + (b%c));
			
			System.out.println();
			System.out.print("(A x B) % C = ");
			System.out.println((a*b) %c);
			
			System.out.print("(( A % C) X ( B % C )) % C = ");
			System.out.println( ((a%c) * (b%c)) % c);
	}

}
