package array;

import java.util.Scanner;

public class Pnum2577_NumberOfNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a =0;
		int b =0;
		int c =0;
		boolean flag = true;
		int[] numberCount = new int [10];
		
		
				while(flag) {
								System.out.println("100<= Number <=1000");
								System.out.println("first Number");
						a = scn.nextInt();
								System.out.println("second Number");
						b = scn.nextInt();
								System.out.println("third Number");
						c = scn.nextInt();
						
					if( (((a>=100)&&(a<=1000)) && ((b>=100)&&(b<=1000)) && ((c>=100)&&(c<=1000)) )) {
							flag = false;
					} else {
						
									System.out.println("Wrong Number");
					}

				}
		
		int result = a*b*c;
		String resultToString = String.valueOf(result);
		char[] count = resultToString.toCharArray();
				
				for(int i=0; i<count.length; i++) {
							switch (count[i]) {
								case '0' :  
									numberCount[0]++;
									break;
								case '1' : 
									numberCount[1]++;
									break;
								case '2' : 
									numberCount[2]++;
									break;
								case '3' : 
									numberCount[3]++;
									break;
								case '4' : 
									numberCount[4]++;
									break;
								case '5' : 
									numberCount[5]++;
									break;
								case '6' : 
									numberCount[6]++;
									break;
								case '7' : 
									numberCount[7]++;
									break;
								case '8' : 
									numberCount[8]++;
									break;
								case '9' : 
									numberCount[9]++;
									break;
									
							
							}
							
							
							
				}

					System.out.println();
					
				for(int i = 0; i<numberCount.length; i++) {
						
								System.out.println(i+"는 "+numberCount[i]+"개 있습니다.");
				}
	
		
		
		
	}

}
