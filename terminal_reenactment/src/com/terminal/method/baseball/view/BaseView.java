package com.terminal.method.baseball.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.terminal.Exception.NoUsrNumThreeException;
import com.terminal.method.baseball.controller.BaseController;

public class BaseView {
	private Scanner scn = new Scanner(System.in);
	private BaseController bc = new BaseController();
	
	
	public void mainMenu() {
		
			System.out.println();
			System.out.println("\n\n ***** Number Baseball Game *****");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("       1.   game start");
			System.out.println("       2.       quit ");
			System.out.print(">");
		int input = scn.nextInt();
		
			
			switch(input) {
				case 1: 
					gameStart();
					break;
				case 2:
					System.out.println("return to menu");
					return;
					
				default : 
					
			}
	}
	
	
	
	
	
	private void gameStart() {
		System.out.println("컴퓨터가 숫자를 선택 중입니다.");
		
		bc.initiateGame();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
			do {
				List<Integer> init = new ArrayList<Integer>();
					System.out.println("수를 입력해주세요");
				String input = scn.next();
				String first ="";
				String second ="";
				String third ="";
					try {
							first = input.substring(0,1);
							second = input.substring(1,2);
							third = input.substring(2,3);
							
					} catch(StringIndexOutOfBoundsException e) {
						System.out.println("세 자리의 숫자를 입력해주십시오");
						continue;
						
					} catch(NullPointerException n) {
						System.out.println("숫자를 입력해주세요");
						continue;
						
						
						
						
					} finally {
						try {
							init.add(Integer.parseInt(first));
							init.add(Integer.parseInt(second));
							init.add(Integer.parseInt(third));
							
						} catch (NumberFormatException e) {
						
							System.out.println("사용자가 세 개의 숫자를 입력하지 않았습니다.");
							return;
							
						}
						
					}
					
				
				
				bc.processingGame(init);
			}while(bc.gameJudgment());
				
		
		
		
	}	
	
	
}
