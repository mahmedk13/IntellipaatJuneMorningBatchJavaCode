package interfaceexample;

public class A4 implements printable, showable {
	
	public static void main(String[] args) {
		
		A4 a = new A4();
		a.print();
		
		
	}

	@Override
	public void print() {
		System.out.println("hello");
	}

	@Override
	public void dispplay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
