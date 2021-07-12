package inheritancelearning;

public class Programmer extends Employee{
	
	double bonus = 1000;
	
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		
		double totalPay = p.salary+p.bonus;
		System.out.println("total pay of the employee is: "+totalPay);
		
	}

}
