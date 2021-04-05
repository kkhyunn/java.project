package com.ict01.grammar02;
class Ex10 {
	public static void main(String[] args) {
		int temp = 9630;
		int hour = temp / 3600;
		int min = (temp % 3600) / 60;
		int sec = (temp % 3600) % 60;
		System.out.println(hour + "시간 " + min + "분 " + sec + "초");
	}
}