package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ���� catch�� : try���� ���� �߻��� ���������� ���ܰ� �߻��� ��� ���
		// ���ǻ��� : Exception�� ����� ���� �ݵ�� �Ʒ��� catch������ ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
//		try {
//			int var = 3;
//			System.out.print("���� �Է� : ");
//			int num = sc.nextInt();
//			System.out.println("���� : " + (var / num));
//		} 
//		catch (InputMismatchException e) {
//			System.out.println("������ �Է��ϼ���");
//		}
//		catch (ArithmeticException e) {
//			System.out.println("0���δ� ���ڸ� ���� �� �����ϴ�.");
//		}
		
		try {
			int var = 3;
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			System.out.println("���� : " + (var / num));
		} catch (Exception e) {
			System.out.println("����� �Է��ϼ���.");
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
