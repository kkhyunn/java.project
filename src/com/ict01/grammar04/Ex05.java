package com.ict01.grammar04;
class Ex05 
{
	public static void main(String[] args) 
	{
		int i = 2;
		while (i < 10)
		{
			int j = 1;
			System.out.print(i + "´Ü ");
			while (j < 10)
			{
				System.out.print(i + " * " + j + " = " + i * j + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
