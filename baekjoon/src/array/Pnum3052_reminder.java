package array;

import java.util.Scanner;

public class Pnum3052_reminder {
	
	
	public static void main(String[] args) {
		int[] checkNumber = new int [10];
		Scanner scn= new Scanner(System.in);
		int count = 1;
				
				for(int i = 0; i< checkNumber.length; i++) {
								System.out.println("enter number");
					int temp = scn.nextInt();
							if(temp<0) {
								i--;
							} else {
								checkNumber[i] = temp%42;
								
							}
					System.out.println(checkNumber[i]);		
					
				}
				
				for ( int i =1; i<checkNumber.length; i++) {
					int icount = 0;
							for( int j =0; j<i; j++) {
									if(checkNumber[i] != checkNumber[j]) {
										icount ++;
//										break;
										
										// 40 / 39
										// 41 / 39 40
										// 0  / 39 40 41
										// 1  / 39 40 41 0
										// 2  / 39 40 41 0 1 
										// 40 / 39 40  break; 41 0 1 2
									} else {
										icount = 0;
										break;
									}
								
							}
							
							if(icount != 0) {
								count ++;
							}
							
				}
				
				System.out.println(count);
				
				
				
		
	}
	
}
