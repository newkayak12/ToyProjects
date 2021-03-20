package com.terminal.method.lunch.roulette;

public class LunchRoulette {
	
	
	public void lunchMenu() {
				System.out.println();
			int random = (int) (Math.random() * 20 )+1;
			
				switch (random) {
					case 1: 
						System.out.println("쌀국수 어떄??");
						break;
					
					case 2:
						System.out.println("가츠동 먹으러 가자!");
						break;
	
					case 3: 
						System.out.println("김밥 좋지??");
						break;
	
					case 4: 
						System.out.println("비빔밥이다!");
						break;
	
					case 5: 
						System.out.println("김치찌개 좋지??");
						break;
	
					case 6: 
						System.out.println("스테이크 나쁘지 않지??");
						break;
	
					case 7: 
						System.out.println("우동 고!");
						break;
	
					case 8: 
						System.out.println("초밥 괜찮은데??");
						break;
	
					case 9: 
						System.out.println("떡볶이??");
						break;
	
					case 10: 
						System.out.println("순대 어때");
						break;
	
					case 11: 
						System.out.println("오뎅입니다.");
						break;
	
					case 12: 
						System.out.println("오므라이스 좋죠?");
						break;
	
					case 13: 
						System.out.println("파스타 가자!");
						break;
	
					case 14:
						System.out.println("햄버거 괜찮지?");
						break;
	
					case 15:
						System.out.println("커리ㅋㅋㅋ");
						break;
	
					case 16:
						System.out.println("치느님!");
						break;
	
					case 17: 
						System.out.println("탕수육!!!");
						break;
	
					case 18: 
						System.out.println("냉면??");
						break;
	
					case 19:
						System.out.println("볶음밥@@");
						break;
	
					case 20:
						System.out.println("짜장면 짜장면이다!");
						break;
						
					default:
						break;
				}
			System.out.println("\n\n");
		}
	
	
}
