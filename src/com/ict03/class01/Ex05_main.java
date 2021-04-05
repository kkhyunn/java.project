package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		// static 객체 생성과 상관없이 사용가능
		// 클래스이름.멤버필드, 클래스이름.멤버메소드
		System.out.println(Ex05.s3);
		
//		System.out.println(Ex05.s4); static이라도 private은 접근할 수 없다.
		
		Ex05 test = new Ex05();
		System.out.println(test.s1);
		
//		System.out.println(test.s2); private는 접근 안됨
		
		System.out.println(test.s3);
		
		test.add();
		test.add3();
	}
}
