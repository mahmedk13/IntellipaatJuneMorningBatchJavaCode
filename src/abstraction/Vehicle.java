package abstraction;

public abstract class Vehicle {
	
	//abstract method
	abstract void run();
	
	
	//non abstract method
	public void applyBrakes() {
		System.out.println("applying brakes");
	}
	
	abstract void changingGears();

}
