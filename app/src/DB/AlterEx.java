package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterEx {
	/*
	 * 	ALTER 문
	 * 		-TABLE 변경
	 * 	[테이블 생성] : ATTEST(
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
	
	//컬럼 추가
	//ALTER TABLE 테이블명 ADD COLUMN 칼럼명 칼럼타입
	
	//칼럼 속성 변경
	//ALTER TABLE 테이블명 MODIFY COLUMN (이미 존재하는)칼럼명 칼럼타입
	
	//칼럼 명 변경
	//ALTER TABLE 테이블명 CHANGE COLUMN PW PASSWORD VARCHAR(30) NOT NULL 
	
	//칼럼 삭제
	//ALTER TABLE 테이블명 DROP COLUMN 컬럼명
}
