package com.terminal.method;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;


public class TerminalMethod {
	
	private String temp = (TerminalMethod.class.getResource("/").getPath()+"/");
	private	String path = temp.substring(0,temp.lastIndexOf("bin"));
	private	String pathcd = path;
//	File file = new File(path);
	private Scanner scn = new Scanner(System.in);

	
	public void lastLog() {
		String path = TerminalMethod.class.getResource("/").getPath();
		path = path.substring(0,path.lastIndexOf("bin"));
		
		File file = new File("log.txt");
		File pathfile = new File(path);
		String temp = "";
		
		
		
		if(file.exists()) {
			
				try(	FileInputStream fin = new FileInputStream(file);
						DataInputStream dis = new DataInputStream(fin);	){
					String now = dis.readUTF();
						System.out.println(now);
				} catch ( IOException e	) {
					e.printStackTrace();
				}
				
				
				try(	FileOutputStream fi = new FileOutputStream(file);
						DataOutputStream dos = new DataOutputStream(fi);    ){
					
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					dos.writeUTF(String.valueOf(sdf.format(date)));
					dos.flush();
				
				} catch(IOException e) {
					
				}
				
				
				
		} else {
			
			try(	FileOutputStream fi = new FileOutputStream(file);
					DataOutputStream dos = new DataOutputStream(fi);){
				
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD  HH:mm:ss");
				temp = sdf.format(date);
				dos.writeUTF(temp);
				
				dos.flush();
			}catch(IOException e) {
				e.printStackTrace();
			}
				
		}
		
	}
	
	public void help() {
		
		System.out.println(" cd         : change directory");
		System.out.println(" cd..       : return to super folder");
		System.out.println(" mkdir      : make a directory");
		System.out.println(" ls         : show all folders and files ");
		System.out.println(" touch      : open text file (eg. touch filename)");
		System.out.println(" write      : write text file (eg. write filename)");
		System.out.println(" rm         : remove file or folders");
		System.out.println(" clear      : clean command line/terminal");
		System.out.println(" baseball   : play number baseball app");
		System.out.println(" calculator : caculator");
		System.out.println(" now        : print time and date now app");
		System.out.println(" lunch      : print today's recommanded lunch menu app");
		System.out.println(" kh         : launch kh univ portal app");
		System.out.println(" exit       : terminate command line/terminal");
		
	}
	
	public void cd(String npath) {
		
		this.pathcd = pathcd +"/"+ npath;
		File cd = new File(pathcd);
			System.out.println(cd.getAbsolutePath());
	}
	
	
	public void cdBack(){
		
		
		String[] temp = (this.pathcd).split("/");
		StringBuilder pathBuild = new StringBuilder();
		
		
			for( int i =0; i < temp.length-1; i++) {
				pathBuild.append(temp[i]+"/");
				
			}
			
			pathcd = pathBuild.toString();
			
	}
	
	
	public void makedir(String dir) {
		File mkd = new File(pathcd+"/"+dir);
		mkd.mkdirs();
	}
	
	
	public void ls() {
		File listfile = new File(pathcd);
		String[] list = listfile.list();
		
			
			System.out.println("\npath now : " + listfile + "\n");
			
		
			try {
					
					for(String lists : list) {
						
						System.out.println(lists);
						
					}
					
			} catch ( NullPointerException e ) {
				
				System.out.println(" Empty \n\n");
				
			}
	}
	
	public void touch(String fileName) {
		File tou = new File(pathcd+fileName);
		
		
		StringBuilder temp = new StringBuilder();
			if(tou.exists()) {
					System.out.println("=======t e x t=======");
					System.out.println();
					try(FileInputStream fi = new FileInputStream(tou);
						BufferedInputStream bis = new BufferedInputStream(fi);
						InputStreamReader isr = new InputStreamReader(bis);	){
						
						int data = -1;
						
							while(( data = isr.read()) != -1) {
								
								
								System.out.print( (char) data );
								
								
							}
							
							System.out.println("\n");
							System.out.println("=====================");
						
					} catch ( IOException e) {
						
						System.out.println("해당 파일이 없습니다.");
						
					}
						
				
				
			}
			
	}
	
	public void write(String fName) {
		File file = new File(pathcd+ fName);
		
		
		String write = "";
		
			try(FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bos = new BufferedOutputStream(fos);	
				OutputStreamWriter for1 = new OutputStreamWriter(bos);){
				
					System.out.println("텍스트 편집기를 실행했습니다. (종료하려면 \'태양의 식후 비법\'을 입력해주세요.)");
					System.out.print("내용을 입력해주세요 > ");
					
					while(true) {
						write =  scn.nextLine();
						
						
							
							if(write.equals("태양의 식후 비법")) {
								
								return;
								
							} else {
	
								for1.write(write);
								
							}
					}
					
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
			
			
		
	}
	
	
	
	public void rm (String fName) {
		File rmFile = new File(pathcd+fName);
			if (rmFile.exists()) {
				
				rmFile.delete();
					System.out.println("\'"+fName+"\'을 삭제했습니다.");
				
			} else {
				
				System.out.println("해당 파일이 없습니다.");
			
			}
				
	}
	
	
	
	public void clear() {
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}
	
	
	
	
	
	//
	public void today() {
		LocalDateTime now = LocalDateTime.now();
		int month = 0;
		System.out.println(now.getYear()+"-"+now.getMonthValue()+"-"+now.getDayOfMonth()+"  "+now.getHour()+":"+now.getMinute()+":"+now.getSecond());
	}
	
	
	////////////////////////
	//
	//
	//
	//
	///////////////////////
	
	
	
}
