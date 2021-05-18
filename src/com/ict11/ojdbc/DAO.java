package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DAO 란 Data Access Object 의 약자로서 실질적인 DB에 접근하는 객체 말한다.
// DB를 사용해 데이터를 조회하거나 조작하는 기능을 전담하도록 하는 오브젝트를 말한다.
public class DAO {
	Connection conn ;
	PreparedStatement pstm;
	ResultSet rs ;
	int result ;
	
	// 싱글턴 패턴 : 프로그램이 시작에서 끝날때까지 하나의 객체만 사용하는 디자인 패턴을 말한다.
	private static DAO dao = new DAO();
	public static DAO getInstance() {
		return dao ;
	}
	
	// DB에 접속하는 역할을 수행 메소드 
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.114:1521:xe";
			String user = "c##kim";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	// DB에 접근해서 처리하는 메소드들 
	// book table의 전체 내용 보기
	public void getList() {
		try {
			// DB 접속 
			conn = getConnection();
			String sql = "select * from book order by bookid";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("번호\t도서명\t\t출판사\t\t\t가격");
			while(rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
	
	// 삽입
	public void getInsert(int i_bookid, String i_bookname,
			String i_publisher, int i_price) {
		try {
			// DB 접속 
		    conn = getConnection();
			String sql = "insert into book values(?, ?, ?, ?)";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, i_bookid);
			pstm.setString(2, i_bookname);
			pstm.setString(3, i_publisher);
			pstm.setInt(4, i_price);
			result = pstm.executeUpdate();
			if(result > 0) {
				System.out.println("삽입성공");
			}
		} catch (Exception e) {
		} finally {
			try {
				
			} catch (Exception e2) {
			}
		}
	}
	
	// 삭제
	public void getDelete(int d_bookid) {
		try {
			conn = getConnection();
			String sql = "delete from book where bookid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, d_bookid);
			result = pstm.executeUpdate();
			if(result > 0) {
				System.out.println("삭제 성공");
			}
		} catch (Exception e) {
			// TODO: handle exception
			
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	// 수정
	public void getUpdate(int u_bookid, String u_bookname, 
			String u_publisher, int u_price) {
		try {
			conn = getConnection();
			String sql = "update book set bookname = ?, publisher = ?, price = ? where bookid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, u_bookname);
			pstm.setString(2, u_publisher);
			pstm.setInt(3, u_price);
			pstm.setInt(4, u_bookid);
			result = pstm.executeUpdate();
			
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
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	// 검색
	public void getSelect(int i_bookid) {
		try {
			conn = getConnection();
			
			String sql = "select * from book where bookid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, i_bookid);
			rs = pstm.executeQuery();
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
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}













