package files;

import java.io.File;

public class files {

	public static void main(String[] args) {
		
//		String pathes =files.class.getResource("../../").getPath();
		File path = new File("../");
		File[] list = path.listFiles();
		
		for(File i :list) {
			
			System.out.println(i);
		}
		
	}
		
}
