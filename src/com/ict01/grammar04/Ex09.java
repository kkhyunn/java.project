package com.ict01.grammar04;
import java.util.Scanner;
class Ex09 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			for (int i = 1; i < 11; i++)
			{
				if (i % 2 == 1) continue;
				System.out.println(i);
			}

			System.out.print("숫자 입력 : ");
			int k = scan.nextInt();
			String msg = "";
			if (k % 2 == 0)
			{
				msg = "짝수";
			} else {
				msg = "홀수";
			}
			System.out.println(k + "는 " + msg + " 입니다.");
			System.out.print("계속할까요?(1.yes 2.no)");
			int k2 = scan.nextInt();
			if (k2 == 2) break;
		}
	}
}
