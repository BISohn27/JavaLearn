package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

//public class DB8Ex {
//	/*
//	 * 	���� ����(constraint)
//	 * 	���� ����(constraint)�̶� �������� ���Ἲ�� ��Ű�� ����, �����͸� �Է¹��� �� ����Ǵ� �˻� ��Ģ�� �ǹ�
//	 * 	�̷��� ���� ������ create ������ ���̺��� ������ ���� alter ������ �ʵ带 �߰��� ���� ������ ���� �ִ�.
//	 * 	-mysql���� ����� �� �ִ� ���� ������ ������ ����.
//	 * 	1. not null
//	 * 	2. unique
//	 * 	3. primary key
//	 * 	4. foreign key
//	 * 	5. default
//	 * 
//	 * - not null: ���̺� Į�� ���� null��(�ƹ��͵� �Է� ���� ��)�� �� �� ���� �ϴ� ��.
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
