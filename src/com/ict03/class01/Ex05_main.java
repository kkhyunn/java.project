package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		// static ��ü ������ ������� ��밡��
		// Ŭ�����̸�.����ʵ�, Ŭ�����̸�.����޼ҵ�
		System.out.println(Ex05.s3);
		
//		System.out.println(Ex05.s4); static�̶� private�� ������ �� ����.
		
		Ex05 test = new Ex05();
		System.out.println(test.s1);
		
//		System.out.println(test.s2); private�� ���� �ȵ�
		
		System.out.println(test.s3);
		
		test.add();
		test.add3();
	}
}
