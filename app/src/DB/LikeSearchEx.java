package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class LikeSearchEx {
	/*
	 * LIKE �˻�: ���ڿ� �κ� ��ġ �˻�(LIKE) Equal ������ (=)�� ��� �� ��� ���� ��Ȯ�� ��ġ�ϴ� ���� ������� �˻�
	 * �ݸ鿡, ���ڰ��� �κ������θ� ��ġ�ص� ������ �˻��� �ϰ��� �ϴ� ��쿡 like ��ɾ ����մϴ�. ���ڿ� Į�� ���� �˻� ���ڰ���
	 * �κ��̶� ��ġ�ϴ� �����͸� ��ȸ������� ���� �� ����մϴ� �κ� ��ġ �˻��� ���ؼ� Ư�� ���ڰ� �̿��� ��ġ����
	 * **('_','%')**�� ����մϴ�. -���ϵ� ī�� ���� ('_','%') �ǹ�) 1. % : 0�� �̻��� �ڸ����� ���� ���ڿ�. 2.
	 * _ : 1�ڸ��� ����.
	 * 
	 * [����] 				 [����] 
	 * Į���� LIKE '%CD%'		 Į���� �� CD�� ���Ե� ���ڿ��� ��� ��� 
	 * Į���� LIKE 'CD%'		 Į���� �� CD�� �����ϴ� ���ڿ��� ��� 
	 * Į���� LIKE 'C%D'		 Į���� �� C�� �����ϰ� �߰� ������ �����̵� �������(�ڸ��� �������) ���ڸ� ���� D�� ���ڿ��� ���
	 * 
	 * Į���� LIKE '_CD_' 	 Į���� �ڸ����� 4�ڸ��̰� 1��°, 4��° �ڸ����� �����̵� ������� 2~3��°�� CD�� �� ���ڿ� 
	 * Į���� LIKE 'CD_' 		 Į������ 3�ڸ��̰�, CD�� �����ϰ� 3��° ���� �����̵� ������� ���ڿ��� ��� 
	 * Į���� LIKE 'C_D' 		 Į������ 3�ڸ��̰�, 1��° ���� C, 3��° ���� D�̰� ��� ���� �����̵� ��� ���� ���ڿ� ���
	 * 
	 * [�ǽ����̺� �����] : LSTEST CREATE TABLE LSTEST( PHONE VARCHAR(15), NAME
	 * VARCHAR(10));
	 */
	public static void main(String[] args) {
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
//			pstmt = conn.prepareStatement("CREATE TABLE LSTEST(PHONE VARCHAR(15), NAME VARCHAR(10))");
//			pstmt.executeUpdate();
//			String name[] = { "ȫ�浿", "�̼���", "������", "������", "ĥ����", "������", "������" };
//			for(int i =0; i<7; i++) {
//				if(i<6) {
//					pstmt = conn.prepareStatement("INSERT INTO LSTEST VALUES('010-1234-5678','"+name[i]+"')");
//					pstmt.executeUpdate();
//				}
//				else if(i<7) {
//					pstmt = conn.prepareStatement("INSERT INTO LSTEST VALUES('070-1234-5678','"+name[i]+"')");
//					pstmt.executeUpdate();
//				}
//			}
			pstmt = conn.prepareStatement(select());
			pstmt.executeUpdate();
//			rs = pstmt.executeQuery();
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int cnt = rsmd.getColumnCount();
//			while(rs.next()) {
//				for(int i=1; i<= cnt; i++)
//					System.out.print(rs.getString(i)+"   ");
//				System.out.println();
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
			}
		}

	}
	
	
	public static String select() {
//		String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE '010%'";
//		String sql = "SELECT * FROM LSTEST WHERE PHONE LIKE '%070%'";
//		String sql = "SELECT * FROM LSTEST WHERE NAME LIKE '_��_'";
		String sql = "SELECT * FROM LSTEST WHERE NAME LIKE '��_��'";
		return sql;
	}
}
