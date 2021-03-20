package com.terminal.method.calculator.operator;

public class CalcOperator {
	
	
	
	public void sum (double val1 , double val2 ) {
		
		String strVal1 = ((Double) val1).toString();
		String strVal2 = ((Double) val2).toString();
		
			if( strVal1.contains(".0") && strVal2.contains(".0") ) {
				int intVal1 = (int) val1;
				int intVal2 = (int) val2;
				
					System.out.println(intVal1 +" + "+ intVal2 +" = "+ (intVal1+intVal2));
					
			} else {
				
					System.out.printf("%.1f + %.1f = %.1f\n",val1, val2, val1 + val2);
			}
				 
	}
	
	
	public void sub ( double val1, double val2) {
		
		String strVal1 = ((Double) val1).toString();
		String strVal2 = ((Double) val2).toString();
		
			if( strVal1.contains(".0") && strVal2.contains(".0") ) {
				int intVal1 = (int) val1;
				int intVal2 = (int) val2;
				
				System.out.println(intVal1 +" - "+ intVal2 +" = "+ (intVal1-intVal2));
					
			} else {
				
					System.out.printf("%.1f - %.1f = %.1f\n",val1, val2, val1 - val2);
			}
	}
	
	
	
	public void mul (double val1, double val2) {
		String strVal1 = ((Double) val1).toString();
		String strVal2 = ((Double) val2).toString();
		
			if( strVal1.contains(".0") && strVal2.contains(".0") ) {
				int intVal1 = (int) val1;
				int intVal2 = (int) val2;
				
				System.out.println(intVal1 +" * "+ intVal2 +" = "+ (intVal1*intVal2));
					
			} else {
				
					System.out.printf("%.1f * %.1f = %.1f\n",val1, val2, val1 * val2);
			}
	}
	
	
	
	public void div (double val1, double val2) {
		
		String strVal1 = ((Double) val1).toString();
		String strVal2 = ((Double) val2).toString();
		
			if( strVal1.contains(".0") && strVal2.contains(".0") ) {
				int intVal1 = (int) val1;
				int intVal2 = (int) val2;
				
				System.out.println(intVal1 +" / "+ intVal2 +" = "+ (intVal1/intVal2));
					
			} else {
				
					System.out.printf("%.1f / %.1f = %.1f\n",val1, val2, val1 / val2);
			}
	}
	
}
