package array;

import java.util.Scanner;

public class Pnum_10818_MAX_MIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
						System.out.println("Input Number 1<= N <= 1,000,000");
		int n = scn.nextInt();
						System.out.println("Input Numbers 5 times");
		int[] arr = new int[n];
				
				for (int i = 0; i<n; i++) {
								System.out.println("Enter Any Number ( -1,000,000<= a <= 1,000,000");
						arr[i] =  scn.nextInt();
						
								System.out.println(arr[i]+" ");
					
				}
			
				for(int i = 0; i< arr.length; i++) {
					for(int j =0; j< arr.length; j++) {
						if(i!=j) {
							
							if(arr[i]>arr[j]) {
								int temp = arr[i];
									arr[i] = arr[j];
									arr[j] = temp;
								
									break;
								
							} else {
								
								
							}
							
							
							
						}
						
					}
					
					
					
				}
				
				for(int a : arr) {
					System.out.println(a);
				}
				
					
					System.out.println("Min : " + arr[n-1]);
					System.out.println("Max : "+ arr[0]);
					
					
				
			
	}

}
