package com.ict02.array;

import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		double s1 = 36.66666;
		double s2 = (int) (s1 * 10) / 10.0;
		
		System.out.println(s2);
		
		Random ran = new Random();
		int num = ran.nextInt(10) + 1;
		
		System.out.println(num);
	}
}
