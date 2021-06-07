package fibonaccinumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pnum_10870_fibonacci {
	public static void main(String[] args) {
		List<Integer> fibonacci = new ArrayList();
		Scanner s = new Scanner(System.in);
				fibonacci.add(0);
				fibonacci.add(1);
				
				
				for(int i =2; i<30; i++) {
					fibonacci.add( fibonacci.get(i-2)+fibonacci.get(i-1));
				}
			
				
				System.out.println("insert number");
		int n = s.nextInt();
				System.out.println(fibonacci.get(n));
//			
		
	}
}
