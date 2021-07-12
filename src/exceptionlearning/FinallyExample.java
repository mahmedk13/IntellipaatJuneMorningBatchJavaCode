package exceptionlearning;

public class FinallyExample {
	
	public static void main(String[] args) {
		
		try {
			int x =100/10;
			System.out.println(x);
		}catch(Exception e) {
			System.out.println("inside catch block");
		}finally {
			System.out.println("I am inside finally");
		}
		
		
	}

}
