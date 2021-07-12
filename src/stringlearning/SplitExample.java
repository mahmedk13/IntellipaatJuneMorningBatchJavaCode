package stringlearning;

import java.util.Scanner;

public class SplitExample {
	
	public static void main(String[] args) {
		String s = "I am learning Java";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string:");
		String str1 = scan.nextLine();
		
		String[] strArray = s.split(" ");
		
		for(String str : strArray) {
			System.out.println(str);
		}
		
		System.out.println(strArray.length);

	}

}
