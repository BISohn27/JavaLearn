package DB;

import java.io.FileReader;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PropertiesSQL {

	ArrayList<String> list = new ArrayList<>();
	ArrayList<User> listOfDB = new ArrayList<>();
	
	public static void main(String[] args) throws Exception{
		//properties로 부터 driver, url, column을 가져옴
		PropertiesSQL p = new PropertiesSQL();
		Properties properties = new Properties();
		String path = PropertiesSQL.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		StringTokenizer st = new StringTokenizer(properties.getProperty("column"),",");
		while(st.hasMoreTokens()) {
			p.list.add(st.nextToken());
		}
		
		Connection conn = null;
		Statement stmt = null;
		try {
			//드라이버 연결
			Class.forName(driver);
			System.out.println("드라이버 연결 성공");
			//mysql 서버와 연결
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("MySQL 계정 연결 성공");
			//명령문 전달할 인스턴스 생성
			stmt = conn.createStatement();
			//스키마 안에 테이블 객체 형성
			//만약 만들어져 있으면 예외 처리로 빠져 나옴
			try {
			stmt.executeUpdate("create table DBTEST2(ID varchar(10), PW varchar(15), NAME varchar(10))");
			}catch(Exception e) {
				System.out.println("테이블이 이미 만들어져 있습니다.\n");
			}
			//아이디 비밀번호 이름을 명령문으로 만들어 주는 메소드 실행
			String result = stmt.executeUpdate(p.insert()) > -1 ? "성공" : "실패";
			System.out.println(result);
			//mysql로부터 저장된 row를 가져옴
			ResultSet rs = stmt.executeQuery("SELECT * FROM DBTEST2 where 1");
			String id = "";
			String pw = "";
			String name = "";
			
			while(rs.next()) {
				id = rs.getString(p.list.get(0));
				pw = rs.getString(p.list.get(1));
				name = rs.getString(p.list.get(2));
				p.listOfDB.add(new User(id,pw,name));
			}
			
			for(User u : p.listOfDB) {
				System.out.println(u.id + " " + u.pw + " " + u.name);
			}
			
		}catch(Exception e) {
			System.out.print("데이터 연결 실패");
		}finally{
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}
	}

	public String insert() {
		System.out.print("DBTEST2 테이블에 입력할 ID : ");
		String id = new Scanner(System.in).next();
		System.out.print("DBTEST2 테이블에 입력할 PW : ");
		String pw = new Scanner(System.in).next();
		System.out.print("DBTEST2 테이블에 입력할 Name : ");
		String name = new Scanner(System.in).next();
		String sql = "insert into DBTEST2(ID,PW,NAME) values('" + id + "','" + pw + "','" + name + "')";
		return sql;
	}
}

class User{
	String id;
	String pw;
	String name;
	
	public User(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}
