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
						Integer.parseInt("1");
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
					
//				배열 정렬 (다시 공부해야겠네...이름이 기억이 안나네)
					
				}
				
				for(int a : arr) {
					System.out.println(a);
				}
				
					
					System.out.println("Min : " + arr[n-1]);
					System.out.println("Max : "+ arr[0]);
					
					
				
			
	}
	
	public String hello() {
		return "";
	}

}
