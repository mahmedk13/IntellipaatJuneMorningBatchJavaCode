package encapsulation;

public class ATM {
	
	//your variables should be private
	//you should have a public method to assign them values
	
	private int pinNum = 1234;
	int accountNum = 123456;
	int balance=10000;
	
	public void withdraw(int pin, int amount) {
		if(pin==pinNum) {
			System.out.println("allow user to withdraw the money");
			balance = balance-amount;
			System.out.println("balance amount is: "+balance);
		}else {
			System.out.println("pin is incorrect");
		}
	}
	
	
	public void updatePin(int otp, int accountNo, int newPinNum) {
		if(otp==123456 && accountNo==accountNum) {
			pinNum = newPinNum;
		}else {
			System.out.println("user is not allowed to change the pin");
		}
	}

}
