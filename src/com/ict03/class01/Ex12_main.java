package com.ict03.class01;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학 점수를 받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고 정렬하자

		Scanner sc = new Scanner(System.in);
		Ex12[] arr = new Ex12[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
			
			Ex12 person = new Ex12(name, kor, eng, math);
			arr[i] = person;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					continue;
				if (arr[i].getSum() < arr[j].getSum())
					arr[i].setRank(arr[i].getRank() + 1);
			}
		}

		Ex12 temp = new Ex12();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + " ");
			System.out.print(arr[i].getSum() + " ");
			System.out.print(arr[i].getAvg() + " ");
			System.out.print(arr[i].getHak() + " ");
			System.out.println(arr[i].getRank() + " ");
		}
	}
}
