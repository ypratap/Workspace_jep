package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class JCEx4ArrayList {

	
	// How to create an arrayList from onther collection usin=g arraylist (collection c) constructor.  
	public static void main(String[] args) {
		//ArrayList internally uses resizeable array

		// Create arrayList object
		List<Integer> pNum5 = new ArrayList<>();
		pNum5.add(2);
		pNum5.add(3);
		pNum5.add(5);
		pNum5.add(7);
		pNum5.add(11);

		List<Integer> pNum10 = new ArrayList<>(pNum5);
		List<Integer> pNextNum5 = new ArrayList<>();

		pNextNum5.add(13);
		pNextNum5.add(17);
		pNextNum5.add(19);
		pNextNum5.add(23);
		pNextNum5.add(29);
		
		pNum10.addAll(pNextNum5);
		
		System.out.println(pNum5);
		System.out.println("--------------------------------------");
		System.out.println(pNextNum5);
		System.out.println("--------------------------------------");
		System.out.println(pNum10);

		
	}

}
