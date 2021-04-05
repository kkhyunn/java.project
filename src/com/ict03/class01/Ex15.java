package com.ict03.class01;

public class Ex15 {
	int s1 = 100;
	
	static int s2 = 200;
	
	// static 초기화
	static {
		s2 = 2000;
		s3 = 3000;
		s4 = 4000;
	}
	
	// 초기화 이후에 선언해도 오류 발생 안함
	static int s3 = 300;
	static int s4;
	
	public static void main(String[] args) {
		// main()도 static이므로 전역변수가 인스턴스이면 사용할 수 없다.
		// System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		int k1;
		k1 = 400;
	}
}
