package com.ict01.grammar04;
class Ex02 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i < 11; i++)
		{
			System.out.println("¾È³çÇÏ¼¼¿ä. - " + i);
		}
		for (int i = 0; i < 16; i++)
		{
			System.out.print(i + "  ");
		}	
		System.out.println();

		for (int i = 0; i < 11; i++)
		{
			if (i % 2 == 0)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();

		for (int i = 0; i < 11; i++)
		{
			if (i % 2 == 1)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();

		for (int i = 0; i < 51; i++)
		{
			if (i % 7 == 0)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();

		for (int i = 1; i < 10; i++)
		{
			System.out.print(5 * i + " ");
		}
		System.out.println();

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				System.out.print(0 + " ");
			}
			System.out.println();
		}
		
		int temp = 0;
		for (int i = 0; i < 11; i++)
		{
			temp += i;
		}
		System.out.println(temp);

		int temp1 = 0;
		int temp2 = 0;
		for (int i = 0; i < 11; i++)
		{
			if (i % 2 == 1)
			{
				temp1 += i;
			}
		}
		System.out.println(temp1);

		for (int i = 0; i < 11; i++)
		{
			if (i % 2 == 0)
			{
				temp2 += i;
			}
		}
		System.out.println(temp2);
		
		int temp3 = 1;
		for (int i = 7; i > 0; i--)
		{
			temp3 *= i;
		}
		System.out.println(temp3);
	}
}
