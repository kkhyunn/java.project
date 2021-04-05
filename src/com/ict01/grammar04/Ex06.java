package com.ict01.grammar04;
import java.util.Scanner;

class Ex06 
{
	public static void main(String[] args) 
	{
		int i = 0;
		do
		{
			System.out.print(i + " ");
			i++;
		}
		while (i < 11);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반복횟수 : ");
		int num = sc.nextInt();
		i = 0;
		do
		{
			System.out.println("Hello Java");
			i++;
		}
		while (i < num);

		System.out.print("반복횟수 : ");
		int num1 = sc.nextInt();
		i = 0;
		String res = "";
		do
		{
			System.out.print("판별숫자 : ");
			int num2 = sc.nextInt();

			if (num2 % 2 == 0) res = "짝수"; 
			else res = "홀수";

			System.out.println("입력한 수 " + num2 + "는 " + res + "입니다.");
			i++;
		}
		while (i < num1);
		
	}
}
