package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class JCEx8LinkedList {
	public static void main(String[] args) {
		LinkedList<String> pl = new LinkedList<>();

		pl.add("C");
		pl.add("C++");
		pl.add("C#");
		pl.add("Java");
		pl.add("Python");
		pl.add("Perl");

		System.out.println("initial LL -> " + pl);
		// add first element

		pl.addFirst("Ruby");
		// get first element
		System.out.println("add first  LL -> " + pl.getFirst());
		// insert last element

		pl.addLast("Golang");
		// insert last element

		System.out.println("add last  LL -> " + pl.getLast());
		// add element at a specific position
		pl.add(4, "Assembly");
		System.out.println("add value at position 4  LL -> " + pl.get(4));

		System.out.println("--------------------------------------------");

		pl.stream().forEach(f -> System.out.println(f));

		// remove()
		// removeLast()
		// removeFirst()
		// clear()
		// contains()
		// indexOf
		// lastIndexOf

		// iterator
		Iterator<String> iterator = pl.iterator();
		while (iterator.hasNext()) {
			String prog = (String) iterator.next();
			System.out.println(prog);
		}
		// For each advanced loop
		for (String e : pl) {
			System.out.println((pl.indexOf(e) + 1) + " " + e);

		}
		// For each
		pl.forEach(f -> System.out.println(f));
		// simple for loop
		
		//getFirst
		//getLast
		//get(1)
		// contains("C")
		
	}
}
