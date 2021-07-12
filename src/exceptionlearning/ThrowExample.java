package exceptionlearning;

import java.util.Scanner;

public class ThrowExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an age: ");
		int age = scan.nextInt();
		
		if(age==0 || age <0) {
			//System.out.println("this is not a valid input");
			throw new ArithmeticException("This is not a valid input");
		}else {
			System.out.println("welcome to this world");
			System.out.println("rest of the code 2");

		}
		
		System.out.println("rest of the code 2");
		System.out.println("rest of the code 3");
		System.out.println("rest of the code 4");


		
		
	}

}
