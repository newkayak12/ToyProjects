package com.terminal.run;

import java.time.LocalDate;

import com.terminal.view.MainView;

public class RunTerminal {

	public static void main(String[] args) {
		new MainView().main();
		
		LocalDate ld = LocalDate.now();
		ld.isLeapYear();
	}

}


// 예시 : 일정관리, 전화번호 관리, 서적관리, 학생관리, 가계부
//주요 기능 : 학생 등록/ 학생 검색/ 조회 결과(sorting) / 패키지 설계
// 조건 : 반드시 저장된 데이터를 유지해야한다. (영속성)/ 데이터 관리는 Collection객체를 이용해서 처리할 것
// 											프로그램이 중단 되지 않도록 (예외처리)
//                                           예외가 발생하면 그 내용 로그로 남기기

// 3/12 까지
