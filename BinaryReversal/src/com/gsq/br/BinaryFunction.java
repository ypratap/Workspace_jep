package com.gsq.br;

import java.util.Scanner;

public class BinaryFunction {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a postive integer : ");
		String bi = input.next();

		new BinaryFunction(Integer.parseInt(bi));
	}

	BinaryFunction(int str) {

		String foo = Integer.toBinaryString(str);
		String f = new StringBuilder(foo).reverse().toString().concat("00");
		System.out.println("Binary reverse of " + str + " is " + Integer.parseInt(f, 2));
	}

}
