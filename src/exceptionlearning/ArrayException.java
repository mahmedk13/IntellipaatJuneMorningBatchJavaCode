package exceptionlearning;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40};
		
		try {
		System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(arr[3]);
			
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("line 1");
		System.out.println("line 2");
		
		

	}

}
