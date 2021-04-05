package com.ict03.class04;

public class Ex07_Dog extends Ex06_Animal{

	@Override
	public void sound() {
		System.out.println("¸Û~");
	}

	@Override
	public void eat(String food) {
		System.out.println("°í±â");
	}

	@Override
	public String play() {
		return "¾Õ ¸¶´ç¿¡¼­ ³î±â";
	}

}
