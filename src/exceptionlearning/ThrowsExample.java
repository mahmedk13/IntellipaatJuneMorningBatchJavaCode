package exceptionlearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsExample {
	
	
	public void readFromFile() throws Exception {
		
		File f = new File("D:/workspace/input.txt");
		FileInputStream fis=null;
		fis = new FileInputStream(f);
			
		fis.read();
			
			int x =50/0;
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		ThrowsExample te = new ThrowsExample();
		te.readFromFile();

	}

}
