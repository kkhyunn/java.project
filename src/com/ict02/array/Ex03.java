package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		int[] su = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		
		int temp = 0;
		for (int i = 0; i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {
				// 오름차순
				if (su[i] > su[j]) {
					temp = su[j];
					su[j] = su[i];
					su[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
		System.out.println("=========================");
		
		int[] su2 = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		// sort 메소드는 해당 배열을 오름차순하는 기능
		Arrays.sort(su2);
		
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i]);
		}
		System.out.println("=========================");
		
		Integer[] su3 = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		
		// Arrays.sort(배열, Collections.revesOrder())
		Arrays.sort(su3, Collections.reverseOrder());
		for (int i = 0; i < su3.length; i++) {
			System.out.println(su3[i]);
		}
		
		int[] su4 = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
	}
}
