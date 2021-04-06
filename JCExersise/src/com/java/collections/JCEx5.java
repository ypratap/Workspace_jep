package com.java.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JCEx5 {

	public static void main(String[] args) {
// Iterate lists

		List<String> c = Arrays.asList("C", "C++", "C#", "Java", "Python", "Perl", "Go");
		// Basic for loop
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}
		System.out.println("-------------------------------------------------------------------");

		// Enhanced for each loop
		for (String e : c) {
			System.out.println(e);
		}
		System.out.println("-------------------------------------------------------------------");

		// basic loop with Iterator
		for (Iterator<String> iterator = c.iterator(); iterator.hasNext();) {
			String e = (String) iterator.next();
			System.out.println(e);
		}
		System.out.println("-------------------------------------------------------------------");
		// Iterator with while loop
		Iterator<String> iterator = c.iterator();
		while (iterator.hasNext()) {
			String e = (String) iterator.next();
			System.out.println(e);
		}
		System.out.println("-------------------------------------------------------------------");

		// Java 8
		// Streams
		c.stream().forEach(f -> System.out.println(f));
		System.out.println("-------------------------------------------------------------------");

		// forEach
		c.forEach(d -> System.out.println(d));

	}

}
