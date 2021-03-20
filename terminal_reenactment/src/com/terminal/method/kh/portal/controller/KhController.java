package com.terminal.method.kh.portal.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.terminal.method.kh.portal.model.dao.StudentDao;
import com.terminal.method.kh.portal.model.vo.TeacherInfo;

public class KhController {
	private Map<String, TeacherInfo> teacherLogin = new HashMap<>();
	StudentDao sd = new StudentDao();
	File file = new File("teacher.database");
	
			
	public void teacherSave() {
		
		if(!file.exists()) {
			try(FileOutputStream fos = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fos);){
					
					
					oos.writeObject(teacherLogin);
				}catch (IOException e) {
					
				}
		}
		
		
		
	}
	
	public void teacherLoad()	{
		if(file.exists()) {
			Object o = null;
			try (FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);){
				
				o = ois.readObject();
				
				teacherLogin = (Map<String, TeacherInfo>) o;
				
				
			} catch (ClassNotFoundException | IOException e) {
				
			}
		}
		
				
	}
	
	
	
	
	
	
	
	
	
	public boolean signIn(String id, String pw) {
		teacherLoad();
		
		Set<String> keyset = teacherLogin.keySet();
		
		for( String key : keyset) {
			if(key.equals(id)) {
				
				if( (teacherLogin.get(key).getPassword()).equals(pw)) {
					System.out.println();
					System.out.println();
				
					System.out.println("\t"+teacherLogin.get(key).getName()+"님 안녕하세요!");
					System.out.println("\t로그인에 성공했습니다.");
					return true;
				}
			}
		}
		
		System.out.println("로그인에 실패했습니다.");
		return false;
	}
	
	public void signUp(String id, TeacherInfo info) {
		teacherLoad();
		int pre = teacherLogin.size();
		//선생님 접근 계정
		teacherLogin.put(id, info);
		
		int aft = teacherLogin.size();
			if(pre<aft) {
				System.out.println("게정이 성공적으로 생성되었습니다.");
				teacherSave();
			} else {
				System.out.println("계정 생성에 실패했습니다. ");
			}
	}
	
	
	
	
	public void enrollStudent(String name, String phone) {
		sd.enrollStudent(name, phone);
	}
	
	

	public void inputGrade(String name) {
		sd.inputGrade(name);
	}
	
	public void deleteStudent(String name) {
		sd.deleteStudent(name);
	}
	
	
	public void searchAll() {
		sd.searchAll();
	}

	public void searchPartial(String name) {
		sd.searchPartial(name);
	}
	
}
