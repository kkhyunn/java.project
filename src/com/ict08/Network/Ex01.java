package com.ict08.Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) {
		// InetAddress : 자바에서 IP 주소를 표현하는 클래스
		// 				 생성자가 존재하지만 사용하지 않는다.
		//				 6개의 static 메소드를 이용한다.
		// ** localhost : 현재 내가 사용하고 있는 컴퓨터를 말한다.
		
		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println("=============================");
			
			// 내 컴퓨터에 관한 정보
			addr = InetAddress.getLocalHost();
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println("=============================");
			
			InetAddress[] addrs = InetAddress.getAllByName("www.daum.net");
			for (InetAddress k : addrs) {
				System.out.println("이름 : " + k.getHostName());
				System.out.println("주소 : " + k.getHostAddress());
				System.out.println("toString : " + k.toString());
				System.out.println("--------------------------");
			}
			
			// 203.133.167.16
			byte[] b = {(byte)203, (byte)133, (byte)167, 16};
			addr = InetAddress.getByAddress(b);
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println("=============================");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
