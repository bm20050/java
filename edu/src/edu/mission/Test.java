package edu.mission;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double a = 9.81;
		// int t = 5;
		int v0 = 0;
		int x0 = 1000;
		
//		while(true) {
//			System.out.println("-1입력 -> 종료");
//			System.out.print("이동 시간을 입력하세요 : ");
//			
//			Scanner sc = new Scanner(System.in);
//			int t =  sc.nextInt();
//			if ( t == -1 ) break;
//			
//			x = (double)1 / 2 * (-a) * t * t + v0 * t + x0;
//			System.out.println(t + "초 후 위치 : " + String.format("%.2f", x) + "m");
//		}
		System.out.print("이동 시간을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		for(int i = t; ; i++) {
			x = (double)1 / 2 * (-a) * i * i + v0 * i + x0;
			if ( x < 0 ) break;
			System.out.println(i + "초 후 위치 : " + String.format("%.2f", x) + "m");
		}
	}	

}
