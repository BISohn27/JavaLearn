package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteEx {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","java");
			stmt = conn.createStatement();
			//Delete문
			String sql = delete(2);
			int result = stmt.executeUpdate(sql);
			System.out.println(result >-1 ? "성공" : "실패");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String delete(int number) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String id = scan.next();
		String sql="DELETE FROM DBTEST" + number + " WHERE ID=BINARY('" + id + "')";
		return sql;
	}

}
