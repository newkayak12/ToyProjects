package com.terminal.method.kh.portal.view;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.terminal.method.kh.portal.controller.KhController;
import com.terminal.method.kh.portal.model.vo.TeacherInfo;

public class KhView {
	Scanner scn = new Scanner(System.in);
	KhController kc = new KhController();
	
	
	public void login() {
		boolean flag = true;
		
		
		while(flag) {
			
			System.out.println("********** welcome to kh port **********");
			System.out.println("         1.   login ");
			System.out.println("         2.   return to menu");
			
		if(scn.nextInt() == 1) {	
			
					System.out.println(" =========================== ");
					System.out.print("     ID   :  ");
				String id = scn.next();
					System.out.print(" PassWord :   ");
				String pw = scn.next();
					System.out.println(" =========================== ");
				
						if( kc.signIn(id, pw) /*아이디 일치  login */) {
							
							
							
							mainView();
							flag  = false;
						
						} else {
								System.out.println("계정이 없으므로 회원 가입을 시작합니다.");
								System.out.println("미리 배부된 인증 번호를 입력하십시오");
							String authenti = scn.next();
								if(authenti.equals("유병승==강동원")) {
									
									signUp();
								} else {
									System.out.println("잘못된 인증키 입니다."); 
								}
							
						}
		} else {
			System.out.println("return to menu");
			return;
		}
		
		}
	}
	
	public void signUp() {
		//controller의 signUp()
			
			System.out.println("사용할 아이디를 입력하세요 : ");
		String id = scn.next();
			
			System.out.println(" 사용할 비밀번호를 입력하세요 : ");
		String pw = scn.next();
			
			System.out.println("이름을 입력하세요 : ");
		String name = scn.next();
			
			System.out.println("담당 과목을 입력하세요 : ");
		String subject = scn.next();
		
			System.out.println("휴대전화 번호를 입력하세요 ('-' 없이 10자리 혹은 11자리 숫자: ");
		String phone = scn.next();
		
		boolean result;
			if(phone.length()==11) {
				result= true;
			} else {
				result = false;
			}
		
		
		if(result) {
			TeacherInfo teacher = new TeacherInfo(name, pw, phone, subject);
			kc.signUp(id, teacher);
			
		} else {
			
			System.out.println("올바른 전화번호가 아닙니다. 다시 진행해 주세요");
			
		}

		
	}

	public void mainView() {
		int input = 0;
			while(true) {	
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("=============================");
					System.out.println();
					System.out.println("     세계를 선도해 나가는 KH");
					System.out.println();
					System.out.println("=============================");
					System.out.println("        1. 학생 관리");  //1학생 등록 //2성적 입력 //3학생삭제
					System.out.println("        2. 학생 검색");  //1부분 검색(오름차순) //2 전체 검색(오름차순) 
					System.out.println("        0. 종    료 ");
				
					try {
							input = scn.nextInt();
							
					} catch (InputMismatchException  e) {
						
							input = 3;
					}
					
					switch(input) {
						case 1: 
							//학생 관리
							managementView();
							break;
						case 2: 
							//학생 검색
							searchView();
							break;
						case 0: 
							//종료
							System.out.println("메인으로 돌아갑니다.");
							return;
						default : 
							System.out.println("잘못된 입력입니다.");
							break;
					}
		
			}
			
	}
	
	
	
	public void managementView() {
		int input = 0;
		 //1학생 등록 //2성적 입력 //3학생삭제
			while(true) {
				
					System.out.println(" =============== ");
					System.out.println("  1. 학생 등록");
					System.out.println("  2. 성적 입력");
					System.out.println("  3. 학생 삭제");
					System.out.println("  0. 메인으로 ");
				
					try {
						input = scn.nextInt();
					} catch( InputMismatchException e) {
						System.out.println("잘못된 입력입니다.");
						continue;
					}
					
					switch(input) {
						case 1: 
							//controller의 등록
							enrollStudent();
							break;
						case 2: 
							//입력
							inputGrade();
							break;
						case 3: 
							//삭제
							deleteStudent();
							break;
						case 0: 
							System.out.println("메인으로 돌아갑니다.");
							return;
						default : 
							System.out.println("잘못된 입력입니다.");
								
						
					}
					
			}
			
		
	}
	
	
	public void deleteStudent() {
			System.out.println("삭제할 이름을 입력해주세요");
		String name = scn.next();
		kc.deleteStudent(name);
		System.out.println("삭제 완료");
	}

	public void inputGrade() {
			System.out.println("성적을 입력할 이름을 입력해주세요");
		String name = scn.next();
		kc.inputGrade(name);
	}

	public void enrollStudent() {
			System.out.println("학생의 이름을 입력해주세요");
		String name = scn.next();
			System.out.println("학생의 전화번호를 입력해주세요");
		String phone = scn.next();
		
		
			if(phone.length()==11) {
				
				kc.enrollStudent(name, phone);
			} else {
				
				System.out.println("잘못된 휴대전화 번호입니다.");
			}
	}

	
	
	public void searchView() {
		int input = 0;
		
			while(true) {
				System.out.println(" ============= ");
				System.out.println("   1.부분 검색");
				System.out.println("   2.전체 검색");
				System.out.println("   0.메인으로 ");
				
				try {
					input = scn.nextInt();
					
				} catch (InputMismatchException e) {
					System.out.println("잘못된 입력입니다.");
					continue;
				}
				
				switch(input) {
				
					case 1:
						//부분 검색
						searchPartial();
						break;
					case 2:
						//전체 검색
						searchAll();
						break;
					case 0:
						return;
					default :
						System.out.println("잘못된 입력입니다.");
						break;
							
				}
			
		//1부분 검색(오름차순) //2 전체 검색(오름차순)
			}
	}

	public void searchAll() {
		kc.searchAll();
	}

	public void searchPartial() {
			System.out.println("검색할 이름을 입력해주세요");
		String name = scn.next();	
		kc.searchPartial(name);
	}
	
	
	
	
	
}
