package com.ict03.class04;

// �Ϲ����� Ŭ������ �߻�Ŭ������ ����ϸ� 
// �ݵ�� �߻� Ŭ������ �߻� �޼ҵ带 �������̵��ؾ� �Ѵ�.
class Ex02 extends Ex01{
	@Override
	public void sound() {
		
	}
}

// �������̵��� ���� �ʴ� ��� : �ڽ�Ŭ������ �߻�Ŭ������ �����.
abstract class Ex03 extends Ex01{
	public void song() {
		System.out.println("�뷡�ϱ�");
	}
}

abstract class Ex04 extends Ex01 {
	public void Music() {
		System.out.println("����");
	}
	public abstract void pop();
}
