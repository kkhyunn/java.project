package com.ict01.grammar04;
class Ex04 
{
	public static void main(String[] args) 
	{
		int i = 0;
		while (i < 16)
		{
			System.out.print(i + " ");
			i++;
		} // 참일 때 까지 실행
		System.out.println();

		i = 0;
		while (true)
		{
			if (i >= 16) break;
			System.out.print(i + " ");
			i++;
		} // 참이 아닐 때 종료
		System.out.println();
		
		i = 0;
		while (i < 11)
		{
			if (i % 2 == 1)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();

		i = 0;
		while (true)
		{
			if (i >= 11) break;
			if (i % 2 == 1)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();

		i = 0;
		while (true)
		{
			if (i >= 11) break;
			if (i % 2 == 0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();

		i = 0;
		while (true)
		{
			if (i >= 51) break;
			if (i % 7 == 0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();

		i = 1;
		while (true)
		{
			if (i > 9) break;
			System.out.print(5 * i + " ");
			i++;
		}
		System.out.println();

		i = 1;
		while (true)
		{
			if (i > 16) break;
			System.out.print(0 + " ");
			if (i % 4 == 0) System.out.println();
			i++;
		}
		System.out.println();

		i = 0;
		int sum = 0;
		while (true)
		{
			if (i > 10) break;
			sum += i;
			i++;
		}
		System.out.println(sum);

		i = 0;
		sum = 0;
		int odd = 0;
		int even = 0;
		while (true)
		{
			if (i > 10) break;
			if (i % 2 == 1) odd += i;
			else even += i;
		
			i++;
			sum = odd + even;
		}
		System.out.println(odd);
		System.out.println(even);
		System.out.println(sum);
	}
}
