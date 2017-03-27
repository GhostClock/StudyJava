package com.March.Eleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int number = getUserInput();
		// System.out.println(number);
		// setNumber(9);
		amethod();
	}

	public static void setNumber(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 3 && j == 3 || i == 4 && j == 3) {
					System.out.print(" " + j + "*" + i + " = " + i * j + " ");
				} else {
					System.out.print(j + "*" + i + " = " + i * j + " ");
				}
			}
			System.out.println(" ");
		}
	}

	private static int getUserInput() {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("请输入:");
		int temp = 0;
		try {
			temp = Integer.valueOf(bufferedReader.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	public static void amethod() {
		for (int a = 0, b = 0; a < 2; b = ++a, System.out.println("b =  " + b)) {
			System.out.println("a = " + a);
		}
	}
}
