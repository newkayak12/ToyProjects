package com.terminal.method.calculator.view;

import java.util.Scanner;

import com.terminal.method.calculator.operator.CalcOperator;

public class CalcView {
	Scanner scn = new Scanner(System.in);
	CalcOperator calc  =  new CalcOperator();
	
	
	
	public void mainView () {
					System.out.println("choose operator what do you want to do? +, -, /, *");
				
				String operator = scn.next();
				
				
				
				
					switch(operator) {
					
					
						case "+" :
							plus();
							break;
							
						case "-" :
							sub();
							break;
							
						case "/" :
							div();
							break;
							
						case "*" :
							mul();
							break;
						
						default : 
							System.out.println("invalid operator");
							
						
			}
		
			
		
		
		
		
	}
	
	public void plus() {
			System.out.print("enter first Number : ");
		double firNum = scn.nextDouble();
			System.out.print("enter second Number : ");
		double secNum = scn.nextDouble();
		
		calc.sum(firNum, secNum);
	}
	
	
	public void sub() {
		
			System.out.print("enter first Number : ");
		double firNum = scn.nextDouble();
			System.out.print("enter second Number : ");
		double secNum = scn.nextDouble();
		
		calc.sub(firNum, secNum);
		
	}
	
	
	public void mul() {
		
			System.out.print("enter first Number : ");
		double firNum = scn.nextDouble();
			System.out.print("enter second Number : ");
		double secNum = scn.nextDouble();
		
		calc.mul(firNum, secNum);
		
	}
	
	public void div() {
		
			System.out.print("enter first Number : ");
		double firNum = scn.nextDouble();
			System.out.print("enter second Number : ");
		double secNum = scn.nextDouble();
		
		calc.div(firNum, secNum);
		
		
	}
	
	
}
