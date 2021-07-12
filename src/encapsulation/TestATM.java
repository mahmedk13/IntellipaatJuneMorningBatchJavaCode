package encapsulation;

public class TestATM {

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.updatePin(1234, 123456, 8946);
		atm.withdraw(1212, 1000);

	}

}
