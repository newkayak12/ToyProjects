package com.terminal.method.baseball.rule;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.terminal.Exception.NoUsrNumThreeException;

public class BaseRule {
	private Scanner scn = new Scanner(System.in);
	

	private int[] computerNum = new int[3];
	private int[] userNum = new int[3];
	private int gameCount = 0;
	
	private int ballCount =0;
	private int strikeCount =0;
	private int outCount =3;
	private Set<Integer> comTemp = new HashSet<>();
	//스트라이크나 볼이 맞으면 1 아니면 0
	
	
	
	
	public int getGameCount() {
		return gameCount;
	}

	
	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}
	
	
	public int getBallCount() {
		return ballCount;
	}
	
	
	public void setBallCount(int ballCount) {
		this.ballCount = ballCount;
	}
	
	
	public int getStrikeCount() {
		return strikeCount;
	}
	
	
	public void setStrikeCount(int strikeCount) {
		this.strikeCount = strikeCount;
	}

	
	public int gameCounting() {
		
		return gameCount;
	}
	
	
	
	public void computerNumberInsert() {
		boolean run =true;
		int count =0;
		int k = 0;
		Iterator<Integer> it = comTemp.iterator();
					
			for(int i =0; i<100; i++) {
				
					if(comTemp.size()<3) {

						int temp = (int) (Math.random()*9)+1;
						comTemp.add(temp);
						
					}
					
				
			}
					
					
			if(comTemp.size() == 3) {
					
				for(Integer s : comTemp) {
						computerNum[count] =s ;
						count ++;
					}
			}
				
				
				
				
	}
	
	
	
	public void userNumberInsert(List<Integer> usrTemp) throws NoUsrNumThreeException{
			gameCount++;
		if(usrTemp.size() == 3 ) {
			
			for (int i =0; i<3; i++) {
				userNum[i] = usrTemp.get(i);
			}
			
			
			
			return;
		} else {
			
			throw new NoUsrNumThreeException("사용자가 세 개의 숫자를 입력하지 않았습니다.");
		}
		
		
	}

	
	public void strikeRule() {
		
			for(int comNum =0; comNum<computerNum.length; comNum++) {
				for(int usrNum = 0; usrNum<userNum.length; usrNum++) {
						
						if(comNum==usrNum) {
							if(computerNum[comNum] == userNum[usrNum]) {
								strikeCount++;
							}
							
						}
				}
//				123
//				1 1 2 3 s
//				2 1 2 3 s
//				3 1 2 3 s
			}
		
	}
	
	public void ballRule() {
		
		for(int comNum =0; comNum<computerNum.length; comNum++) {
			for(int usrNum = 0; usrNum<computerNum.length; usrNum++) {
					
					if(comNum!=usrNum) {
						if(computerNum[comNum] == userNum[usrNum]) {
							ballCount++;
						}
						
					}
					
//					182
//					823
//					1 8 2 3   카운 X
//					8 8 2 3   1
//					2 8 2 3   1
			}
			
		}
		
	}
	
	public void outRule() {
		
//		for(int comNum =0; comNum<computerNum.length; comNum++) {
//			for(int usrNum = 0; usrNum<computerNum.length; usrNum++) {
//					
//					if(comNum!=usrNum) {
//						if(computerNum[comNum]!= userNum[usrNum]) {
//							outCount++;
//							break;
//						}
//						
//					}
//			}
			// 123
			// 567
			// 1 6/7
			// 2 5/7
			// 3 5/6
			
			//189
			//123
			// 1 2/3
			// 8 1/3
			// 9 1/2
			
//		}
		
		if(strikeCount != 0) {
			outCount -= strikeCount;
		}
		
		if(ballCount != 0) {
			outCount -= ballCount;
		}
	}
	
	
	
	public boolean Aggregator() {
		strikeRule();
		ballRule();
		outRule();
		//합산 rule메소드의 리턴값을 가지고 
			
			
			System.out.println((gameCount)+"번째 게임의 결과는 "+strikeCount+" 스트라이크 /"+ballCount+" 볼 /"+ outCount+" 아웃입니다.\n" );
			System.out.println();
			System.out.println();
			System.out.println("계속 게임을 진행합니다.");
			System.out.println();
			
			
			if(strikeCount == 3) {
				System.out.println("게임에 승리했습니다.");
				return false;
			//게임을 끝냄
			}
			if(gameCount == 10) {
				System.out.println("게임에 패배했습니다.");
				return false;
			}
			
			countCleaner();
			return true;
			//게임을 계속
	}
	
	public void countCleaner() {
		strikeCount =0;
		ballCount = 0;
		outCount =3;
	}
	
	
}
