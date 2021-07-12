package exceptionlearning;

public class ArithmeticExceptionExample {
	
	public void divide() {
		int x=50;
		
		try {
		System.out.println(x/0);
		}catch(ArithmeticException e) {
			System.out.println(x/10);
			System.out.println("division by zero is undefined");
		}
	}
	
	public static void main(String[] args) {
		
		
		ArithmeticExceptionExample ae = new ArithmeticExceptionExample();
		ae.divide();
		
		
	}

}
