package statickeyword;

public class Counter {
	
	int count = 0;
	
	Counter(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter(); //0-->1 --SOP(1)
		Counter c2 = new Counter(); //0--> 1--> SOP(1)
		Counter c3 = new Counter(); //0 --> 1--> SOP(1)
		
		Student s = new Student(123, "John");
		Student.x=10;
		Student.y=15;
		int z =Student.sum();//15
		System.out.println(z);
		System.out.println(Student.univ);
	}

}
