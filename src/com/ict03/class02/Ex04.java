package com.ict03.class02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int vcnt = 0;
		
		esc:
		while (true) {
			count++;
			System.out.println("1.가위 2.바위 3.보 중에 고르시오.");
			int you = (int)(Math.random() * 3 + 1);
			int me = sc.nextInt();
			if (me == 0 || me >= 4) {
				System.out.println("1 ~ 3 중에 입력하시오.\n");
				continue;
			}
			
			if (you == 1)
				System.out.println("상대가 낸 것 : 가위(" + you + ")");
			else if (you == 2)
				System.out.println("상대가 낸 것 : 바위(" + you + ")");
			else if (you == 3)
				System.out.println("상대가 낸 것 : 보(" + you + ")");
			
			if (me == you) 
				System.out.println("비겼습니다.\n");
			else if (me == 1 && you == 3) {
				System.out.println("당신이 이겼습니다.\n");
				vcnt++;
			}
			else if (me == 2 && you == 1) {
				System.out.println("당신이 이겼습니다.\n");
				vcnt++;
			}
			else if (me == 3 && you == 2) {
				System.out.println("당신이 이겼습니다.\n");
				vcnt++;
			}
			else
				System.out.println("당신이 졌습니다.\n");
			
			while (true) {
				System.out.print("계속할까요?(y/n) >> ");
				String msg = sc.next();
				if (msg.equalsIgnoreCase("y"))
					continue esc;
				else if (msg.equalsIgnoreCase("n"))
					break esc;
				else continue;
			}
		}
		System.out.println("수고하셨습니다.");
		System.out.println("당신의 도전횟수 : " + count);
		System.out.println("당신의 승률 : " + (vcnt * 1.0 / count) * 100 + "%");
	}
}
