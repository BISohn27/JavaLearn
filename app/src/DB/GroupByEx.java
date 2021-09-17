package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class GroupByEx {
	/*
	 * 그룹화하여 데이터 조회 (GROUP BY) : 대표적인 그룹 함수 COUNT(), AVG(), MIN(), MAX(), SUM() 함수
	 * 등과, HAVING 절(조건절)을 사용함.(GROUP BY 안에서는 WHERE 사용 X)
	 * 
	 * [연습 테이블 만들기] : GBTEST CREATE TABLE GBTEST( IDX INT, TYPE INT, ->그룹화 하기 위한 분류
	 * 기준 NAME VARCHAR(10));
	 * 
	 * 유형(type)별로 갯수를 가져오고 싶은데, 단순히 count 함수로 데이터를 조회하면 전체 갯수만을 가져옵니다. Count 함수로
	 * 데이터를 조회하면 전체 객수만을 가져옵니다. 
	 * ex1) 컬럼 그룹화: type 그룹화하여 name 갯수 조회(컬럼 그룹화)
	 */
	public static void main(String[] args) {
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(select());
			rs=pstmt.executeQuery();
			ResultSetMetaData rsmt = rs.getMetaData();
			int cnt = rsmt.getColumnCount();
			
			for(int i = 1; i<=cnt; i++) 
				System.out.print(rsmt.getColumnName(i) + "\t");
			System.out.println();
			System.out.println("-----------------------------");
			
			while(rs.next()) {
				for(int i= 1; i<=cnt; i++)
					System.out.print(rs.getString(i) + "\t");
				System.out.println();
			}
//			String name[] = { "홍길동", "이순신", "만득이", "개똥이", "칠득이", "갑돌이", "갑순이" };
//			for (int i = 1; i <= 7; i++) {
//				if (i <= 2) {
//					pstmt = conn
//							.prepareStatement("INSERT INTO GBTEST VALUES(" + i + "," + 1 + ",'" + name[i - 1] + "')");
//					pstmt.executeUpdate();
//				} else if (i <= 4) {
//					pstmt = conn
//							.prepareStatement("INSERT INTO GBTEST VALUES(" + i + "," + 2 + ",'" + name[i - 1] + "')");
//					pstmt.executeUpdate();
//				} else if(i<=6){
//					pstmt = conn
//							.prepareStatement("INSERT INTO GBTEST VALUES(" + i + "," + 3 + ",'" + name[i - 1] + "')");
//					pstmt.executeUpdate();
//					}else {
//						pstmt = conn
//								.prepareStatement("INSERT INTO GBTEST VALUES(" + i + "," + 4 + ",'" + name[i - 1] + "')");
//						pstmt.executeUpdate();
//					}
//						
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static String select() {
//		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST GROUP BY TYPE";
		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST WHERE TYPE > 1 GROUP BY TYPE";
//		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST WHERE TYPE > 1 GROUP BY TYPE HAVING CNT>=2";
//		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST "
//				+ "WHERE TYPE >1 GROUP BY TYPE HAVING CNT>=2 ORDER BY TYPE DESC";
		return sql;
	}

}
