package exceptionlearning;

public class NestedTryCatchExample {
	
	public static void main(String[] args) {
		
		try {
			int a =20/0;
		}catch(Exception e) {
			
			try {
				int b = 30/0;
			}catch(Exception a) {
				System.out.println("inside nested catch block");
				
				
			}
			
			
		}
		
		
	}

}
