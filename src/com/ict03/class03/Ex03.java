package com.ict03.class03;

// Ex02�� Ex03�� ��Ӱ���
public class Ex03 extends Ex02{
	String name = "���θ�";
	int age = 34;
	static String hobby = "��ȭ����";
	
	public Ex03() {
		System.out.println("�ڽ� Ŭ���� ������");
	}
	
	public void sound() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ�");
	}
	
	public void study() {
		// ��ü �������� �θ�Ŭ������ ����� ����� ��
		System.out.println("������� : " + addr);
		
		System.out.println("name : " + this.name); // ���θ�
		System.out.println("name : " + super.name); // ������
		// ��Ӱ���� private�� ����� �� ����.
		// System.out.println("�츮�� �ֿϵ��� : " + dog);
	}
	
	// �������̵�(������) : �Ѹ���� �θ�޼ҵ带 �״�� ����ϴ� ��
	//						���븸 �����ϴ°�
	public void eat() {
		System.out.println("��ħ���� �����Ѵ�.");
	}
	
	// �������̵��� �� �� ���� �ϴ� ����� : final
	// �θ�޼ҵ忡 final�� ������ override �� �� ����.
}
