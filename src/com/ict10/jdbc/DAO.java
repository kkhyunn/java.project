package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DAO란 Data Access Object의 약어로서 실직적으로 DB에 접근하는 객체를 말한다.
// DAO의 사용 이유는 효율적인 커넥션 관리와 보안성 때문이다.
// DAO는 DB를 사용해 데이터를 조회하거나 조작하는 기능을 전담하도록 만든 오브젝트를 말한다.
 
public class DAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	
	// DB에 접속하는 역할을 수행한다.
	public DAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	// 각종 DB 접근 메소드를 만들자
	// 전체 정보 출력하는 메소드
	public void getList() {
		try {
			String sql = "select * from book order by bookid";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("도서번호\t도서명\t출판사\t가격");
			while (rs.next()) {
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
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
	
	// 삽입하는 메소드
	public void getInsert(int i_bookid, String i_bookname, String i_publisher, int i_price) {
		try {
			String sql = "insert into book values(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, i_bookid);
			pstmt.setString(2, i_bookname);
			pstmt.setString(3, i_publisher);
			pstmt.setInt(4, i_price);
			result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("삽입 성공");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	// 삭제하는 메소드
	public void getDelete(int i_bookid) {
		try {
			String sql = "delete from book where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, i_bookid);
			result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("삭제 성공");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	// 수정하는 메소드
	public void getUpdate(int u_bookid, String u_bookname, String u_publisher, int u_price) {
		try {
			String sql = "update book set bookname = ?, publisher = ?, price = ? where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u_bookname);
			pstmt.setString(2, u_publisher);
			pstmt.setInt(3, u_price);
			pstmt.setInt(4, u_bookid);
			result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	// 검색하는 메소드
	public void getSelect(int i_bookid) {
		try {
			String sql = "select * from book where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, i_bookid);
			rs = pstmt.executeQuery();
			System.out.println("도서번호\t도서명\t출판사\t가격");
			while (rs.next()) {
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.println(rs.getInt("price"));
			}
			if (result > 0) {
				System.out.println("검색 성공");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
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










