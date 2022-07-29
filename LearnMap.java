package week3.day2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {
/*
 * Single Number (Print only single occurance numbers)
int[] nums = {1,2,1,3,2,5};
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> hashmap = new LinkedHashMap<Integer,Integer>();
		int[] nums = {1,2,1,3,2,5};
       for (int i = 0; i < nums.length; i++) {
		hashmap.put(nums[i],hashmap.getOrDefault(nums[i], 0)+1);
       
	}
       System.out.println(hashmap);
       for (Entry<Integer, Integer> entry : hashmap.entrySet()) {
    	   if(entry.getValue()==1)
    	   {
    		   System.out.println(entry.getKey());
    	   }
		
	}
	}

}
