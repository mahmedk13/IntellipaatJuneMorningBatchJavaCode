
public class IfElseExample {

	public static void main(String[] args) {
		
		int number =18;
		
		//whether this number is even or odd
		//even number --> completely divisible by 2 --> means remainder is zero
		//odd number --> not completely divisible by 2 --> means remainder is not zero
		
		if(number%2==0) {//1==0
			System.out.println("this number is even number");
		}else {
			System.out.println("this number is odd number");
		}

	}

}
