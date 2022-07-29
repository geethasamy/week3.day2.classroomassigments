package week3.day2;


import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap2 {

	/*
	 * Classroom Assignment 4: (Map)
Two Sum 
int[] nums = {2,4,6,7,11,15};
int target = 8;
Time: 30 minutes
Hints: 
Subtract the number from target and check the diff number exist using Map!
	 */
	
	public static void main(String[] args) {
		Map<Integer,Integer> hashmap = new LinkedHashMap<Integer,Integer>();
		// TODO Auto-generated method stub
		int[] nums = {2,4,6,7,11,15};
		int target = 8;
		int value=0;
		for (int j = 0; j < nums.length; j++) {
			hashmap.put(j, nums[j]);
		}
		for (int i = 0; i < nums.length; i++) {
			
			value=target-nums[i];
			if (hashmap.containsValue(value)) {
				System.out.println(value +" difference is present in given array");
				
			}
			
			else
			{
				System.out.println(value +" not Present");
			}
		}
		System.out.println(hashmap);
		

	}

}
