package com.ict01.grammar02;
class Ex11 {
	public static void main(String[] args) {
		int s1 = 90;
		int s2 = 80;
		boolean res = s1 >= s2;
		System.out.println("결과 : " + res);

		char s3 = 'c';
		char s4 = 'a';
		res = s3 >= s4;
		System.out.println("결과 : " + res);

		res = 'a' >= 97;
		System.out.println("결과 : " + res);

		res = 97 >= 97.0000001;
		System.out.println("결과 : " + res);
	}
}