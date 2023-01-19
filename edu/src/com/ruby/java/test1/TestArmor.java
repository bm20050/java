package com.ruby.java.test1;

import com.ruby.java.test1.Armor;

public class TestArmor {
	static void test(int... v) {
		System.out.print(v.length + " : ");
		for (int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Armor a = new Armor();
		int n;
		n = a.takeOff(100);
		a.speedUp(11.11, 12);
		System.out.println("n = " + n);
		
		test(1);
		test(1, 2);
		test(1, 2, 3, 4, 5, 6, 7);
	}
}
