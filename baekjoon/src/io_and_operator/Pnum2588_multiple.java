package io_and_operator;

import java.util.Scanner;

public class Pnum2588_multiple {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("  ");
		int a = scn.nextInt();
		System.out.print("x ");
		int b = scn.nextInt();
		System.out.println("----");
		
		int[] bTemp = new int[3];
		bTemp[0] = (b/100)*100;
		bTemp[1] = ((b-bTemp[0])/10)*10;
		bTemp[2] = b-bTemp[0]-bTemp[1];
		
		
		bTemp[0] /= 100;
		bTemp[1] /= 10;
		
		
		int fir = a * bTemp[2];
		int sec = a * bTemp[1];
		int thr = a * bTemp[0];
		
		System.out.println("  "+fir);
		System.out.println(" "+sec);
		System.out.println(thr);
		System.out.println("----");
		System.out.println((fir)+(sec*10)+(thr*100));
		
		
		
		scn.close();
	}
}
