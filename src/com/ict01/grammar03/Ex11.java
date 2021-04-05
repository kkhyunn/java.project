package com.ict01.grammar03;
import java.util.Scanner;

class Ex11 {
	public static void main(String[] args) {
		int k1 = 94;
		char grade = ' ';
		if (k1 >= 90)
			grade = 'A';
		else if (k1 >= 80)
			grade = 'B';
		else if (k1 >= 70)
			grade = 'C';
		else
			grade = 'F';
		System.out.println(grade);

		char k2 = 'A';
		String str = "";
		if (k2 >= 'A' && k2 <= 'Z')
			str = "대문자";
		else if (k2 >= 'a' && k2 <= 'z')
			str = "소문자";
		else 
			str = "기타문자";
		System.out.println(str);

		char k3 = 'a';
		String str2 = "";
		if (k3 == 'a' || k3 == 'A')
			str2 = "아프리카";
		else if (k3 == 'b' || k3 == 'B')
			str2 = "브라질";
		else if (k3 == 'c' || k3 == 'C')
			str2 = "캐나다";
		else
			str2 = "한국";
		System.out.println(str2);

		Scanner sc = new Scanner(System.in);
		int dan = 0;
		int bill = 10000;

		System.out.print("메뉴를 선택하시오. : ");
		int menu = sc.nextInt();
		if (menu == 1)
			dan = 3500;
		else if (menu == 2)
			dan = 4000;
		else if (menu == 3)
			dan = 3000;
		else if (menu == 4)
			dan = 3500;
		
		System.out.print("수량을 선택하시오. : ");
		int num = sc.nextInt();
		
		int change = bill - (num * dan);
		System.out.println("잔돈은 " + change + "원 입니다.");
		
	}
}