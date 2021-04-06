package com.ict06.Thread;

public class Ex01 {
	public static void main(String[] args) {
		// Thread 생성자
		// - Thread() : 기본생성자
		// - Thread(Runnable target) : Runnable 인터페이스를 인자로 받아서 처리
		//							   익명 내부클래스를 사용할 수 있다.
		// - Thread(Runnable target, String name) : 이 때 name에는 스레드 이름을 지정할 수 있다.
		//											Runnable 인터페이스를 인자로 받아서 처리
		// - Thread(String name) : 이 때 name은 스레드 이름을 지정할 수 있다.
		
		// 주요 메소드
		// - join() : 현재 스레드는 join() 메소드를 호출한 스레드가 끝날 때까지
		//			  대기상태로 빠져있다가 join()을 호출한 스레드가 끝나야 다시 실행한다.
		//			  즉, join()을 호출한 스레드가 끝날 때까지 실행할 수 없다.
		// - start() : start()를 실행하면 run()을 호출한다.(만약에 start()가 있으면 start()로 간다.)
		// - run()   : start()가 호출돼서 run()이 실행되면 이 때 스레드 처리를 했다고 한다.
		// - sleep(long millis) : 1000이 1초를 의미하고, 잠시 대기상태로 빠져 있는 상태를 말함
		// - yield() : 수행 중인 스레드 중 우선순위가 같은 다른 스레드에게 제어권을 넘긴다.
		// - getName() : 스레드 이름 구하기
		// - setName(String name) : 스레드 이름 설정
		// - currentThread() : 현재 수행되는 스레드 객체를 리턴한다.(static)
		
		// 앞에서 만든 모든 처리는 main 스레드가 혼자서 다 처리했다.
		// 이러한 것을 싱글 스레드라고 한다.
		// 스레드를 일처리하는 일꾼이라고 생각하자.
		
		// JVM이 main 메소드를 호출하면 무조건 main 스레드가 일처리를 한다.
		System.out.println(Thread.currentThread().getName());
		
		Ex02 test = new Ex02();
		System.out.println("1" + Thread.currentThread().getName());
		test.add(5, 8);
		System.out.println("4" + Thread.currentThread().getName());
		
		int res = test.sub(8, 5);
		System.out.println("7" + Thread.currentThread().getName());
		System.out.println(res);
	}
}
