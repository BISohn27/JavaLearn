package DB;
/*	< 학습 목표 >
 * 	-자바에서의 DB를 사용하기(JDBC)
 * 	-JDBC(Java Database Connectivity)는 자바에서 데이터베이스에 접속할 수 있도록 하는 자바 API이다.
 * 		(Java와 각 DB간의 연결 및 제어 관련 프로그래밍)
 * 	-JDBC는 데이터베이스에서 자료를 쿼리하거나 업데이트하는 방법을 제공한다.
 * 	-JDBC는 데이터베이스 질의문을 실행하여 관계형 데이터베이스
 * 		(relational database)의 데이터를 검색, 갱신하는 방법을 제공합니다.
 * 	-DB의 벤더는 java의 환경에 맞게 자신들 회사의 제품에 맞는 연결 방법을 지정된 타입으로 제공한다.
 * 	-인터페이스 기반 프로그래밍
 * 		직접 객체를 사용하는 방식이 아니라 인터페이스 기반 객체를 사용하는 방식으로 프로그래밍한다.
 * 
 *  - Query
 *  	데이터를 조회하는 데 사용되는 언어로 레코드가 가진 데이터 값들을 얻어오는(select) 구문이 이에 속한다..
 *  - DML(Data Manipulation Language)
 *  	데이터를 처리하는 부분으로 레코드에 새로운 행을 추가(insert), 변경(update)
 *  	삭제(delete)하는데 사용하는 언어이다.
 *  - DDL(Data Definition Language)
 *  	데이터를 정의하는데 사용되는 언어로 테이블이나 유저를 생성(create)하거나 삭제(drop)하는 구문들이다.
 *  - DCL(Data Control Language)
 *  	데이터를 제어하는 데 사용되는 언어로 DDL로 유저를 생성하고 난 뒤 권한 부여(grant)등이 여기에 속한다.
 *  - 기본적으로 SQL에 대한 사용 방법 숙지한다.
 *  	select, insert, update, delete
 */
public class DBEx {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			System.out.println("데이터베이스 드라이버 로딩 성공!");
		}catch(Exception e) {
			System.out.println("데이터베이스 드라이버 로딩 실패!");		
		}
	}
	
}
