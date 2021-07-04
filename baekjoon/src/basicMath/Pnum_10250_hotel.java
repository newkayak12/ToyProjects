package basicMath;

import java.util.Scanner;

public class Pnum_10250_hotel {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			System.out.println("height");
		int height = scn.nextInt();
			System.out.println("width");
		int width = scn.nextInt();
			System.out.println("hth people");
		int nth = scn.nextInt();
		int count = 0;
		
			for(int i = 1; i<=width; i++) {
				for(int j =1; j<=height; j++) {
					count+=1;
					
					if(nth==count) {
						
							System.out.println("room number : ");
							
						if(i>9) {
							System.out.println(j+""+i);
						} else {
							
							System.out.println(j+"0"+i);
						}
						break;
					}
				}
			}
			
		
	}
}
