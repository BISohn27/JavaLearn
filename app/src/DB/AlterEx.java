package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterEx {
	/*
	 * 	ALTER ��
	 * 		-TABLE ����
	 * 	[���̺� ����] : ATTEST(
	 * 				ID VARCHAR(10) NOT NULL,
	 * 				PW VARCHAR(10)
	 * 				 );
	 * 
	 */
	public static void main(String[] args) {
		Connection conn = new DBAction().getInstance().getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(alter());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {}
		}
	}
	public static String alter() {
		String sql = "ALTER TABLE ATTEST ADD COLUMN AGE INT";
		return sql;
	}
	
	//�÷� �߰�
	//ALTER TABLE ���̺�� ADD COLUMN Į���� Į��Ÿ��
	
	//Į�� �Ӽ� ����
	//ALTER TABLE ���̺�� MODIFY COLUMN (�̹� �����ϴ�)Į���� Į��Ÿ��
	
	//Į�� �� ����
	//ALTER TABLE ���̺�� CHANGE COLUMN PW PASSWORD VARCHAR(30) NOT NULL 
	
	//Į�� ����
	//ALTER TABLE ���̺�� DROP COLUMN �÷���
}
