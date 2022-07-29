package week3.day2;

//Print only unique characters in the given string
//String companyName = "google" --> "gole"

import java.util.LinkedHashSet;
import java.util.Set;

public class Learnset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "google";
		char[] arr = companyName.toCharArray();
		
		Set<Character> set1 = new LinkedHashSet<Character>();
		for (int i = 0; i < arr.length; i++) {
			set1.add(arr[i]);
		}
		System.out.println("Removing duplicate letters in google :" + set1);
		

	}

}
