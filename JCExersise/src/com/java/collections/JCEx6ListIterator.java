package com.java.collections;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class JCEx6ListIterator {

	public static void main(String[] args) {
		List<String> pl = Arrays.asList("C", "C++", "C#", "Java", "Python", "Perl", "Go");

		ListIterator<String> li = pl.listIterator();

		// System.out.println(li);
		// hasNext()
		// next()
		while (li.hasNext()) {
			String element = li.next();
			System.out.println(element);
		}
		System.out.println("---------------------------------------");

		// hasPrevious()
		// previous()
		while (li.hasPrevious()) {
			String element = li.previous();
			System.out.println(element);
		}
	}

}
