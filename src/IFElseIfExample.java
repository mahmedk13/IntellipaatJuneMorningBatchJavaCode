import java.util.Scanner;

public class IFElseIfExample {

	public static void main(String[] args) {
		//package, import, what is this constructor, how to objects 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the marks");
		int marks = scan.nextInt();
		
		
		
		if(marks<50 && marks >=0) {
			System.out.println("fail");
		}else if (marks >=90 && marks<100) {
			System.out.println("A+ grade");
		}else if (marks >= 80  && marks<90) {
			System.out.println("A grade");
		}else if (marks >= 70 && marks<80) {
			System.out.println("B grade");
		}else if (marks>= 60) {
			System.out.println("C grade");
		}else if (marks>=50) {
			System.out.println("D grade");
		}else {
			System.out.println("invalid marks");
		}

	}

}
