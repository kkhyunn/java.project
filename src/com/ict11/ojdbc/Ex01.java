package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// DBó���� �ʿ��� Ŭ����
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null; // select��
		int result = 0; // select���� ������ ������
		
		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// �������� 3��
			String url = "jdbc:oracle:thin:@203.236.220.114:1521:xe";
			String user = "c##kim";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			// ���� �ۼ�
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