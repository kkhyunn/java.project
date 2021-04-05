package com.ict03.class01;

public class Ex14 {
//		static : 객체 생성과 상관없이 미리 만들어지는 필드와 메소드
//				클래스와 지역변수에스는 static을 사용할 수 없다.
//				공유 개념 (모든 객체가 사용할 수 있다.)
//				접근제한자가 private이면 static이라도 접근할 수 없다.
	int su1 = 10;
	static int su2 = 10;
	
	public Ex14() {
		su1++;
		su2++;
	}
	public void prn() {
		int su3 = 10;
		// static int su4 = 10; 지역변수에는 static 사용 못함
	}
	// static 메소드는 static 변수만 참조할 수 있다.
	// 인스턴스 변수 참조 불가능
	public static void prn2() {
		// System.out.println(su1);
		System.out.println(su2);
		int su4 = 10;
		// static su5 = 10; 지역변수에는 static 사용 못함
	}
}
