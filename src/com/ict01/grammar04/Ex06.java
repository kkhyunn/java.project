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
		System.out.print("�ݺ�Ƚ�� : ");
		int num = sc.nextInt();
		i = 0;
		do
		{
			System.out.println("Hello Java");
			i++;
		}
		while (i < num);

		System.out.print("�ݺ�Ƚ�� : ");
		int num1 = sc.nextInt();
		i = 0;
		String res = "";
		do
		{
			System.out.print("�Ǻ����� : ");
			int num2 = sc.nextInt();

			if (num2 % 2 == 0) res = "¦��"; 
			else res = "Ȧ��";

			System.out.println("�Է��� �� " + num2 + "�� " + res + "�Դϴ�.");
			i++;
		}
		while (i < num1);
		
	}
}
