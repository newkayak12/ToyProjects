package array;

import java.util.Scanner;

public class Pnum8958_oxQuiz {
	public static void main(String[] args) {
		int score = 0;
		String[] result = new String[10];
		Scanner s = new Scanner(System.in);
		String view = "";
		
			for(int i=0; i<result.length; i++) {
						System.out.println("quiz result? o or x");
				String piece = s.next();
					
					if(piece.equals("o")) {
						result[i] = "o";
						score++;
						
						view += "o/ ";
					} else {
						result[i]="x";
						
						view += "x /";
					}
					
			}
			
			System.out.println("result : "+view);
			System.out.println("score : "+ score);
	}
}
