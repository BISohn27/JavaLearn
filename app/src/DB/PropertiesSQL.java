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
		//properties�� ���� driver, url, column�� ������
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
			//����̹� ����
			Class.forName(driver);
			System.out.println("����̹� ���� ����");
			//mysql ������ ����
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("MySQL ���� ���� ����");
			//��ɹ� ������ �ν��Ͻ� ����
			stmt = conn.createStatement();
			//��Ű�� �ȿ� ���̺� ��ü ����
			//���� ������� ������ ���� ó���� ���� ����
			try {
			stmt.executeUpdate("create table DBTEST2(ID varchar(10), PW varchar(15), NAME varchar(10))");
			}catch(Exception e) {
				System.out.println("���̺��� �̹� ������� �ֽ��ϴ�.\n");
			}
			//���̵� ��й�ȣ �̸��� ��ɹ����� ����� �ִ� �޼ҵ� ����
			String result = stmt.executeUpdate(p.insert()) > -1 ? "����" : "����";
			System.out.println(result);
			//mysql�κ��� ����� row�� ������
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
			System.out.print("������ ���� ����");
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
		System.out.print("DBTEST2 ���̺� �Է��� ID : ");
		String id = new Scanner(System.in).next();
		System.out.print("DBTEST2 ���̺� �Է��� PW : ");
		String pw = new Scanner(System.in).next();
		System.out.print("DBTEST2 ���̺� �Է��� Name : ");
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
