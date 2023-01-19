package edu.mission;

public class Test4 {
	
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}
	public static int[][] matrixMultiplication(int[][] a, int[][] b) {
		int[][] c = new int[4][4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				int result = 0;
				for (int k = 0; k < a[0].length; k++) {
					result += a[i][k] * b[k][j];
				}
				c[i][j] = result;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int[][] b = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		

//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < b[0].length; j++) {
//				int result = 0;
//				for (int k = 0; k < a[0].length; k++) {
//					result += a[i][k] * b[k][j];
//				}
//				c[i][j] = result;
//			}
//		}
		
		
		printArray(a);
		printArray(b);
		printArray(matrixMultiplication(a, b));
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < c[i].length; j++) {
//				System.out.print(c[i][j] + "\t");
//			}
//			System.out.println();
//		}

	}

}
