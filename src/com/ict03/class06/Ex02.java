package com.ict03.class06;

enum Type {
	WALKING, RUNNING, TRACKING, HIKING
}

public class Ex02 {
	String name;
	int size;
	Type type;
	
	public static void main(String[] args) {
		// 오류
		// System.out.println(name);
		
		// 객체를만들어서 사용할 수 있다.
		Ex02 shoes = new Ex02();
		shoes.name = "나이키";
		shoes.size = 275;
		shoes.type = Type.WALKING;
		System.out.println("신발이름 : " + shoes.name);
		System.out.println("신발사이즈 : " + shoes.size);
		System.out.println("신발타입 : " + shoes.type);
	}
}
