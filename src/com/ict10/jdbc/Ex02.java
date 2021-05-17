package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex02 {
	public static void main(String[] args) {
		// JDBC(Java Database Connectivity)�� �ڹٿ��� �����ͺ��̽��� ������ �� �ֵ��� ����
		// �ڹ� API�̴�.
		
		// DB ó���� �ʿ��� Ŭ���� 3��
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select���� ����� �޴� Ŭ���� cursor�� ����ؼ� ������ ������ �� �ִ�.
		// select���� ������ ������ ����� ���� �� ���
		int result = 0;
		try {
			// 1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. ���� ����
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// ������ �ۼ�
			String sql = "select * from book where bookid = ?";
			
			// ���� ���� ����
			pstmt = conn.prepareStatement(sql);
			
			// ���ε����� ó��
			pstmt.setInt(1, 5);
			
			// ���� DB�� �����ϰ� ��� �ޱ�
			// �������� select���̸� excuteQuery()
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
