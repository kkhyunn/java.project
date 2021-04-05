package com.ict03.class03;

// Ex02와 Ex03은 상속관계
public class Ex03 extends Ex02{
	String name = "차두리";
	int age = 34;
	static String hobby = "영화보기";
	
	public Ex03() {
		System.out.println("자식 클래스 생성자");
	}
	
	public void sound() {
		System.out.println("자식 클래스 메소드");
	}
	
	public void study() {
		// 객체 생성없이 부모클래스가 멤버를 사용한 것
		System.out.println("공부장소 : " + addr);
		
		System.out.println("name : " + this.name); // 차두리
		System.out.println("name : " + super.name); // 차범근
		// 상속관계라도 private는 사용할 수 없다.
		// System.out.println("우리집 애완동물 : " + dog);
	}
	
	// 오버라이딩(재정의) : 겉모양은 부모메소드를 그대로 사용하는 것
	//						내용만 변경하는것
	public void eat() {
		System.out.println("아침밥은 생략한다.");
	}
	
	// 오버라이딩을 할 수 없게 하는 예약어 : final
	// 부모메소드에 final이 있으면 override 할 수 없다.
}
