package stringlearning;

public class StringClassMethods {

	public static void main(String[] args) {

		String str = "    I am learning Java     ";
		System.out.println(str.trim());
		
		String str1 = "Welcome"; // 'w', 'e', 'l'
		System.out.println(str1.charAt(3));
		System.out.println(str.concat(str1));
		System.out.println(str1.endsWith("me"));
		System.out.println(str1.startsWith("Welc"));
		System.out.println(str1.contains("lco"));
		System.out.println(str1.indexOf('c'));
		System.out.println(str1.lastIndexOf('e'));
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.replace("m", "n"));
		
		char[] chArr = str1.toCharArray();
		
		for(char c : chArr) {
			System.out.println(c);
		}
		
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(2, 5));
		
		
		
		
	}

}
