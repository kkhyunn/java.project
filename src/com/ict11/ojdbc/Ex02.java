package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// DB처리에 필요한 클래스
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null; // select문
		int result = 0; // select문을 제외한 나머지
		
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 접속정보 3개
			String url = "jdbc:oracle:thin:@203.236.220.114:1521:xe";
			String user = "c##kim";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			// 쿼리 작성
			String sql = "select * from book order by bookid";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");				
				System.out.println(rs.getInt("price") + "\t");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
		}
	}
}
