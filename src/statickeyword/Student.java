package statickeyword;

public class Student {
	
	int rollNum;
	static String name;
	static String univ="TIS";
	
	Student(int rollNum, String name){
		this.rollNum=rollNum;
		this.name=name;
	}
	
	public  void display() {
		System.out.println(rollNum+" "+name+" "+univ);
	}
	
	public void work() {
		display();
	}
	
	public static void main(String[] args) {
		Student s = new Student(123, "John");
		s.display();
		Student s1 = new Student(124, "Mike");
		s1.display();
		Student s2= new Student(125, "Bob");
		s2.display();
	}
	
	static int x=5;
	static int y =10;
	
	public static int sum() {
		Student s3 = new Student(125, "James");
		s3.display();
		//System.out.println(rollNum);
		System.out.println(name);
		return x+y;
	}

}
