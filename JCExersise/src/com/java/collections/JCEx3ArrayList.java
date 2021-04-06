package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class JCEx3ArrayList {

	public static void main(String[] args) {
		// ArrayList internally uses resizeable array

		// Create arrayList object
		List<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Presimons");
		fruits.add("Papaya");

		System.out.println(fruits);

		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.set(2, "JackFruit"));
		System.out.println(fruits);

		fruits.clear();
		System.out.println(fruits);
		fruits.add("JackFruit");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Presimons");
		fruits.add("Papaya");
		System.out.println(fruits);

		List<String> fruit = new ArrayList<>();
		fruit.add("Apple");
		fruit.add("Orange");

		fruits.removeAll(fruit);

		System.out.println(fruits);

	}

}
