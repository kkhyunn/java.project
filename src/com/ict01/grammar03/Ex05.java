package com.ict01.grammar03;
class Ex05 {
	public static void main(String[] args) {
		int k1 = 80;
		String result = (k1 >= 60) ? "�հ�" : "���հ�";
		System.out.println("��� : " + result);

		int k2 = 3;
		String result2 = (k2 % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println("��� : " + result2);

		char k3 = 'a';
		String result3 = (k3 >= 65 && k3 <= 90) ? "�빮��" : "�ҹ���";
		System.out.println("��� : " + result3);

		int time = 10;
		int dan = 8720;
		int pay = (time > 8) ? (8 * dan) + (int)((time - 8) * (dan * 1.5)) : (time * dan);
		System.out.println("���� : " + pay);
	}
}