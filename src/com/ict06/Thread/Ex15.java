package com.ict06.Thread;

// ���� : �ΰ��� �����带 �����Ͽ� �������� ����� 1-100���� ����ϰ�
//		  �ι�° �������� ����� 101 - 200���� ����϶�(synchronized ���)
public class Ex15 implements Runnable {
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
		}
	}
}