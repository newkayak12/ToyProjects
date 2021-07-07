package basicMath;

import java.util.Scanner;

public class Pnum_2775_become {
    // a층의 b호에 살려면 (a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야한다.
    // k층 n호 몇 명??

    // 1호부터 있으며, 0층의 i 호에는 i명이 산다.


    /* 
        0층 1호 1명
        0층 2호 2명
        0층 3호 3명
        0층 4호 4명

        1층 1호 1명
        1층 2호 3명
        1층 3호 6명
        1층 4호 10명


        2층 1호 1호
        2층 2호 4호
        2층 3호 10명
        2층 4호 20명
    
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        	System.out.println("row");
        int row = scn.nextInt();	
        	System.out.println("column");
    	int col = scn.nextInt();
    	
    	int[][] array = new int[row][col];
       
        
        	for(int i =0; i<array.length; i++) {
		    		for(int j =1; j<= array[i].length; j++) {
		    			if(i==0) {
		    				array[0][j-1] = j;
		    				
		    			} else {
		    				for(int z= array[i].length-1; z<j; z--) {
		    					array[i][j-1] += array[i-1][z];
		    				}
		    			}
		    			
		    		}
		    		
        	}
        
        
        System.out.println(array[row-1][col-1]);
    }
}
