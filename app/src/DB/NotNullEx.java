package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NotNullEx {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			stmt = conn.createStatement();
			try {
				stmt.executeUpdate("CREATE TABLE TEST1(ID VARCHAR(10) NOT NULL, PW VARCHAR(30), NAME VARCHAR(30), CRE_DATE DATETIME, AGE INTEGER)");
			}catch(Exception e) {}
			String sql = insert();
			int result = stmt.executeUpdate(sql);
			System.out.println(result>-1? "성공" : "실패" );
			sql = select();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			while(rs.next()) {
				for(int i = 1; i<= cnt; i++) {
					System.out.print(rs.getString(i));
				}
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
			if(rs != null) rs.close();
			if(stmt != null)stmt.close();
			if(conn != null)conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * DATA INSERT
	 * @return sql
	 */
	public static String insert() {
		String id = new Scanner(System.in).next();
		String pw = new Scanner(System.in).next();
		//특정된 열에만 데이터를 입력할 경우 테이블 이름 뒤에 추가할 열 이름을 작성함
		String sql = "INSERT INTO TEST1(ID,PW) VALUES('ABC','123')";
		return sql;
	}
	/**
	 * DATA SELECT
	 * @return sql
	 */
	public static String select(){
		String sql="SELECT * FROM TEST1";
		return sql;
	}
}
