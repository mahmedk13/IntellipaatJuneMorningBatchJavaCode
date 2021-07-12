
public class SwitchVowelExample {

	public static void main(String[] args) {
		
		char ch = 'B';
		int i =5;
		
		switch(ch) {
		
		
		case 'A': System.out.println("vowel");
		case 'a': System.out.println("vowel");
		break;
		case 'E': System.out.println("Vowel");
		          if(i>5) {
		        	  System.out.println("value of i: "+i);
		          }else {
		        	  System.out.println("i is not greater than 5");
		          }
		break;
		case 'I': System.out.println("Vowel");
		break;
		case 'O': System.out.println("Vowel");
		break;
		case 'U': System.out.println("Vowel");
		default: System.out.println("consonant");
		
		
		
		
		
		}

	}

}
