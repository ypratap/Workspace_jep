package com.braindumps;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compare implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s2.length() - s1.length();
	}

	public static void main(String[] args) {

//		String[] names = { "Mary", "Jane", "Elizabeth", "Jo" };
//		Arrays.sort(names, new Compare());
//		for (String name : names) {
//			System.out.println(name);
//		}

	
		 String[] names = {"Mary","Jane","Ann","Tom"};
		Arrays.sort(names);
		int x = Arrays.binarySearch(names, "Ann");
		System.out.println(x);
		
		Map<Integer, String> items = new HashMap<>();
		items.put(Integer.valueOf(1), "Tea");
		items.put(Integer.valueOf(2), "Cake");
		
		items.put(Integer.valueOf(1), "Tea");

		System.out.println(items);
		
		Deque<String> deque = new ArrayDeque<>();

		deque.add(null);
	//	deque.add("last element");

		String firstElement = deque.peek();		
		
		System.out.println(firstElement);

		
		String[] arr = {"Tea","Cake"};
		//arr[3] = "Coffee";

		List<String> texts = Arrays.asList(arr);
	//	String[] arr =  {"Tea","Cake","ww"};
		//texts.replaceAll(null);
		texts.add("tt");
		System.out.println(texts);
	}
}