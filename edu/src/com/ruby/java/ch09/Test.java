package com.ruby.java.ch09;

public class Test {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] a = new int [100];
		int[] count = new int[100];
		
		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			for (int j = 0; j < a.length; j++) {
				if (arr[i] != a[j])
					a[k++] = arr[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			
		}
	}

}
