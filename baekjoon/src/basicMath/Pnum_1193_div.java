package basicMath;

import java.util.Scanner;

public class Pnum_1193_div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		/*
		 *  1/1 1/2 1/3 1/4 1/5
		 *  2/1 2/2 2/3 2/4 2/5
		 *  3/1 3/2 3/3 3/4 3/5
		 *  4/1 4/2 4/3 4/4 4/5
		 *  5/1 5/2 5/3 5/4 5/5
		 *  
		 *  1/1 > 1/2 > 2/1 > 1/3 > 2/2 > 3/1
		 *  
		 *  
		 *  1/1 (1/2, 2/1) (1/3 2/2 3/1)
		 *  몇 번째 줄인지는 index로 세는거고
		 *  
		 */
		
		int[] a = new int [100];
		
		
			for(int i = 0; i< a.length; i++) {
				a[i] = (i+1);
			}
			
				System.out.println("number");
		int number = s.nextInt();
//		입력 받은 숫자
		int i = 0;
//		 1/1 (1/2, 2/1) (1/3 2/2 3/1) 과 같이 묶었을 때 인덱스 번호
//		 그리고 해당 배열의 순회 시작점 
		int count = 0;
//		입력 받은 값 전 인덱스까지의 분수의 개수
		int real = number;
		
			for(i = 0; i<a.length; i++) {
				
				count+=a[i];
				
				if(count>=number) {
					count-=a[i];
					real -= count;
					i+=2;
					break;
				}
				
			}
			System.out.println(i);
			System.out.println(real);
			
			int bot = i-real;
			int top = i-bot;
			System.out.println(number+"번쨰 분수는 ? : "+top+"/"+bot);
			

		
	}

}
