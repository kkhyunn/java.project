package com.ict01.grammar04;
class Ex08 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i < 11; i++)
		{
			if (i == 5) break;
			System.out.print(i + " ");
		}
		System.out.println();

		esc1:
		for (int i = 1; i < 11; i++)
		{
			if (i == 5) break esc1;
			System.out.print(i + " ");
		}

		for (int i = 1; i < 11; i++)
		{
			if (i == 5) break;
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
