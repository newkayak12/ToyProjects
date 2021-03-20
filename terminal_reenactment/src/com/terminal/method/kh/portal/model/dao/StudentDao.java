package com.terminal.method.kh.portal.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.terminal.method.kh.portal.model.vo.Student;

public class StudentDao {
	List<Student> stuList = new ArrayList<>();
	File file = new File("Students.database");
	Scanner scn = new Scanner(System.in);
	int java = 0;
	int sql = 0;
	
	// 로그인 세션 
	//데몬스레드?
	
	public void loadFile() {
		Object o = null;
		
		try(
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);){
			
				o = ois.readObject();
			
				stuList = (List<Student>) o;
			
		} catch (ClassNotFoundException  | IOException e	) {
			
		}
		
	}
	
	
	
	public void saveFile() {
		try(
			 FileOutputStream fos = new FileOutputStream(file);
			 ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			
			
			oos.writeObject(stuList);
			
		
		
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	public void enrollStudent(String name, String phone) {
			if(file.exists()) {
				loadFile();
			} 
		
		
		
	
		
		stuList.add(new Student(name, phone));
		
		
		
		
		saveFile();
		
		
	}
	
	
	
	public void inputGrade(String name) {
		
		
		
			if(file.exists()) {
				loadFile();
			}  else {
				
				System.out.println("학생을 먼저 등록해주세요");
				return;
			}
	
		
				stuList.size();
				for(int i = 0; i<stuList.size(); i++)	{
				
					if( (stuList.get(i).getName()).equals(name) ){
						
						try {
								System.out.println("java 성적 : ");
							java = scn.nextInt();
								System.out.println(" sql 성적 : ");
							sql = scn.nextInt();
							
							stuList.get(i).setJava(java);
							stuList.get(i).setSql(sql);
							break;
						
						} catch( InputMismatchException e) {
							System.out.println("잘못된 입력입니다. ");
						}
						
					}
				
			}
			
			saveFile();
		
	}
	
	
	
	
	public void deleteStudent(String name ) {
			
		
			if(file.exists()) {
				loadFile();
			}  else {
				
				System.out.println("학생을 먼저 등록해주세요");
				
				return;
			}
		
			for(int i =0; i<stuList.size(); i++) {
				
				if( (stuList.get(i).getName()).equals(name) ) {
					
					stuList.remove(i);
					
					
				}
			}
			
			
			saveFile();
		
		
	}
	
	
	
	
	public void searchAll() {
		
		if(file.exists()) {
			loadFile();
			
		}  else {
			
			System.out.println("학생을 먼저 등록해주세요");
			
			
			return;
		}
		
		Collections.sort(stuList);
		
			System.out.println("이름\t휴대폰 번호\tjava\tsql");
			System.out.println("-----------------------------------");
			
			for(int i =0; i<stuList.size(); i++) {
				
				System.out.println(stuList.get(i).getName()+"\t"+stuList.get(i).getPhone()+"\t"+stuList.get(i).getJava()+"\t"+stuList.get(i).getSql());
			}
		
		
			System.out.println("-----------------------------------");
	}
	
	
	public void searchPartial(String name) {
			if(file.exists()) {
				loadFile();
			}  else {
				
				System.out.println("학생을 먼저 등록해주세요");
				return;
			}
			
			Collections.sort(stuList);
		
				System.out.println("이름\t휴대폰 번호\tjava\tsql");
				System.out.println("-----------------------------------");
				
				for( int i=0; i<stuList.size(); i++) {
						if( (stuList.get(i).getName()).equals(name)) {
							
							System.out.println(stuList.get(i).getName()+"\t"+stuList.get(i).getPhone()+"\t"+stuList.get(i).getJava()+"\t"+stuList.get(i).getSql());
							
							
						}
						
				}
				
				System.out.println("-----------------------------------");
			
	}
	
	
	
	
}
