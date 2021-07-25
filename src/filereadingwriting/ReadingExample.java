package filereadingwriting;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingExample {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("D:\\workspace\\input.txt");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		System.out.println("adding for github purpose 1")
		
		for(String s: lines) {
			System.out.println(s.contains("Hello"));
		}

	}

}
