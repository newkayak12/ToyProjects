package com.terminal.method.baseball.controller;

import java.util.List;

import com.terminal.Exception.NoUsrNumThreeException;
import com.terminal.method.baseball.rule.BaseRule;

public class BaseController {
	BaseRule br = new BaseRule();
	
	public BaseController() {
		// TODO Auto-generated constructor stub
	}
	
	public void initiateGame() {
		br.computerNumberInsert();
	}
	
	public void  processingGame(List<Integer> input) { 
			if(br.getGameCount() != 10) {
				
					try {
						br.userNumberInsert(input);
					} catch (NoUsrNumThreeException e) {
						e.getMessage();
					}
			}
		
	}
	
	public boolean gameJudgment() {
		
		if(br.Aggregator() == true) {
			return true;
		} else {
			return false;
		}
	}
		
	
	
	
	
}
