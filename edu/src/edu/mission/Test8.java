package edu.mission;

import java.util.Scanner;

public class Test8 {
	public static void one() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

	public static void two() {
		for (int i = 2; i <= 8; i += 2) {
			for (int j = 1; j <= 9; j++) {
				for (int k = i; k < i + 2; k++) {
					System.out.print(k + " * " + j + " = " + k * j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void three() {
		for (int i = 2; i <= 9; i += 3) {
			for (int j = 1; j <= 9; j++) {
				for (int k = i; k < i + 3; k++) {
					if (k > 9)
						break;
					System.out.print(k + " * " + j + " = " + k * j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void general(int n) {
		for (int i = 2; i <= 19; i += n) {
			for (int j = 1; j <= 19; j++) {
				for (int k = i; k < i + n; k++) {
					if (k > 19)
						break;
					System.out.print(k + " * " + j + " = " + k * j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		// one();
		// two();
		// three();
		
		
		
		System.out.print("숫자입력 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		general(n);

	}

}
