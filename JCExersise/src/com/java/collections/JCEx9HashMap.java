package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class JCEx9HashMap {

	public static void main(String[] args) {
		Map<Integer, String> pl = new HashMap<>();
		pl.put(1, "C");
		pl.put(2, "C++");
		pl.put(3, "C#");
		pl.put(4, "Java");
		pl.put(5, "Python");
		pl.put(6, "Cobol");
		pl.put(7, "Ruby");
		pl.put(8, "Perl");
		pl.put(9, "Ruby");
		pl.put(10, "Haskel");

		// Iterate through a HashMap EntrySet using Iterator
		Iterator<Entry<Integer, String>> iterator = pl.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println("-------------------------------");
		// Iterate through HashMap KeySet using Iterator
		Iterator<Integer> iterator2 = pl.keySet().iterator();
		while (iterator2.hasNext()) {
			Integer key = iterator2.next();
			System.out.println(key + " - " + pl.get(key));
		}
		System.out.println("-------------------------------");

		// Iterate HahMap using forEach loop
		for (Map.Entry<Integer, String> entry : pl.entrySet()) {
			System.out.println(entry.getKey() + ".) " + entry.getValue());
		}
		System.out.println("-------------------------------");
		// Iterate using lambda expressions
		 pl.forEach((key,value)-> System.out.println(key+"--- "+value));;
		
		
		System.out.println("--------------s()-----------------");
		// loop through a HashMap using stream API
		pl.entrySet().stream().forEach(e -> System.out.println(e));;
	}

}
