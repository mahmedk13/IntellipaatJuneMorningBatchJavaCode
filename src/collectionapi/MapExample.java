package collectionapi;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map<Integer, String> studentMap = new HashMap<Integer, String>();
		
		studentMap.put(123, "John");
		studentMap.put(124, "Ben");
		studentMap.put(125, "Mike");
		studentMap.put(126, "Mike");
		studentMap.put(124, "Adam");
		
		System.out.println(studentMap);
		System.out.println(studentMap.get(126));
		studentMap.replace(125, "John Sr");
		System.out.println(studentMap);
		
		studentMap.remove(124);
		System.out.println(studentMap);
		
		studentMap.forEach((k, v)->System.out.println(k+" "+v));


		
		
		
	}

}
