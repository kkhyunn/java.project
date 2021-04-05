package com.ict02.array;

import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		char[] c1 = new char[4];
		c1[0] = 'J';
		c1[1] = 'A';
		c1[2] = 'V';
		c1[3] = 65;
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		
		// 선언과 생성과 테이터 저장을 한번에 하자
		String[] msg = {"java", "jsp", "spring", "android"};
		for (int i = 0; i < msg.length; i++) {
			System.out.println(msg[i]);
		}
	}
}
