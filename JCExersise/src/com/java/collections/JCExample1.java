package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class JCExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Group of different objects as single entity can be represented by collections
		//

		Collection<String> coll = new ArrayList<>();
		coll.add("in1");
		coll.add("in2");
		coll.add("in3");
		coll.add("in4");

		System.out.println("coll - " + coll);

		coll.remove("in3");
		System.out.println("coll -remove element -  " + coll);

		System.out.println("check if contains in4 - " + coll.contains("in3"));

		
		// Iterate using lambda functions 
		coll.forEach((ele) -> {
			System.out.println(ele);
		});
		
		coll.clear();
		
		System.out.println(coll);

	}

}
