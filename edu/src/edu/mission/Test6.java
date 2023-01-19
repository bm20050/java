package edu.mission;

import java.util.Scanner;

public class Test6 {
	public static void gcd(int num1, int num2) {
		int a, b;
		int max = num1;
		int min = num2;
		while (true) {
			if (max >= min) {
				int rem = max % min;
				if (rem == 0) {
					a = min;
					b = num1 * num2 / a;
					break;
				}

				else {
					max = min;
					min = rem;
				}
			} 
			else {
				int temp = max;
				max = min;
				min = temp;
			}
		}
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		gcd(num1, num2);
	}
}
