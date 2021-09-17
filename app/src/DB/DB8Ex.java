package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

//public class DB8Ex {
//	/*
//	 * 	제약 조건(constraint)
//	 * 	제약 조건(constraint)이란 데이터의 무결성을 지키기 위해, 데이터를 입력받을 때 실행되는 검사 규칙을 의미
//	 * 	이러한 제약 조건은 create 문으로 테이블을 생성할 때나 alter 문으로 필드를 추가할 때도 설정할 수도 있다.
//	 * 	-mysql에서 사용할 수 있는 제약 조건은 다음과 같다.
//	 * 	1. not null
//	 * 	2. unique
//	 * 	3. primary key
//	 * 	4. foreign key
//	 * 	5. default
//	 * 
//	 * - not null: 테이블 칼럼 값을 null값(아무것도 입력 안한 것)을 줄 수 없게 하는 것.
//	 * 	
//	 */
//}
//
//	public static void main(String[] args) {
//		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url,"root","java");
//			stmt = conn.createStatement();
////			String sql = select();
//			rs = stmt.executeQuery(sql);
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int columns = rsmd.getColumnCount();
//	}
//
//}
