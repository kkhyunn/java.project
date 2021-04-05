package com.ict01.grammar04;
class Ex01 {
	public static void main(String[] args) {
		// switch ~ case문 : if문과 같은 분기문
		// if문의 조건식은 boolean형, 비교연산, 논리연산
		// switch문은 byte, short, int, char, String일 때 사용
		// 범위가 나오면 기본적으로는 if문을 사용하자
		// switch문은 100% if문으로 변환이 가능하다.
		// 형식 :
		// 	 switch(인자값(char, int, String)) {
		//	 case 조건값1 : 인자값이 요구하는 값이 조건값 1일 때 ; break;
		//	 case 조건값2 : 인자값이 요구하는 값이 조건값 2일 때 ; break;
		//	 case 조건값3 : 인자값이 요구하는 값이 조건값 3일 때 ; break;
		//	 }
		// ** 주의사항 : break문이 없으면 다음 break를 만날 때까지 
		// 		 모든 실행문을 실행한다.
		// break문은 해당 switch문을 빠져나가는 역할을 한다

		char k1 = 'A';
		String str = "";
		switch(k1) {
			case 'A' : 
			case 'a' : str = "아프리카"; break;
			case 'B' : 
			case 'b' : str = "브라질"; break;
			case 'C' : 
			case 'c' : str = "캐나다"; break;
			default : str = "한국";
		}
		System.out.println("결과 : " + str);

		int k2 = 3;
		String str2 = "";
		switch(k2) {
			case 1 :
			case 3 : str2 = "남자"; break;
			case 2 :
			case 4 : str2 = "여자"; break;
		}
		System.out.println("결과 : " + str2);

		String k3 = "한국";
		String str3 = "";
		switch(k3) {
			case "한국" : str3 = "서울"; break;
			case "중국" : str3 = "베이징"; break;
			case "일본" : str3 = "도쿄"; break;
			default : str3 = "데이터에 없는 나라입니다.";
		}
		System.out.println("결과 : " + str3);
		
	}
}