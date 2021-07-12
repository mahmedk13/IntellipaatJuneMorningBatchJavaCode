package exceptionlearning;

public class MultipleCatchExample {
	
	public static void main(String[] args) {
		
	try {
		int arr[] = new int[5];
		int x =100/10;
		arr[6]=x;
		
	}catch(ArithmeticException e) {
		System.out.println("Arithmetic exception occurs");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException occus");
	}catch(Exception e) {
		System.out.println("Parent exception occurs");
	}finally {
		System.out.println("finally");
	}
	
	System.out.println("rest of the code");
		
		
	}

}
