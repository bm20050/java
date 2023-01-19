package edu.mission;

import java.util.Scanner;

class Binary {
	private int binary[] = new int[100];
	private int i = 0;

	public void changeBinary(int decimal) {

		while (true) {
			binary[i++] = decimal % 2;
			decimal = decimal / 2;
			if (decimal == 0)
				break;
		}
	}

	public void print() {
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binary[j]);
		}
		System.out.println();
	}
}

public class Test3 {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int decimal = sc.nextInt();
			if (decimal == 0)
				break;
			Binary b = new Binary();
			b.changeBinary(decimal);
			b.print();
		}

	}

}
