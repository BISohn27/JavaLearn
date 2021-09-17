package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class BetweenEx {
/*
 *  BETWEEN (범위): A AND B 에서 A와 B를 포함한(INCLUSIVE)
 *  				그 사이의 모든 값에 해당하는지 여부를 조건으로 한다.
 *  	[실습테이블 만들기]: BWTEST
 *  	CREATE TABLE BWTEST(
 *  		INDX INT,
 *  		BIRTH DATE,
 *  	NAME VARCHAR(10));
 * 
 * 	LIMIT N: 범위 추출(MYSQL 내부 ROW COUNT 시스템을 기준으로 1부터 N까지 추출)
 * 	LIMIT N1 OFFSET N2: ROW 번호 N2이후 부터 N1개 추출 
 */
	public static void main(String[] args) {
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = select();
			pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			ResultSetMetaData rsmt = rs.getMetaData();
			int cnt = rsmt.getColumnCount();
			
			for(int i = 1; i<=cnt; i++) 
				System.out.print(rsmt.getColumnName(i) + "        ");
			System.out.println();
			System.out.println("-----------------------------");
			
			while(rs.next()) {
				for(int i= 1; i<=cnt; i++)
					System.out.print(rs.getString(i) + "\t");
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static String insert() {
//		String sql = "INSERT INTO BWTEST VALUES(1, '2020-01-01','홍길동')";
//		String sql = "INSERT INTO BWTEST VALUES(2, '2020-01-02','이순신')";
//		String sql = "INSERT INTO BWTEST VALUES(3, '2020-01-03','만득이')";
//		String sql = "INSERT INTO BWTEST VALUES(4, '2020-01-04','개똥이')";
//		String sql = "INSERT INTO BWTEST VALUES(5, '2020-01-05','칠득이')";
//		String sql = "INSERT INTO BWTEST VALUES(6, '2020-01-06','갑돌이')";
		String sql = "INSERT INTO BWTEST VALUES(7, '2020-01-07','갑순이')";
		
		return sql;
	}
	
	public static String select() {
//		String sql = "SELECT * FROM BWTEST WHERE BIRTH BETWEEN '2020-01-02' AND '2020-01-05'";
		//String sql = "SELECT * FROM BWTEST WHERE INDX BETWEEN 2 AND 5;
//		String sql = "SELECT * FROM BWTEST LIMIT 2"; //1부터 N까지 행을 기준으로 데이터를 추출
		String sql = "SELECT * FROM BWTEST ORDER BY INDX ASC LIMIT 1 OFFSET 6";
		return sql;
	}
}
