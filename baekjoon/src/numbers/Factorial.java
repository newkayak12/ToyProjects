package numbers;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
				System.out.println("insert number");
		int times = s.nextInt();
		int result = 1;
		
			for(int i=times; i>0; i--) {
				result*=i;
			}
		
		
				System.out.println("result : "+result);
	}
}
