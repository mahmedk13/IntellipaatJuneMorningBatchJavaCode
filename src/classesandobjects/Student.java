package classesandobjects;

public class Student {
	//intsnace variables 
	int rollNum;
	String name;
	
	
	Student(){
		
	}
	
	//parameterized constructor
	Student(int rollNum, String name){
		this.rollNum = rollNum;
		this.name = name;
		
	}
	
	public static void main(String[] args) {
		
		Student s = new Student(123, "John");
		Student s1 = new Student(124, "Mike");
		Student s2 = new Student(125, "Bob");
		Student s4 = new Student();

		s.rollNum=156;
		System.out.println(s.name);
		System.out.println(s.rollNum);
		
		System.out.println(s1.name);
		System.out.println(s1.rollNum);
		
		System.out.println(s2.name);
		System.out.println(s2.rollNum);
		
	}

}
