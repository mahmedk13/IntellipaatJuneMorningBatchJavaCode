package methodexample;

public class Sum {
	
	public int addition(int x, int y) {
		int z =x+y;
		return z;
		
	
	
	}
	
	public static void main(String[] args) {
		Sum s = new Sum();
		
		System.out.println(s.addition(10, 5)*10);
		System.out.println(s.addition(20, 30)/5);
		
		
	}

}
