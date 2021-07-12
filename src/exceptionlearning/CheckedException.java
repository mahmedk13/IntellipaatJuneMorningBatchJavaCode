package exceptionlearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
	
	public void readFromFile() {
		File f = new File("D:/workspace/input.txt");
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(f);
			
			fis.read();
			
			int x =50/0;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				//fis.close();
			
		}
	
	
	}

	public static void main(String[] args) {
		
		CheckedException ce = new CheckedException();
		ce.readFromFile();

	}

}
