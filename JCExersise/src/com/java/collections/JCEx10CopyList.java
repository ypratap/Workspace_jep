package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JCEx10CopyList {
	//
	public static void main(String[] args) {
		List<String> pl = new ArrayList<>();
		pl.add("C");
		pl.add("C++");
		pl.add("C#");
		pl.add("Java");
		pl.add("Python");
		pl.add("Perl");
		System.out.println(pl);
		// 1. Using Constructor
		List<String> pl1 = new ArrayList<>(pl);
		System.out.println(pl1);

		// 2. Using addAll() method
		List<String> pl2 = new ArrayList<>();
		pl2.addAll(pl);
		System.out.println(pl2);
		// 3. Using Collections.copy() method
		List<String> pl3 = new ArrayList<>(pl.size());
		pl3.add("a");
		pl3.add("b");
		pl3.add("c");
		pl3.add("d");
		pl3.add("e");
		pl3.add("f");
		System.out.println(pl3);
		Collections.copy(pl3, pl);
		System.out.println(pl3);

		// 4. Using Java 8
		List<String> pl4 = pl.stream().collect(Collectors.toList());
		System.out.println(pl4);
	}

}
