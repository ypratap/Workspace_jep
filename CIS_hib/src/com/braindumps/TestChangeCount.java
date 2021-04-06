package com.braindumps;

public class TestChangeCount {
	static int count = 0;
	int i = 0;
	
	public void changeCount() {
		
		while(i< 5) {
			i++;
			count++;
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		TestChangeCount check1 = new TestChangeCount();
		TestChangeCount check2 = new TestChangeCount();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count +" : "+check1.count);
	}
}
