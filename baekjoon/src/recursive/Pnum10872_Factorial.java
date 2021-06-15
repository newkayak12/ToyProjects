package recursive;

import numbers.Factorial;

public class Pnum10872_Factorial {

	/*
	 
	   0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

		입력
		첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
		
		출력
		첫째 줄에 N!을 출력한다.
	 */
	public static void main(String[] args) {
		Pnum10872_Factorial factorials = new Pnum10872_Factorial();
		
		System.out.println("result :"+factorials.factorial(10));
		
		
	}
	
	public int factorial(int number) {
		 int sum = 1;
		 
		 	if(number==0) {
		 		return sum;
		 		
		 	} else {
		 		
		 		sum*=number;
		 		--number;
		 		sum*=factorial(number);
		 		System.out.println("process : "+sum);
		 		
		 		/*
		 		 * 1*10
		 		 * 10*9
		 		 * .....
		 		 * 
		 		 * 
		 		 */
		 		
		 	}
		 	return sum;
		
	}
}
