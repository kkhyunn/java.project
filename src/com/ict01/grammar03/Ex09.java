package com.ict01.grammar03;
class Ex09 {
	public static void main(String[] args) {
		int k1 = 80;
		String res = "초기값";
		if(k1 >= 80) {
			res = "합격";
		}
		System.out.println("결과 : " + res);

		int k2 = 15;
		int k3 = 10;
		if (k2 > k3) {
			System.out.println(k2);
		} else {
			System.out.println(k3);
		}
	}
}