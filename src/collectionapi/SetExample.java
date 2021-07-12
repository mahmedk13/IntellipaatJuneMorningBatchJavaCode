package collectionapi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
		
	Set<Integer> nums = new HashSet<Integer>();
	
	nums.add(13);
	nums.add(42);
	nums.add(45);
	nums.add(12);
	nums.add(42);
	
	System.out.println(nums);
	
//	for(int n: nums) {
//		System.out.println(n);
//	}
	
	
	//using iterator
	
	Iterator<Integer> itr = nums.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	//John
	
	
	
	}

}
