package com.terminal.method.lunch.view;

import com.terminal.method.lunch.roulette.LunchRoulette;

public class LunchView {
	
	LunchRoulette lr = new LunchRoulette();
	
	
	public void MainView() {
		
		System.out.println("****** Main Menu ******");
		System.out.println(" 	오늘의 메뉴는???");
		
		
		System.out.println(" \n\n점심 메뉴를 추첨하는 중입니다.");
			for(int i =0; i< 20; i++) {
				
				System.out.print("#");
				
				if(i<4) {
					
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
				} else if(i<13) {
						
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
				} else {
					
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
				}
				
				
				if(i==19) {
					System.out.println();
				}
				
			}
			System.out.println("     오늘의 메뉴는?");
			lr.lunchMenu();
		
		
	}
	
	
	
}
