package encapsulation;

public class TestStudent {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("John");
		s.setRollNum(1234);
		
		String str =s.getName();
		System.out.println(str);
		
		int r = s.getRollNum();
		System.out.println(r);
	}

}
