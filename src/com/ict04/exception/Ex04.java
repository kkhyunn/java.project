package com.ict04.exception;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// finally : ����ó���� ������� �ݵ�� �����ؾ� �Ǵ� ������ 
		//           ó���� �� ���(�����ͺ��̽�, ��/���, ��Ʈ��ũ���� �ַ� ���)
		// try ~ catch ~ finally
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int var = 3;
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			System.out.println("���� : " + (var / num));
			// return;
		} catch (Exception e) {
			System.out.println("����� �Է��ϼ���." + e);
			return;
		} finally {
			System.out.println("�ݵ�� �����ؾ� �� ����");
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
