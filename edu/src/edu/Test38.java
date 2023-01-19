package edu;

public class Test38 {

	public static void main(String[] args) {
//		int[][] arr = new int[5][5];
//		int num = 1;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j< arr[i].length; j++) {
//				arr[i][j] = num++;
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				if (i > j)
//					System.out.print(arr[i][j] + " ");
//				System.out.print("\t");
//			}
//			System.out.println("\n");
//		}
//
//	}
		int[][] a = new int[3][4];
		int[][] b = new int[4][5];
//		int[][] c = new int[5][5];
		int[][] d = new int[3][5] ;
		
		//a
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				double rnum = Math.random();
				int num = (int) (rnum * 10);
				a[i][j] = num;
			}
		}
		
		//a 출력
		System.out.println("행렬 a");
		for (int i = 0; i < a.length; i++) {
			for (int j  = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//b
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				double rnum = Math.random();
				int num = (int) (rnum * 10);
				b[i][j] = num;
			}
		}
		
		//b출력
		System.out.println("행렬 b");
		for (int i = 0; i < b.length; i++) {
			for (int j  = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		
//		//c = a + b
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < c[i].length; j++) {
//				c[i][j] = a[i][j] + b[i][j];
//			}
//		}
//		
//		
//		//c출력
//		System.out.println("행렬 c");
//		for (int i = 0; i < c.length; i++) {
//			for (int j  = 0; j < c[i].length; j++) {
//				System.out.print(c[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		
		//d = a * b
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				int sum = 0;
				for (int k = 0; k < a[i].length; k++) {
					sum += a[i][k] * b[k][j] ;
				}
				d[i][j] = sum;
			}	
		}
		
		//d출력
		System.out.println("행렬 d");
		for (int i = 0; i < d.length; i++) {
			for (int j  = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();
		}
	}
}