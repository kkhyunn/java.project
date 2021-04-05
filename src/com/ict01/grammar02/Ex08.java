package com.ict01.grammar02;
class Ex08 {
	public static void main(String[] args) {
		String coff = "?•„ë©”ë¦¬ì¹´ë…¸";
		int dan = 2500;
		int su = 2;
		int input = 10000;
		
		int total = dan * su;
		int vat = (int)(total * 0.1);

		int output = input - (total + vat);
		System.out.println("?”?ˆ : " + output);
		int balance = (int)(10000 - (5000*1.1));
		System.out.println(balance);
	}
}