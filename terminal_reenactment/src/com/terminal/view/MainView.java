package com.terminal.view;

import java.util.Scanner;

import com.terminal.method.TerminalMethod;
import com.terminal.method.baseball.view.BaseView;
import com.terminal.method.calculator.view.CalcView;
import com.terminal.method.kh.portal.view.KhView;
import com.terminal.method.lunch.view.LunchView;

public class MainView {
	private TerminalMethod tm = new TerminalMethod();
	private Scanner scn = new Scanner(System.in);
	String fName="";
	
	
	public void main() {
			System.out.print("last login : " ); 
			tm.lastLog(); 
		while(true) {
			System.out.print("SangHyeon@macbook ~ % ");
			String input = scn.nextLine();
			int select = 0;
				if(input.contains("help")) {
					//명령어 출력
					help();
					
				} else if(input.contains("cd..")) {
					//return super directory
					
					cdback();
					
					
				} else if(input.contains("cd")) {
					
					
					//change directory
					String temp = input.substring(2, input.length()).trim();
					cd(temp);
					
					
				} else if(input.contains("ls")){
					
					//ls
					ls();
					
				} else if(input.contains("mkdir")) {
						
					
						//디렉토리 생성
						makerdir();
						
				} else if(input.contains("rm")) {
					
					
					//삭제
					fName = input.substring(input.indexOf(" ")+1, input.length());
					rm(fName);
					
				} else if (input.contains("clear")) {
					
					
					//cli클리어
					clear();
				
				
				} else if (input.contains("touch")) {
					
					
					 fName = input.substring(input.indexOf(" ")+1, input.length());
					 	touch(fName);
					 
					 
					 
					//파일 열람
				} else if (input.contains("write")) {
					//파일 쓰기
					
					fName = input.substring(input.indexOf(" ")+1, input.length());
						write(fName);
					
					
				} else if (input.contains("baseball")) {
					
					baseball();
					// 숫자야구 게임
					
				
				} else if (input.contains("now")) {
					
					//cli시간 출력
					now();
					
				} else if (input.contains("calculator")) {
					
					//계산기 실행
					calc();
					
				} else if (input.contains("kh")) {
					
					//통합정보 프로그램 작성(수강신청)
					port();
					
				} else if (input.contains("lunch")) {
					// 점심 내놔!
					lunch();
					
				} else if (input.contains("exit")) {
					// 종료
					System.out.println("cmd/ terminal terminated");
					return;
				}
		}
		
	}
	

	public void cdback() {
		
		tm.cdBack();
		
	}


	public void write(String fileName) {
		//
		
		tm.write(fileName);
		
		
	}
	
	
	public void rm(String fileName) {
		
		tm.rm(fileName);
		
	}
	
	public void touch(String fileName) {

		
		tm.touch(fileName);
		
		
	}
	
	
	public void now() {
		
			
			System.out.print("Current Date and Time : ");
		tm.today();
		
		
		
	}
	
	
	public void clear() {
		
		tm.clear();
		
	}
	
	
	public void makerdir() {
		
			System.out.println("directory name (eg. exam1/exam2 ... ");
		String dir = scn.next();
		tm.makedir(dir);
		
	}
	
	
	public void ls() {
		
		tm.ls();
		
	}
	
	
	public void cd(String temp) {
		
		
		tm.cd(temp);
		
		
	}
	
	
	public void help() {
		
		
		tm.help();
		
		
	}

	
////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	public void baseball() {
		System.out.println();
		System.out.println();
		System.out.println(" now loading please wait");
		
		for(int i =0; i<=20; i++) {
			System.out.print("#");
				
				if(i<5) {
						try {
							Thread.sleep(400);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				} else if(i< 12) {
						
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				} else if(i<19) {
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				} else if(i==20) {
					new BaseView().mainMenu();
				}
			
				
		}
//		
	}
	
	public void lunch() {

		LunchView lv = new LunchView();
		lv.MainView();
		
	}
	
	public void port() {
	
		KhView kh = new KhView();
		kh.login();
		
	}
	
	public void calc() {
	
		CalcView calc = new CalcView();
		calc.mainView();
	
	}
	
}
