package com.ict01.grammar02;
class Ex07 {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		int kor = 90;
		int eng = 80;
		int math = 90;
		int total = kor + eng + math;
		double avg = total / 3.0;
		double avg2 = (int) (avg * 10) / 10.0; // �Ҽ��� ���ڸ����� ǥ��
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg2);
	}
}