package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		Connection conn = null; // DB ���ӿ� �ʿ�
		Statement stmt = null;
		ResultSet rs = null; // select���� ����� �޴´�
		int result = 0; // insert, update, delete�� ���
		
		try {
			// 1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. ������ ���� ����(3��)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. ������ �ۼ�(CRUD = ���۾�(insert, update, delete, select))
			String sql = "update cust";
			
			// 4. ���� DB�� ���� ������ ������ statement Ŭ������ ����
			stmt = conn.createStatement();
			
			// select���� ���� ResultSet Ŭ������ �޴´�.
			// rs = stmt.executeQuery(sql);
			
			// select���� �ƴ� ���(insert, update, delete) int�� �޴´�.
			// result = stmt.executeUpdate(sql);
			
			// 6. ��� ����
			// .next() : ���� �ٿ� ������ ������ true
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