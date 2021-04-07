package com.ict06.Thread;

public class Ex12_main {
	public static void main(String[] args) {
		System.out.println("main 시작");
		Ex12 t1 = new Ex12();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		// join() : 현재 스레드는 join()을 호출한 스레드가 끝날 때까지
		//			대기상태에 빠져있다가 join()을 호출한 스레드가 끝나면 다시 실행
		//			즉, join()을 호출한 스레드가 끝날 때까지 실행 할 수 있다.
		try {
			thread1.join();
			for (int i = 1; i < 51; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);	
			}
			System.out.println("main 끝");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
