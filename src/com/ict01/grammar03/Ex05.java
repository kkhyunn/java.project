package com.ict01.grammar03;
class Ex05 {
	public static void main(String[] args) {
		int k1 = 80;
		String result = (k1 >= 60) ? "합격" : "불합격";
		System.out.println("결과 : " + result);

		int k2 = 3;
		String result2 = (k2 % 2 == 0) ? "짝수" : "홀수";
		System.out.println("결과 : " + result2);

		char k3 = 'a';
		String result3 = (k3 >= 65 && k3 <= 90) ? "대문자" : "소문자";
		System.out.println("결과 : " + result3);

		int time = 10;
		int dan = 8720;
		int pay = (time > 8) ? (8 * dan) + (int)((time - 8) * (dan * 1.5)) : (time * dan);
		System.out.println("수당 : " + pay);
	}
}