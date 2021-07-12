package statickeyword;

public class CounterWithStatic {
	
	static int count =0;
	
	CounterWithStatic() {
		
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		CounterWithStatic c1 = new CounterWithStatic(); //0--> 1 --> SOP(1)
		CounterWithStatic c2 = new CounterWithStatic(); //1--2-- SOP(2)
		CounterWithStatic c3 = new CounterWithStatic(); //2--> 3--> sop(3)


	}

}
