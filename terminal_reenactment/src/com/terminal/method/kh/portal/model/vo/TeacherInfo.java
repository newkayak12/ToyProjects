package com.terminal.method.kh.portal.model.vo;

import java.io.Serializable;

public class TeacherInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3853197320930473765L;
	private String name, pNo, subject, password;

	public TeacherInfo(String name, String password,  String pNo, String subject) {
		this.name = name;
		this.password = password;
		this.pNo = pNo;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public String getpNo() {
		return pNo;
	}

	public String getSubject() {
		return subject;
	}

	public String getPassword() {
		return password;
	}

	
}
