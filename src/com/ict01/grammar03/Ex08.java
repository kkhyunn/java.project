package com.ict01.grammar03;
import java.util.Scanner;

class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		String res1 = (num % 2 == 0) ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		System.out.println(num + "�� " + res1);
		
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		int avg = (kor + eng + math) / 3;

		String res2 = (avg >= 60 && (kor > 40 && eng > 40 && math > 40)) ? "�հ�" : "���հ�";
		System.out.println(res2);

		System.out.print("�˹� �ð� : ");
		int time = sc.nextInt();
		int dan = 8720;
		int pay = (time <= 8) ? dan * time : (int)((time - 8) * (dan * 1.5) + 8 * dan);
		System.out.println("�˹ٺ�� " + pay + "�� �Դϴ�.");
		
	}
}