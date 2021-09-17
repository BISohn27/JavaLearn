package db_����2_�պ���;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		ArrayList<BookDTO> list = new ArrayList<>();
		BookTest bt = new BookTest();

		list.add(new BookDTO(21424, "Java Basic", "���ϳ�", "Jaen.kr", 15000, "Java �⺻ ����"));
		list.add(new BookDTO(33455, "JDBC Pro", "��ö��", "Jaen.kr", 23000, ""));
		list.add(new BookDTO(55355, "Servlet/JSP", "���ڹ�", "Jaen.kr", 41000, "Model2 ���"));
		list.add(new BookDTO(35332, "Android App", "ȫ�浿", "Jaen.kr", 25000, "Lightweight Framework"));
		list.add(new BookDTO(35355, "OOAD �м�,����", "�ҳ���", "Jaen.kr", 30000, ""));

		for (BookDTO b : list)
			bt.insertStudent(b);

		System.out.println("**************************************�������**************************************");
		bt.printAllBooks();		
	}

	public void insertStudent(BookDTO book) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/exercise?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			stmt = conn.createStatement();
			// ���̺��� ���� ��� ���̺� ���� sql
			try {
				//MYSQL���� DESC�� DECENDING �������� Ű����� ��ϵǾ� �־ �׷��� ���̺� ���� �������� ��� ������ ���� �ӽ������� DESC1���� �ʵ带 �����߽��ϴ�.
				stmt.executeUpdate("create TABLE BOOKDB(ISBN INT(5),TITLE VARCHAR(50) ,AUTHOR VARCHAR(250), PUBLISHER VARCHAR(50), PRICE INT(6),DESC1 VARCHAR(200), PUBLISH_DATE VARCHAR(10))");
			}catch(Exception e) {}
			String str = "INSERT INTO BOOKDB(ISBN,TITLE,AUTHOR,PUBLISHER,PRICE,DESC1) VALUES('" + book.getIsbn() + "','"
					+ book.getTitle() + "','" + book.getAuthor() + "','" + book.getPublisher() + "'," + book.getPrice()
					+ ",'" + book.getDesc() + "')";
			stmt.executeUpdate(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public void printAllBooks() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/exercise?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM BOOKDB");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+ "\t| " + rs.getString(2) + "\t| " + rs.getString(3) + "\t| "
						+ rs.getString(4) + "\t| " + rs.getInt(5) + "\t| " + rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}
}
