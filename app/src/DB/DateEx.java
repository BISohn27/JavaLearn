package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DateEx {
/*
 * 	ex1) NOW, SYSDATE : 현재 시간, 날짜 정보 출력
 * 	ex2) CURDATE, CURRENTDATE : 현재 날짜 정보 출력
 * 	ex3) CURTIME, CURRENTTIME : 현재 시간 정보 출력
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
				System.out.print(rsmt.getColumnName(i) + "                  ");
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
	static String select() {
		//String sql = "SELECT SYSDATE() SYSDATE, NOW() NOW";
//		String sql = "SELECT CURDATE() CURDATE, CURRENT_DATE() CURRENTDATE";
		String sql = "SELECT CURTIME() CURTIME, CURRENT_TIME() CURRENTTIME";
		return sql;
	}
}
