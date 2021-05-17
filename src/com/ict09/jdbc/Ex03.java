package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		Connection conn = null; // DB 접속에 필요
		Statement stmt = null;
		ResultSet rs = null; // select문의 결과를 받는다
		int result = 0; // insert, update, delete의 결과
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속을 위한 정보(3개)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. 쿼리문 작성(CRUD = 조작어(insert, update, delete, select))
			String sql = "update cust";
			
			// 4. 실제 DB에 접속 정보를 가지고 statement 클래스에 저장
			stmt = conn.createStatement();
			
			// select문일 때는 ResultSet 클래스가 받는다.
			// rs = stmt.executeQuery(sql);
			
			// select문이 아닌 경우(insert, update, delete) int가 받는다.
			// result = stmt.executeUpdate(sql);
			
			// 6. 결과 보기
			// .next() : 다음 줄에 정보가 있으면 true
			while (rs.next()) {
				System.out.print(rs.getInt("custid") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("address") + "\t");
				System.out.println(rs.getString("phone"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
