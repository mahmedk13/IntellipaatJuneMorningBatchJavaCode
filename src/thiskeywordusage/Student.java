package thiskeywordusage;

public class Student {
	
	//non parameterized constructor
	Student(){
		System.out.println("inside student class constructor");
	}
	
	
	//parameterized constructor
	Student(String name){
		this();
		System.out.println("student's name is: "+name);
	}
	
	Student(String name, int rollNum){
		this("John");
		System.out.println("student's name is: "+name);
		System.out.println("student's roll num is: "+rollNum);
	}
	
	public static void main(String[] args) {
		Student s = new Student("Mike", 123);
		
	}

}
