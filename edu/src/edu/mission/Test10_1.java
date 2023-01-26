package edu.mission;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test10_1 {
	public static ArrayList<Integer> reverse(String[] str) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = str.length - 1; i >= 0; i--) {
			arr.add(Integer.parseInt(str[i]));
		}
		return arr;
	}

	public static void swap(ArrayList<Integer> arr0, ArrayList<Integer> arr1) {
		ArrayList<Integer> temp = arr0;
		arr0 = arr1;
		arr1 = temp;
	}

	public static void print(ArrayList<Integer> arr) {
		String s = "";
		for (int i = arr.size() - 1; i >= 0; i--)
			s += String.valueOf(arr.get(i));
		System.out.printf("%30s\n", s);
	}

	public static ArrayList<Integer> calc(ArrayList<Integer> arr0, ArrayList<Integer> arr1) {
		int add = 0;
		for (int i = 0; i < arr1.size(); i++) {
			arr0.set(i, arr0.get(i) + arr1.get(i) + add);
			if (arr0.get(i) >= 10) {
				add = 1;
				arr0.set(i, arr0.get(i) % 10);
			} else {
				add = 0;
			}
		}
		return arr0;
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> arr0 = new ArrayList<Integer>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		// 데이터 읽기
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));) {
			String str;
			while ((str = br.readLine()) != null) {
				list.add(str);
				System.out.printf("%30s\n", str);
			}

		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		arr0 = reverse(list.get(0).split(""));
		arr1 = reverse(list.get(1).split(""));
		if (arr0.size() < arr1.size()) {
			swap(arr0, arr1);
		}

		print(calc(arr0, arr1));
	}

}
