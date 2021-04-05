package com.ict03.class01;

public class Ex02 {
	// Ŭ���� �ȿ��� 3������ �����Ѵ�
	// ����ʵ�, ����޼ҵ�, ������
	
	// ����ʵ� : ����� ����, static�� instance�� ��������.
	// final �����ϸ� ���
	// static ������ �ν��Ͻ�(��ü ������ �� ���� ���������.)
	// static�̶� ��ü ������ ������� �̸� ���������.
	
	int k1 = 80;				// �ν��Ͻ� ���� == �Ϲݺ���
	static int k2 = 90;			// static ����
	final int k3 = 85;			// �ν��Ͻ� ���
	static final int k4 = 95;	// static ��� = API���� �����ϴ� �������
	
	// ����޼ҵ� : ����, ���
	// �ν��Ͻ�, ��ȯ���� ����.
	public void prn01() {
		k1 = k1 + 20;
		k2 = k2 + 10;
		System.out.println("k1 = " + k1);
		System.out.println("k2 = " + k2);
		
//		k3 = k3 + 15; ����� �� ������ �ȵ�
//		k4 = k4 + 5;
		
		// �������� : �޼ҵ� �ȿ��� ������� ����
		//			  �޼ҵ� �ȿ��� ������� ������ �޼ҵ带 ȣ���� �� �����ȴ�.
		//			  �޼ҵ尡 ������ �������.
		//			  ���������� static�� ���� �� ����.
		int s1 = 10;
		// static int s2 = 90;
		final int s3 = 85;
		// static final int s4 = 95;
	}
	// static, ��ȯ���� ����.
	public static void prn02() {
		// static �޼ҵ忡���� �ν��Ͻ� ������ ����� �� ����.
		// k1 = k1 + 20;
		k2 = k2 + 10;
		// k3 = k3 + 15;
		System.out.println("k2 = " + k2);
		System.out.println("k4 = " + k4);
	}
	// �ν��Ͻ�, ��ȯ���� �ִ�.
	public int prn03() {
		return 'c';
	}
	// static, ��ȯ���� �ִ�.
	public static int prn04() {
		return 147;
	}
}
