package com.ict03.class02;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		int[] me = new int[3];
		int[] you = new int[3];
		
		for (int i = 0; i < me.length; i++) {
			me[i] = (int)(Math.random() * 10);
			System.out.print(me[i]);
		}
		System.out.println();
		
		for (int i = 0; i < you.length; i++) {
			you[i] = (int)(Math.random() * 10);
			System.out.print(you[i]);
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
	}
}
