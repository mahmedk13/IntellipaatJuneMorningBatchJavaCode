

package abstraction;

public class TestAbstraction {
	
	public static void main(String[] args) {
		//superclass reference variable was being used to refer to child class object
		Shape s = new Rectangle();
		s.draw();
		
		Shape s1 = new Circle();
		s1.draw();
	}

}
