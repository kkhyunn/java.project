package com.ict01.grammar03;
import java.util.Scanner;

class Ex11 {
	public static void main(String[] args) {
		int k1 = 94;
		char grade = ' ';
		if (k1 >= 90)
			grade = 'A';
		else if (k1 >= 80)
			grade = 'B';
		else if (k1 >= 70)
			grade = 'C';
		else
			grade = 'F';
		System.out.println(grade);

		char k2 = 'A';
		String str = "";
		if (k2 >= 'A' && k2 <= 'Z')
			str = "�빮��";
		else if (k2 >= 'a' && k2 <= 'z')
			str = "�ҹ���";
		else 
			str = "��Ÿ����";
		System.out.println(str);

		char k3 = 'a';
		String str2 = "";
		if (k3 == 'a' || k3 == 'A')
			str2 = "������ī";
		else if (k3 == 'b' || k3 == 'B')
			str2 = "�����";
		else if (k3 == 'c' || k3 == 'C')
			str2 = "ĳ����";
		else
			str2 = "�ѱ�";
		System.out.println(str2);

		Scanner sc = new Scanner(System.in);
		int dan = 0;
		int bill = 10000;

		System.out.print("�޴��� �����Ͻÿ�. : ");
		int menu = sc.nextInt();
		if (menu == 1)
			dan = 3500;
		else if (menu == 2)
			dan = 4000;
		else if (menu == 3)
			dan = 3000;
		else if (menu == 4)
			dan = 3500;
		
		System.out.print("������ �����Ͻÿ�. : ");
		int num = sc.nextInt();
		
		int change = bill - (num * dan);
		System.out.println("�ܵ��� " + change + "�� �Դϴ�.");
		
	}
}