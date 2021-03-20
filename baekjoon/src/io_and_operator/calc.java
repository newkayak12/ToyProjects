package io_and_operator;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		int a = 0;
		int b = 0;
		
		String[] msg = new String[3];
		
			System.out.println(">_  eg) 1 + 2 ");
		msg = ( scn.nextLine() ).split(" ");
		
		a = Integer.parseInt(msg[0]);
		b = Integer.parseInt(msg[2]);
		
			switch(msg[1]) {
			
				case "+" :
					System.out.println(" = " + calculator.sum(a, b));
					break;
				
				case "-" :
					System.out.println(" = " + calculator.sub(a, b));
					break;
					
				case "/" :
					System.out.println(" = " + calculator.div(a, b));
					break;
				
				case "*" :
					System.out.println(" = " + calculator.mult(a, b));
					break;
			}
		
		
		
		
		
		
		
		
		
		
	}
	
	private static class calculator {
		
		public static int sum(int a, int b) {
			return a+b;
		}
		
		public static int sub(int a, int b) {
			return a-b;
		}
		
		public static int mult(int a, int b) {
			return a*b;
		}
		
		public static int div(int a, int b) {
			return a/b;
		}
	}
}
