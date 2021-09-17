package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class LikeSearchEx {
	/*
	 * LIKE 검색: 문자열 부분 일치 검색(LIKE) Equal 연산자 (=)의 경우 비교 대상 값과 정확히 일치하는 값을 대상으로 검색
	 * 반면에, 문자값이 부분적으로만 일치해도 데이터 검색을 하고자 하는 경우에 like 명령어를 사용합니다. 문자열 칼럼 내에 검색 문자값이
	 * 부분이라도 일치하는 데이터를 조회대상으로 잡을 때 사용합니다 부분 일치 검색을 위해서 특정 문자값 이외의 위치에는
	 * **('_','%')**를 사용합니다. -와일드 카드 종류 ('_','%') 의미) 1. % : 0개 이상의 자리수를 갖는 문자열. 2.
	 * _ : 1자리수 문자.
	 * 
	 * [형식] 				 [설명] 
	 * 칼럼명 LIKE '%CD%'		 칼럼값 중 CD가 포함된 문자열이 모두 대상 
	 * 칼럼명 LIKE 'CD%'		 칼럼값 중 CD로 시작하는 문자열이 대상 
	 * 칼럼명 LIKE 'C%D'		 칼럼값 중 C로 시작하고 중간 값들은 무엇이든 상관없이(자리수 상관없이) 끝자리 값이 D인 문자열이 대상
	 * 
	 * 칼럼명 LIKE '_CD_' 	 칼럼값 자리수가 4자리이고 1번째, 4번째 자리값은 무엇이든 상관없고 2~3번째에 CD가 들어간 문자열 
	 * 칼럼명 LIKE 'CD_' 		 칼럼값이 3자리이고, CD로 시작하고 3번째 값은 무엇이든 상관없는 문자열이 대상 
	 * 칼럼명 LIKE 'C_D' 		 칼럼값이 3자리이고, 1번째 값이 C, 3번째 값이 D이고 가운데 값은 무엇이든 상관 없는 문자열 대상
	 * 
	 * [실습테이블 만들기] : LSTEST CREATE TABLE LSTEST( PHONE VARCHAR(15), NAME
	 * VARCHAR(10));
	 */
	public static void main(String[] args) {
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
//			pstmt = conn.prepareStatement("CREATE TABLE LSTEST(PHONE VARCHAR(15), NAME VARCHAR(10))");
//			pstmt.executeUpdate();
//			String name[] = { "홍길동", "이순신", "만득이", "개똥이", "칠득이", "갑돌이", "갑순이" };
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
//		String sql = "SELECT * FROM LSTEST WHERE NAME LIKE '_순_'";
		String sql = "SELECT * FROM LSTEST WHERE NAME LIKE '갑_이'";
		return sql;
	}
}
