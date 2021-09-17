package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ForeignKeyEx {
	/*
	 * 	FOREIGN KEY : 외래 키
	 * 		FOREIGN KEY 제약 조건을 설정한 필드는 외래 키라고 부르며,
	 * 		한 테이블을 다른 테이블과 연결해주는 역할을 합니다.
	 * 		외래 키가 설정된 테이블에 레코드를 입력하면, 기준이 되는 테이블의 내용을
	 * 		참조해서 레코드가 입력됩니다.
	 * 		즉, FOREIGN KEY 제약 조건은 하나의 테이블을 다른 테이블에 의존하게 만듭니다.
	 * 		FOREIGN KEY 제약 조건을 설정할 때 참조되는 테이블의 필드는 반드시
	 * 		UNIQUE나 PRIMARY KEY 제약 조건이 설정되어 있어야 합니다.
	 * 			-> [테이블 생성]
	 * 			CREATE TABLE TEST4(
	 * 						CODE		INT PRIMARY KEY,
	 * 						ITEM		VARCHAR(30),
	 * 						RDATE		DATE
	 * 					);
	 * 			CREATE TABLE TEST5(
	 * 						NUM			INT PRIMARY KEY auto_increment,
	 *						CODE		INT,
	 *						FOREIGN KEY (CODE)  -> TEST4의 CODE 열과 데이터가 연결                             
	 *						REFERENCES TEST4(CODE) ON UPDATE CASCADE ON DELETE CASCADE
	 *					); 
	 */
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root", "java");
			stmt = conn.createStatement();
//			int result = stmt.executeUpdate(insert());
//			System.out.println(result > -1 ? "성공": "실패");
//			String sql = update();
//			stmt.executeUpdate(sql);
			stmt.executeUpdate(delete());
			String sql = select(2);
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			while(rs.next()) {
				for(int i=1; i<=cnt; i++)
					System.out.print(rs.getString(i)+"    ");
				System.out.println();
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
	/**
	 * DATA INSERT
	 * @return sql
	 */
	public static String insert() {
		//실행1)
		//String sql = "INSERT INTO TEST4(CODE, ITEM, RDATE) VALUES(1,'아이템1',NOW())";
		//실행2)
		//String sql = "INSERT INTO TEST4(CODE, ITEM, RDATE) VALUES(2,'아이템2',NOW())";
		//실행3)
		//String sql = "INSERT INTO TEST5(CODE) VALUES(1)";
		//실행4)
		String sql = "INSERT INTO TEST5(CODE) VALUES(2)";
		return sql;
	}
	
	/**
	 * DATA SELECT
	 * @return sql
	 */
	public static String select(int number) {
		//실행1)
		String sql = "";
		if(number ==1)
			sql= "SELECT * FROM TEST4";
		//실행2)
		else 
			sql = "SELECT * FROM TEST5";
		
		return sql;
	}
	/**
	 * DATA UPDATE
	 * @return sql Query
	 */
	public static String update() {
		System.out.print("수정할 코드를 선택해주세요.> ");
		String code = new Scanner(System.in).next();
		System.out.print("수정할 코드 값을 입력해주세요.> ");
		String modifyCode = new Scanner(System.in).next();
		//test4의 코드 값을 수정하면(테이블 상에 저장된 필드값) foreign key로 연결된 test5에서도 자동 수정되어짐.
		String sql = "UPDATE TEST4 SET CODE="+modifyCode+ " WHERE CODE="+ code;
		return sql;
	}
	/**
	 * DATA DELETE
	 * @return sql
	 */
	public static String delete() {
		String sql = "DELETE FROM TEST4 WHERE CODE=2";
		return sql;
	}
}
