package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class GroupByEx {
	/*
	 * �׷�ȭ�Ͽ� ������ ��ȸ (GROUP BY) : ��ǥ���� �׷� �Լ� COUNT(), AVG(), MIN(), MAX(), SUM() �Լ�
	 * ���, HAVING ��(������)�� �����.(GROUP BY �ȿ����� WHERE ��� X)
	 * 
	 * [���� ���̺� �����] : GBTEST CREATE TABLE GBTEST( IDX INT, TYPE INT, ->�׷�ȭ �ϱ� ���� �з�
	 * ���� NAME VARCHAR(10));
	 * 
	 * ����(type)���� ������ �������� ������, �ܼ��� count �Լ��� �����͸� ��ȸ�ϸ� ��ü �������� �����ɴϴ�. Count �Լ���
	 * �����͸� ��ȸ�ϸ� ��ü �������� �����ɴϴ�. 
	 * ex1) �÷� �׷�ȭ: type �׷�ȭ�Ͽ� name ���� ��ȸ(�÷� �׷�ȭ)
	 */
	public static void main(String[] args) {
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(select());
			rs=pstmt.executeQuery();
			ResultSetMetaData rsmt = rs.getMetaData();
			int cnt = rsmt.getColumnCount();
			
			for(int i = 1; i<=cnt; i++) 
				System.out.print(rsmt.getColumnName(i) + "\t");
			System.out.println();
			System.out.println("-----------------------------");
			
			while(rs.next()) {
				for(int i= 1; i<=cnt; i++)
					System.out.print(rs.getString(i) + "\t");
				System.out.println();
			}
//			String name[] = { "ȫ�浿", "�̼���", "������", "������", "ĥ����", "������", "������" };
//			for (int i = 1; i <= 7; i++) {
//				if (i <= 2) {
//					pstmt = conn
//							.prepareStatement("INSERT INTO GBTEST VALUES(" + i + "," + 1 + ",'" + name[i - 1] + "')");
//					pstmt.executeUpdate();
//				} else if (i <= 4) {
//					pstmt = conn
//							.prepareStatement("INSERT INTO GBTEST VALUES(" + i + "," + 2 + ",'" + name[i - 1] + "')");
//					pstmt.executeUpdate();
//				} else if(i<=6){
//					pstmt = conn
//							.prepareStatement("INSERT INTO GBTEST VALUES(" + i + "," + 3 + ",'" + name[i - 1] + "')");
//					pstmt.executeUpdate();
//					}else {
//						pstmt = conn
//								.prepareStatement("INSERT INTO GBTEST VALUES(" + i + "," + 4 + ",'" + name[i - 1] + "')");
//						pstmt.executeUpdate();
//					}
//						
//			}
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

	public static String select() {
//		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST GROUP BY TYPE";
		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST WHERE TYPE > 1 GROUP BY TYPE";
//		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST WHERE TYPE > 1 GROUP BY TYPE HAVING CNT>=2";
//		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST "
//				+ "WHERE TYPE >1 GROUP BY TYPE HAVING CNT>=2 ORDER BY TYPE DESC";
		return sql;
	}

}
