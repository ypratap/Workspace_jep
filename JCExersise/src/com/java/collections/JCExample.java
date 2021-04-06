package com.java.collections;

public class JCExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		int[] ar = new int[100]; // Declared the size of 100
		// array is fixed in size

		ar[101] = 1;

		System.out.println(ar[101]);
		// Limitations of a array
		// 1. arrays are fixed in size
		// 2. arrays can only hold homogeneous data elements

		Student[] students = new Student[10];
		students[0] = new Student();
		students[1] = new Student();
	//	students[2] = new Book();

		Object[] object = new Object[10];
		object[0] = new Student();
		object[1] = new Student();
		object[2] = new Book();
		// 3. APIs are not available to available
	}

	static class Book {
	}

	static class Student {
	}

}
