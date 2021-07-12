package methodexample;

import java.util.Scanner;

public class MethodExample {
	
	public void findEvenOdd() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
	}
	
	public static void main(String[] args) {
		MethodExample me = new MethodExample();
		me.findEvenOdd();
		
	}

}
