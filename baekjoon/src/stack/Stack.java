package stack;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Stack {
	public static int[] stack = new int[5];
	public static int top = -1;
	
	public static void push(int input) {
		
		stack[top] = input;
		top+=1;
	}
	
	public static void pop() {
		if(top!=-1) {
			
			System.out.println(stack[top]);
			stack[top] = 0;
			top-=1;
		}
	}
	
	public static void size() {
			System.out.println(stack.length);
	}
	
	public static void empty() {
		
		if(top!=-1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
	
	public static void top() {
		System.out.println(top);
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		do {
			
			System.out.println("enter");
			String input = scn.nextLine();
			
			
			if(input.contains("push")) {
				push(Integer.parseInt(input.substring(4).replaceAll(" ", "")));
				scn.nextLine();
				
			} else if(input.contains("pop")) {
				pop();
				scn.nextLine();
				
			} else if(input.contains("size")) {
				size();
				scn.nextLine();
				
			} else if(input.contains("empty")) {
				empty();
				scn.nextLine();
				
			} else if(input.contains("top")) {
				top();
				scn.nextLine();
			}
			
			
			
			
			System.out.println("continue? y/n");
		}while(scn.next().equals("y"));
	}
}
