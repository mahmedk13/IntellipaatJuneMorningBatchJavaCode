
public class IFElseLeapYearExample {

	public static void main(String[] args) {

		int year =2000; //completely divisible by 4, but not completely divisible by 100
		
		if((year%4==0 && year%100!=0) || (year%400==0)) { //both conditions should be true
			System.out.println("leap year");
		}else {
			System.out.println("its not a leap year");
		}
		
		
	}

}
