package com.ict01.grammar03;
import java.util.Scanner;
class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름 : ");
		
		String name = sc.next();
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();

		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();

		System.out.print("수학 점수 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		System.out.println("총점 : " + sum);

		System.out.print("당신의 키 : ");
		double height = sc.nextDouble();
		System.out.println(height);

		System.out.print("당신은 남성입니까?(true/false)");
		boolean gender = sc.nextBoolean();
		String str = gender ? "남성입니다." : "여성입니다.";
		System.out.println(str);
		
	}
}