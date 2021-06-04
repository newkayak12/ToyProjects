package array;

import java.util.Scanner;


public class Pnum10818_MaxAndMin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] array = new int[5];
		
			for(int i=0; i<array.length; i++) {
				System.out.println("input number");
				array[i] = s.nextInt();
			}
		
			
		for(int i = 0; i<array.length; i++) {
			for(int j =i; j<array.length; j++) {
				if(i!=j) {
					if(array[i]>array[j]) {
						int temp =array[i];
						array[i]=array[j];
						array[j] = temp;
					}
				}
			}
		}
		
		for(int a : array) {
			System.out.println(a+", ");
		}
			
			
		
	}
}
