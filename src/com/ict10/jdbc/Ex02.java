package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex02 {
	public static void main(String[] args) {
		// JDBC(Java Database Connectivity)는 자바에서 데이터베이스에 접속할 수 있도록 지원
		// 자바 API이다.
		
		// DB 처리에 필요한 클래스 3개
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select문의 결과를 받는 클래스 cursor를 사용해서 정보를 추출할 수 있다.
		// select문을 제외한 나머지 결과를 받을 때 사용
		int result = 0;
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. 접속 정보
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 쿼리문 작성
			String sql = "select * from book where bookid = ?";
			
			// 쿼리 구문 적용
			pstmt = conn.prepareStatement(sql);
			
			// 바인딩변수 처리
			pstmt.setInt(1, 5);
			
			// 실제 DB에 적용하고 결과 받기
			// 쿼리문이 select문이면 excuteQuery()
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.println(rs.getInt("price"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
