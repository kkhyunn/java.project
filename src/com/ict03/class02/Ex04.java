package com.ict03.class02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int vcnt = 0;
		
		esc:
		while (true) {
			count++;
			System.out.println("1.���� 2.���� 3.�� �߿� ���ÿ�.");
			int you = (int)(Math.random() * 3 + 1);
			int me = sc.nextInt();
			if (me == 0 || me >= 4) {
				System.out.println("1 ~ 3 �߿� �Է��Ͻÿ�.\n");
				continue;
			}
			
			if (you == 1)
				System.out.println("��밡 �� �� : ����(" + you + ")");
			else if (you == 2)
				System.out.println("��밡 �� �� : ����(" + you + ")");
			else if (you == 3)
				System.out.println("��밡 �� �� : ��(" + you + ")");
			
			if (me == you) 
				System.out.println("�����ϴ�.\n");
			else if (me == 1 && you == 3) {
				System.out.println("����� �̰���ϴ�.\n");
				vcnt++;
			}
			else if (me == 2 && you == 1) {
				System.out.println("����� �̰���ϴ�.\n");
				vcnt++;
			}
			else if (me == 3 && you == 2) {
				System.out.println("����� �̰���ϴ�.\n");
				vcnt++;
			}
			else
				System.out.println("����� �����ϴ�.\n");
			
			while (true) {
				System.out.print("����ұ��?(y/n) >> ");
				String msg = sc.next();
				if (msg.equalsIgnoreCase("y"))
					continue esc;
				else if (msg.equalsIgnoreCase("n"))
					break esc;
				else continue;
			}
		}
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("����� ����Ƚ�� : " + count);
		System.out.println("����� �·� : " + (vcnt * 1.0 / count) * 100 + "%");
	}
}
