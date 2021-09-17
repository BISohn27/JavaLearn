package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JoinEx {
	/*
	 * Join
	 * 	Join�� �����ͺ��̽� ���� ���� ���̺��� ������ ���ڵ带 �����Ͽ�
	 * 	�ϳ��� ���̺��̳� ��� �������� ǥ�����ݴϴ�.
	 * 	�̷��� JOIN�� ���� SELECT ���� �Բ� ���� ���˴ϴ�
	 * 	ǥ�� SQL������ ���ڵ带 �����ϴ� ��Ŀ� ���� JOIN�� ������ ���� �����մϴ�.
	 * 	1. CROSS JOIN
	 * 	2. EQUI JOIN
	 * 	3. LEFT JOIN
	 * 	4. RIGHT JOIN
	 * 
	 * 	1. CROSS JOIN�� Cartesian Product(ī��� ��)�̶�� �ϸ� ���εǴ� �� ���̺��� �������� ��ȯ�Ѵ�.
	 * 		ũ�ν� ������ ���� �����ϰ� ������ �⺻
	 * 		��� ���� �� �������� ������ ����ȭ�� ������ ���̽������� ����ϱ� �����.
	 * 		ù��° ���� ��� x �ι�° ���� ��� ��ŭ �����Ͱ� �����
	 * 		(�����, ������ ��� ����)
	 * 	
	 * 	2.EQUI JOIN(INNER EQUI JOIN)
	 * 		where ���� ���ǿ����� '='�� ����Ͽ� �ߺ���(������) ���� ����� ������.
	 * 
	 * 	3.LEFT OUTER JOIN(LEFT JOIN)
	 * 		LEFT��� ���� FROM ������ ������ ���� �Ǵ� ù ��° ���̺��� ����
	 * 		���� ���̺��� �� + �׺񸣰� ���� ���̺��� �ߺ��� ���� �����ݴϴ�
	 * 		���� ���̺��� �������� JOIN, ������� A���̺��� ��� �����Ϳ�
	 * 		A���̺�� B���̺��� �ߺ��Ǵ� ���� �˻�
	 * 
	 * [�ǽ� ���̺�1 �����]: JNTEST1
	 * 	CREATE TABLE JNTEST1(
	 * 		ID INT PRIMARY KEY AUTO_INCREMENT,
	 * 		PHONE VARCHAR(15)
	 * 		NAME VARCHAR(10)
	 * 	
	 * 	[�ǽ� ���̺�2 �����]: JNTEST2
	 * 	 CREATE TABLE JNTEST2(
	 * 		ID INT,
	 * 		MDATE DATE,
	 * 		NAME VARCHAR(10)
	 */
	
	public static void main(String[] args) {
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(select());
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			while(rs.next()) {
				for(int i = 1; i<=cnt; i++)
					System.out.print(rs.getString(i) + "\t");
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
			}
		}
	}
	
	public static String select() {
		//ex1)
		//String sql = "SELECT * FROM JNTEST1 CROSS JOIN JNTEST2"
		//String sql = "SELECT * FROM JNTEST1, JNTEST2"
		//ex2)
		//String sql = "SELECT * FROM JNTEST1 T1, JNTEST2 T2 WHERE T1.ID = T2.ID";
		//String sql = "SELECT * FROM JNTEST1 T1 INNER JOIN JNTEST2 T2 ON T1.ID = T2.ID";
		String sql = "SELECT * FROM JNTEST1 T1 RIGHT OUTER JOIN JNTEST2 T2 ON T1.ID = T2.ID";

		return sql;
	}

}
