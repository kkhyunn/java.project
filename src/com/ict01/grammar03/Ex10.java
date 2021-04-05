package com.ict01.grammar03;
class Ex10 {
	public static void main(String[] args) {
		int k1 = 80;
		if (k1 >= 60) {
			System.out.println("합격");
		} else {
 			System.out.println("불합격");
		}

		int k2 = 2;
		if (k2 % 2 == 0) 
			System.out.println("짝수");
		else
			System.out.println("홀수");

		char k3 = 'A';
		if (k3 > 'A' && k3 < 'Z')
			System.out.println("대문자");
		else
			System.out.println("소문자");

		int k4 = 1;
		if (k4 == 1 || k4 == 3)
			System.out.println("남자");
		else 
			System.out.println("여자");

		int time = 10;
		int dan = 8720;
		int pay = time * dan;
		if (time > 8)
			pay = (8 * dan) + (int)((time - 8) * dan * 1.5);
		System.out.println(pay);
	}
}