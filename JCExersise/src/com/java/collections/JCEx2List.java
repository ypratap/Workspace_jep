package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class JCEx2List {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// List allows us to add duplicate elements

		list.add("element1");
		list.add("element1");
		list.add("element2");
		list.add("element2");
		// List allows us to add null

		list.add(null);
		list.add(null);

		// Retains insertion order
		list.add("element1");
		list.add("element2");
		list.add("element3");
		list.add("element4");
		list.add("element5");

		System.out.println(list);
		
		// access elements
		System.out.println(list.get(0));
		System.out.println(list.get(1));

	}

}
