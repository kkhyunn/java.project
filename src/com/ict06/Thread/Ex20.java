package com.ict06.Thread;

public class Ex20 {
	public static void main(String[] args) {
		Ex17 c = new Ex17();
		
		Ex18 p = new Ex18(c);
		Thread tp = new Thread(p);
		
		Ex19 u = new Ex19(c);
		Thread tu = new Thread(u);
		
		tp.start();
		tu.start();
	}
}
