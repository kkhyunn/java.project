package com.ict01.grammar03;
class Ex10 {
	public static void main(String[] args) {
		int k1 = 80;
		if (k1 >= 60) {
			System.out.println("�հ�");
		} else {
 			System.out.println("���հ�");
		}

		int k2 = 2;
		if (k2 % 2 == 0) 
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");

		char k3 = 'A';
		if (k3 > 'A' && k3 < 'Z')
			System.out.println("�빮��");
		else
			System.out.println("�ҹ���");

		int k4 = 1;
		if (k4 == 1 || k4 == 3)
			System.out.println("����");
		else 
			System.out.println("����");

		int time = 10;
		int dan = 8720;
		int pay = time * dan;
		if (time > 8)
			pay = (8 * dan) + (int)((time - 8) * dan * 1.5);
		System.out.println(pay);
	}
}