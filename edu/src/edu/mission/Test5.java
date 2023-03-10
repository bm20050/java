package edu.mission;

public class Test5 {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 1, 1, 1, 11 };
		int[] b = { 2, 2, 2, 2, 2, 2, 2, 22 };
		printArray(a);
		printArray(b);
		printArray(merge(a, b));
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static int[] merge(int[] a, int[] b) {
		int n = a.length + b.length;
		int[] c = new int[n];
		int m = 0;
		for (int i = 0; i < a.length; i++) {
			c[m++] = a[i];
			c[m++] = b[i];
		}
		return c;
	}
}
