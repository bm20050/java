package edu.mission;

import java.util.Scanner;

public class Test9_1 {
	public boolean isPrimeNumber(int n) {
		if (n == 1)
			return false;
		boolean a = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				a = false;
				break;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Test9_1 t = new Test9_1();
//		for (int i = 0; i < args.length; i++)
//			System.out.println("arg" + i +" : " + args[i]);

		for (int i = 0; i < args.length; i++) {
			if (t.isPrimeNumber(Integer.parseInt(args[i])))
				System.out.println(args[i] + " : " + "소수 O");
			else
				System.out.println(args[i] + " : " + "소수 X");
		}
		System.out.println("Done");
	}

}
