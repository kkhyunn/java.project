package com.ict01.grammar03;
import java.util.Scanner;
class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸� : ");
		
		String name = sc.next();
		
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();

		System.out.print("���� ���� : ");
		int eng = sc.nextInt();

		System.out.print("���� ���� : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		System.out.println("���� : " + sum);

		System.out.print("����� Ű : ");
		double height = sc.nextDouble();
		System.out.println(height);

		System.out.print("����� �����Դϱ�?(true/false)");
		boolean gender = sc.nextBoolean();
		String str = gender ? "�����Դϴ�." : "�����Դϴ�.";
		System.out.println(str);
		
	}
}