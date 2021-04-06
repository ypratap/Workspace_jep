package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JCEx11IterateHashSet {

	public static void main(String[] args) {

		Set<String> pl = new HashSet<String>();
		pl.add("C");
		pl.add("C++");
		pl.add("C#");
		pl.add("Java");
		pl.add("Python");
		pl.add("Perl");
		// - Enhanced for loop
		for (String lang : pl) {
			System.out.println(lang);
		}
		System.out.println("--------------------------------");
		// - Basic loop with an iterator
		for (Iterator<String> iterator = pl.iterator(); iterator.hasNext();) {
			String lang = (String) iterator.next();
			System.out.println(lang);
		}
		System.out.println("--------------------------------");
		// - While loop with an iterator
		Iterator<String> it2 = pl.iterator();
		while (it2.hasNext()) {
			String lang = (String) it2.next();
			System.out.println(lang);
		}
		System.out.println("--------------------------------");

		// - JDK 8 forEach() method with lambda
		pl.forEach(e -> System.out.println(" - " + e));
		System.out.println("--------------------------------");

		// - JDK 8 streaming + forEach() + lambda expression
		pl.stream().filter(e -> !"Java".equals(e)).forEach(f -> System.out.println("-> " + f));
	}

}
