package com.ict01.grammar02;
class Ex07 {
	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int math = 90;
		int total = kor + eng + math;
		double avg = total / 3.0;
		double avg2 = (int) (avg * 10) / 10.0; // 소수점 한자리까지 표시
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg2);
	}
}