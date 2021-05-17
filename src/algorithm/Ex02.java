package algorithm;

import java.util.Scanner;

public class Ex02 {
	public static boolean is_prime(int x) {
		if (x <= 1) {
			return false;
		} else if (x == 2) {
			return true;
		}
		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int n = sc.nextInt();
		int ans = 0;
		while (n-- > 0) {
			if (is_prime(sc.nextInt())) {
				ans += 1;
			}
		}
		System.out.println(ans);
	}
}
