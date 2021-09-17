package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SelectEx {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		//db에서 한꺼번에 넘어 온 데이터가 저장되어 있는 객체
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","java");
			stmt = conn.createStatement();
			String sql = select(1);
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();
			//rs.next()는 row의 개수만큼 iterate된다.-> 다음 row(처음 시작활 때에는 아무것도 지칭하지 않는 것에서 시작)에 포인터를 옮기는 역할
			while(rs.next()) {
//				//1번 column부터 끝까지 가져온다.
//				//index number를 넣거나 직접 column이름을 넣거나
//				System.out.print("ID : " + rs.getString(1));
//				System.out.print(", PW : " + rs.getString(2));
//				System.out.println(", NAME : " + rs.getString(3));
//				for(int i = 1; i<= columns; i++)
//					System.out.print(rs.getString(i) + "/t");
				System.out.println();
				for(int i =1; i<=columns; i++)
					System.out.print(rsmd.getColumnName(i)+"\t");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 *	SELECT
	 * 	@return SQL
	 */
	public static String select() {
		Scanner scan = new Scanner(System.in);
		System.out.print("열 이름을 입력하세요.> ");
		String column = scan.next();
		System.out.print("검색하고자 하는 데이터를 입력하세요.> ");
		String dataName = scan.next();
		//*자리에는 COLUMN 이름이 올 수 있다.
		//SELECT ID FROM DBTEST -> ID를 추출해와라
		String sql = "SELECT * FROM DBTEST2 WHERE " + column + "='" + dataName+ "'";
		return sql;
	}
	public static String select(int number) {
		//*자리에는 COLUMN 이름이 올 수 있다.
		//SELECT ID FROM DBTEST -> ID를 추출해와라
		String sql = "SELECT * FROM DBTEST2";
		return sql;
	}
}
