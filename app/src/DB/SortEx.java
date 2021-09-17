package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class SortEx {
	/*
	 * ORDER BY 문 - ORDER BY (ASC[ascending], DESC[descending]) 정렬 [테이블 생성] : OBTEST
	 * CREATE TABLE OBTEST( NUM INT AUTO_INCREMENT, ID VARCHAR(10) );
	 * 
	 */
	public static void main(String[] args) {
		Connection conn = new DBAction().getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = orderBy();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			for (int i = 1; i <= cnt; i++) {
				String columnName = rsmd.getColumnName(i);
				System.out.print(columnName + "\t");
			}
			System.out.println();
			System.out.println("------------");
			while (rs.next()) {
				for (int i = 1; i <= cnt; i++) {
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
			}
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

	public static String insert() {
		String str = "INSERT INTO OBTEST(ID) VALUES('GHI')";
		return str;
	}

	public static String orderBy() {
		String str = "SELECT * FROM OBTEST ORDER BY NUM DESC";
		return str;
	}
}
