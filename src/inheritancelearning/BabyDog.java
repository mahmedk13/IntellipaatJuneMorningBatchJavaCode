package inheritancelearning;

public class BabyDog extends Dog {
	
	BabyDog(){
		System.out.println("Inside BabyDog class constructor");
	}
	
	public void weep() {
		System.out.println("weeping");
	}
	
	public void eat() {
		System.out.println("babydog is eating");
	}

}
