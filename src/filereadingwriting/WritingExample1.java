package filereadingwriting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingExample1 {

	public static void main(String[] args) throws IOException {
		
		String str = "Hello";
		
		File f = new File("D:\\workspace\\input1.txt");
		FileWriter fw = new FileWriter(f, true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		//bw.write(str);
		
		bw.append(" World");
		bw.close();

		

	}

}
