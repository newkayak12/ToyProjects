package com.terminal.method.kh.portal.model.vo;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Student implements Serializable, Comparable<Student> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8128961234952448939L;
	private String name, phone;
	int java,sql;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	




	public Student(String name, String phone ) {
		this.name = name;
		this.phone = phone;
		
	}






	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getSql() {
		return sql;
	}

	public void setSql(int sql) {
		this.sql = sql;
	}



	@Override
	public int hashCode() {
			
		return Objects.hash(name, phone);
	
	}



	@Override
	public boolean equals(Object obj) {
			if(this == obj) {
				return true;
			} else if( obj instanceof Student) {
				Student other = (Student) obj;
					if( other.name.equals(this.name) && other.phone.equals(this.phone)) {
						return true;
					}
				
			}
			return false;
	}



	@Override
	public String toString() {
		return " name : " + name + "phone : " + phone;
	}






	






	@Override
	public int compareTo(Student o) {
		if(this.name.equals(o.name)) {
			return this.phone.compareTo(o.phone);
		} else {
			return this.name.compareTo(o.name);
		}
	}
	
	
}
