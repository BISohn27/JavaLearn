package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JoinEx {
	/*
	 * Join
	 * 	Join은 데이터베이스 내의 여러 테이블에서 가져온 레코드를 조합하여
	 * 	하나의 테이블이나 결과 집합으로 표현해줍니다.
	 * 	이러한 JOIN은 보통 SELECT 문과 함께 자주 사용됩니다
	 * 	표준 SQL에서는 레코드를 조합하는 방식에 따라 JOIN을 다음과 같이 구분합니다.
	 * 	1. CROSS JOIN
	 * 	2. EQUI JOIN
	 * 	3. LEFT JOIN
	 * 	4. RIGHT JOIN
	 * 
	 * 	1. CROSS JOIN은 Cartesian Product(카디션 곱)이라고도 하며 조인되는 두 테이블에서 곱집합을 반환한다.
	 * 		크로스 조인은 가장 간단하고 조인의 기본
	 * 		모든 행을 다 가져오기 때문에 정규화된 데이터 베이스에서는 사용하기 힘들다.
	 * 		첫번째 행의 행수 x 두번째 행의 행수 만큼 데이터가 추출됨
	 * 		(명시적, 묵시적 방법 존재)
	 * 	
	 * 	2.EQUI JOIN(INNER EQUI JOIN)
	 * 		where 절에 조건연산자 '='를 사용하여 중복된(교집합) 값을 결과로 추출함.
	 * 
	 * 	3.LEFT OUTER JOIN(LEFT JOIN)
	 * 		LEFT라는 것을 FROM 절에서 지정된 왼쪽 또는 첫 번째 테이블을 참조
	 * 		기준 테이블의 값 + 테비르과 기준 테이블의 중복된 값을 보여줍니다
	 * 		왼쪽 테이블을 기준으로 JOIN, 결과값은 A테이블의 모든 데이터와
	 * 		A테이블과 B테이블의 중복되는 값이 검색
	 * 
	 * [실습 테이블1 만들기]: JNTEST1
	 * 	CREATE TABLE JNTEST1(
	 * 		ID INT PRIMARY KEY AUTO_INCREMENT,
	 * 		PHONE VARCHAR(15)
	 * 		NAME VARCHAR(10)
	 * 	
	 * 	[실습 테이블2 만들기]: JNTEST2
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
