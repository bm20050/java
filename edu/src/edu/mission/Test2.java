package edu.mission;

import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		
//		while(true) {
//			System.out.println("0입력시 종료");
//			System.out.print("상품 가격을 입력하세요 : ");
//			Scanner sc = new Scanner(System.in);
//			int price =  sc.nextInt();
//			
//			if ( price == 0 ) break;
//			
//			int a = price / 50000;
//			price -= a * 50000;
//			int b = price / 10000;
//			price -= b * 10000;
//			int c = price / 5000;
//			price -= c * 5000;
//			int d = price / 1000;
//			price -= d * 1000;
//			
//			System.out.println("5만원 : " + a + "장");
//			System.out.println("1만원 : " + b + "장");
//			System.out.println("5천원 : " + c + "장");
//			System.out.println("1천원 : " + d + "장");
//		}
		
		while(true) {
			int[] arr = {50000, 10000, 5000, 1000};
			System.out.println("0입력시 종료");
			System.out.print("상품 가격을 입력하세요 : ");
			Scanner sc = new Scanner(System.in);

			int price =  sc.nextInt();
			
			if ( price == 0 ) break;

			for (int i = 0; i < arr.length; i++) {
				int n = price / arr[i];
				price -= n * arr[i];
				System.out.println(arr[i] + " : " + n + "장");
			}

		}
			
	}

}
