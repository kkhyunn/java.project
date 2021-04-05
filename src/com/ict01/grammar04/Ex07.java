package com.ict01.grammar04;
class Ex07 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i < 11; i++)
		{
			if (i == 4) break;
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i < 11; i++)
		{
			if (i == 4) continue;
			System.out.print(i + " ");
		}
		System.out.println();

		int k = 11;
		while (k < 21)
		{
			if (k == 17) break;
			System.out.print(k + " ");
			k++;
		}
		System.out.println();
		
		// 17로 무한 반복된다. (오류임)
		k = 11;
		while (k < 21)
		{
			// if (k == 17) continue;
			System.out.print(k + " ");
			k++;
		}
		System.out.println();

		for (int i = 1; i < 4; i++)
		{
			for (int j = 1; j < 6; j++)
			{
				System.out.println("i = " + i + ", j = " + j);
			}
		}
	}
}
