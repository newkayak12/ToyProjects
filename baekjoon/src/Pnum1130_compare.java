import java.util.Scanner;

public class Pnum1130_compare {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
			System.out.println("first Number");
		int a = scn.nextInt();
			System.out.println("second Number");
		int b = scn.nextInt();
		
			if(a>b) {
				System.out.println(">");
			} else if( a<b) {
				System.out.println("<");
			} else if( a==b) {
				System.out.println("=");
			}
		
		
	}
}
