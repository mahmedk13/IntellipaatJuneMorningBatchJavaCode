package superkeywordusage;

public class Dog extends Animal{
	
	Dog(){
		super();
		System.out.println("dog is created");
	}
	
	String color = "black";
	
	public void printColor() {
		System.out.println(color);
		System.out.println(super.color); //when they have common name instance variables
		System.out.println(numOfLegs);
	}
	
	public void eat() {
		System.out.println("dog is eating");
	}
	
	public void bark() {
		System.out.println("dog is barking");
	}
	
	public void work() {
		super.eat();
		eat();
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.printColor();
		d.work();
	}
	
	

}
