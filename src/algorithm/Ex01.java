package algorithm;

import java.util.Scanner;

public class Ex01 {
	public static int gcd(int x, int y) {
		if (y == 0) return x;
		else return gcd(y, x % y);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 입력 : ");
		int a = sc.nextInt();
		System.out.print("수2 입력 : ");
		int b = sc.nextInt();
		int g = gcd(a, b);
		int l = a * b / g;
		System.out.println(g);
		System.out.println(l);
	}
}
