package com.ict06.Thread;

public class Ex16_main {
	public static void main(String[] args) {
		Ex16 t1 = new Ex16();
		
		Thread thread1 = new Thread(t1, "tiger");
		thread1.start();
		
		Thread thread2 = new Thread(t1, "lion");
		thread2.start();
	}
}
