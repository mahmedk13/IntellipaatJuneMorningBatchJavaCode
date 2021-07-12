package stringlearning;

public class StringExample {
	
	public static void main(String[] args) {
		
		//3 ways of creating String
		
		//String literal
		//they are more memory efficient
		String s = "Hello"; //Hello
		String s1 = "hello";
		String s2 = "Hello";
		String s3 = "Hello";
		
		
		
		String[] strArray = {"hello", "welcome", "true", "name"};
		
		//str[i].equals(str[i+1])
		
		System.out.println(s==s1);
		
		
		
		String str = new String("Welcome"); //wElCOME
		String str1 = new String("welcome"); //WeLcoMe
		String str2 = new String("Welcome");
		
		System.out.println(str.equalsIgnoreCase(str1));

		System.out.println(str==str1);
		
		
		char[] ch = {'h', 'e', 'l', 'l', 'o'};
		String str3 = new String(ch);
		System.out.println("str3 is: "+str3);
		
	}	

}
