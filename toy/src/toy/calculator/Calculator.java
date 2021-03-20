package toy.calculator;

import java.util.Scanner;

public class Calculator {


	public void ex_calculator() {
		boolean run = true;
		int fir,  sec;
		Scanner scn = new Scanner(System.in);
		do {
		System.out.print("첫 번째 값을 입력 : ");
		fir = scn.nextInt();
		System.out.print("두 번째 값을 입력 : ");
		sec = scn.nextInt();
		int result = fir + sec;
		System.out.println(fir + "+" + sec +"="  + result);
		System.out.print("다시 한 번 계산하겠습니까? y/n");
		String quit = scn.next();
		
		if(quit.equals("y")) {
			run = true;
		}else if(quit.equals("n")) {
			run =false;
			System.out.println("프로그램을 끝냅니다.");
		} 
		}while(run);
	}
}
