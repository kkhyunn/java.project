package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 데이터를 받아서 VO에 넣자
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = new ArrayList<VO>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 계정을 만들 때 'test02'@'%'
			String url = "jdbc:mysql://203.236.220.114:3306/test02db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test02";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			esc:
			while (true) {
				System.out.print("학번 : ");
				int no = sc.nextInt();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("학과 : ");
				String det = sc.next();
				System.out.print("주소 : ");
				String addr = sc.next();
				System.out.print("전화 : ");
				String tel = sc.next();
				
				// 받은 정보 저장
				list.add(new VO(no, name, det, addr, tel));
				while (true) {
					System.out.print("계속할까요?(y/n)  ");
					String msg = sc.next();
					if (msg.equalsIgnoreCase("y")) {
						continue esc;
					} else if (msg.equalsIgnoreCase("n")) {
						break esc;
					} else {
						continue;
					}
				}
			}
			
			// 저장 정보 DB 입력
			for (int i = 0; i < list.size(); i++) {
				String sql = "insert into student_tb(No, name, det, addr, tel)" 
							+ "values("+ list.get(i).getNo() + ", '" + list.get(i).getName() + "', '" + list.get(i).getDet() +"', '"
							+ list.get(i).getAddr() + "', '"+ list.get(i).getTel() +"')";
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				if (result < 0) {
					System.out.println("오류발생");
				}
			}
			String sql = "select * from student_tb";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("번호\t이름\t학과\t주소\t전화");
			while (rs.next()) {
				System.out.print(rs.getInt("no") +"\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("det") + "\t");
				System.out.print(rs.getString("addr") + "\t");
				System.out.println(rs.getString("tel"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
