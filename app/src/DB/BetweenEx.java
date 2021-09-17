package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class BetweenEx {
/*
 *  BETWEEN (����): A AND B ���� A�� B�� ������(INCLUSIVE)
 *  				�� ������ ��� ���� �ش��ϴ��� ���θ� �������� �Ѵ�.
 *  	[�ǽ����̺� �����]: BWTEST
 *  	CREATE TABLE BWTEST(
 *  		INDX INT,
 *  		BIRTH DATE,
 *  	NAME VARCHAR(10));
 * 
 * 	LIMIT N: ���� ����(MYSQL ���� ROW COUNT �ý����� �������� 1���� N���� ����)
 * 	LIMIT N1 OFFSET N2: ROW ��ȣ N2���� ���� N1�� ���� 
 */
	public static void main(String[] args) {
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = select();
			pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			ResultSetMetaData rsmt = rs.getMetaData();
			int cnt = rsmt.getColumnCount();
			
			for(int i = 1; i<=cnt; i++) 
				System.out.print(rsmt.getColumnName(i) + "        ");
			System.out.println();
			System.out.println("-----------------------------");
			
			while(rs.next()) {
				for(int i= 1; i<=cnt; i++)
					System.out.print(rs.getString(i) + "\t");
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static String insert() {
//		String sql = "INSERT INTO BWTEST VALUES(1, '2020-01-01','ȫ�浿')";
//		String sql = "INSERT INTO BWTEST VALUES(2, '2020-01-02','�̼���')";
//		String sql = "INSERT INTO BWTEST VALUES(3, '2020-01-03','������')";
//		String sql = "INSERT INTO BWTEST VALUES(4, '2020-01-04','������')";
//		String sql = "INSERT INTO BWTEST VALUES(5, '2020-01-05','ĥ����')";
//		String sql = "INSERT INTO BWTEST VALUES(6, '2020-01-06','������')";
		String sql = "INSERT INTO BWTEST VALUES(7, '2020-01-07','������')";
		
		return sql;
	}
	
	public static String select() {
//		String sql = "SELECT * FROM BWTEST WHERE BIRTH BETWEEN '2020-01-02' AND '2020-01-05'";
		//String sql = "SELECT * FROM BWTEST WHERE INDX BETWEEN 2 AND 5;
//		String sql = "SELECT * FROM BWTEST LIMIT 2"; //1���� N���� ���� �������� �����͸� ����
		String sql = "SELECT * FROM BWTEST ORDER BY INDX ASC LIMIT 1 OFFSET 6";
		return sql;
	}
}
