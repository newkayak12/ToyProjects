package forStatement;

import java.util.Scanner;

public class Pnum10950_AplusB_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
			
					System.out.println("how many times do you operate?");
			int count = scn.nextInt();
				
				for(int i=0; i<count; i++) {
							System.out.println("first number");
					int A = scn.nextInt();
							System.out.println("first number");
					int B = scn.nextInt();
						
					
							System.out.println(A + " + " + B + " = " + (A+B));
					
				}
			scn.close();

	}

}
