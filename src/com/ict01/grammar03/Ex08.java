package com.ict01.grammar03;
import java.util.Scanner;

class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		String res1 = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println(num + "은 " + res1);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		int avg = (kor + eng + math) / 3;

		String res2 = (avg >= 60 && (kor > 40 && eng > 40 && math > 40)) ? "합격" : "불합격";
		System.out.println(res2);

		System.out.print("알바 시간 : ");
		int time = sc.nextInt();
		int dan = 8720;
		int pay = (time <= 8) ? dan * time : (int)((time - 8) * (dan * 1.5) + 8 * dan);
		System.out.println("알바비는 " + pay + "원 입니다.");
		
	}
}