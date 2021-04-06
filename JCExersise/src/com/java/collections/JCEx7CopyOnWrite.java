package com.java.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class JCEx7CopyOnWrite {

	public static void main(String[] args) {
		// List<String> pl = Arrays.asList("C", "C++", "C#", "Java", "Python", "Perl",
		// "Go");
		// List<String> pl = new ArrayList<>();
		List<String> pl = new CopyOnWriteArrayList<String>();

		pl.add("C");
		pl.add("C++");
		pl.add("C#");
		pl.add("Java");
		pl.add("Python");
		pl.add("Perl");
		pl.add("Go");
		pl.add("Ruby");

		Iterator<String> it = pl.iterator();

		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
			// to generate the ConcurrentModificationException
			if (str.equals("C")) {
				pl.remove("C");

			}
			if (str.equals("C++")) {
				pl.add("Pascal");

			}
		}
	}

}
