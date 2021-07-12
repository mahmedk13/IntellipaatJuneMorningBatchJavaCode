package classesandobjects;

public class Student2 {
		
		int rollNum;
		String name;
		String subject;
		String department;
		
		
		
		
		//non parameterized
		Student2(){
			System.out.println("I am inside constructor");
		}
		
	public static void main(String[] args) {
		//our object is not initialized
		Student2 s = new Student2();
		Student2 s1 = new Student2();
		
		//initialization through reference variable
		s.rollNum=123;
		s.name="John";
		s.subject="comp science";
		s.department="IT";
		
		s1.rollNum=124;
		s1.name="Mike";
		
		System.out.println(s.name);
		System.out.println(s.rollNum);
		
		System.out.println(s1.name);
		System.out.println(s1.rollNum);

	}

}
