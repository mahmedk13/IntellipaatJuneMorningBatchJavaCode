package collectionapi;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		
		List<String> cars = new ArrayList<String>();
		
		cars.add("BMW"); //0
		cars.add("Mercedez"); //1
		cars.add("Toyota"); //2
		cars.add("Hyundai"); //3
		cars.add("Mercedez"); //4
		cars.add("BMW");
		
		//
		
		
		
		//
		
		//equals--> checks equality between two lists
		//containsAll--> 
		
		
		
		System.out.println(cars);
		System.out.println(cars.get(cars.size()-1)); //cars.get(5-1)--> cars.get(4)
		
		System.out.println(cars.contains("Toyota"));
		System.out.println(cars.containsAll(cars));
		
		System.out.println(cars.isEmpty());
		System.out.println(cars.indexOf("Hyundai"));
		System.out.println(cars.remove(1));
		System.out.println(cars.remove("BMW"));
		System.out.println(cars.remove("BMW"));
		
		for(String s: cars) {
			System.out.println(s);
		}

		
		
		
	}

}
