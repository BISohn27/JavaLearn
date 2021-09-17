package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBActionEx {

	public DBActionEx() {
		DBAction db = DBAction.getInstance();
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM TEST6";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			while(rs.next()) {
				for(int i =1; i<=cnt; i++)
					System.out.print(rs.getString(i)+"  ");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {}
		}
	}

	public static void main(String[] args) {
		DBActionEx d = new DBActionEx();
	}

}
