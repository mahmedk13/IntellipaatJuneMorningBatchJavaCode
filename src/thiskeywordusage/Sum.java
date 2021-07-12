package thiskeywordusage;

public class Sum {
	
	public void add() {
		
		System.out.println(5+4);
	}
	
	public void multiply() {
	    add(); //compiler implicitly puts this keyword here
		System.out.println(2*3);
	}
	
	public static void main(String[] args) {
		Sum s = new Sum();
		s.multiply();
	}

}
