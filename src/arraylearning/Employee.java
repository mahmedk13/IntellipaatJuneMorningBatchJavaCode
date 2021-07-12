package arraylearning;

public class Employee {

	public static void main(String[] args) {
		
//		int e1_salary=2000;
//		int e2_salary=3000;
//		int e3_salary = 1500;
//		int e4_salary=2000;
//		int e5_salary=3500;
		
		//int empSalary[] = new int[5];
//		int[] empSalary = new int[5];
//		
//		empSalary[0]= 2000;
//		empSalary[1]=3000;
//		empSalary[2]=1500;
//		empSalary[3]=2000;
//		empSalary[4]=3500;
		
		int[] empSalary = {2000, 3000, 1500, 2000, 3500};
		
		int totalSalary =0;
		
		for(int i=0; i<empSalary.length; i++) {
			totalSalary = totalSalary+empSalary[i];
		}
		
		
		int avgSalary = totalSalary/5;
		
		System.out.println(avgSalary);
		

		
		//for each loop
		//enhanced for loop
//		for(int i: empSalary) {
//			System.out.println(i);
//		}
		
		
		//int avgSalary = (e1_salary+e2_salary+e3_salary+e4_salary+e5_salary)/5;
		
		

	}

}
