package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ZipEx {

	public static void main(String[] args) {
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<StringBuilder> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(selectFromSido());
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			int count = 0;
			StringBuilder sb = null;
			while(rs.next()){
				list.add(new StringBuilder());
				sb = list.get(count);
				System.out.print((count+1) + "   ");
				for(int i = 1; i<= cnt-1; i++)
					sb.append(rs.getString(i) + "\t");
				System.out.println(sb.toString());
				count++;
			}
			System.out.println();
			do {
			System.out.print("원하시는 주소의 번호를 입력해 주세요.> ");
			count = new Scanner(System.in).nextInt();
			}while(count<1 && count >= list.size());
			
			System.out.println();
			System.out.println(list.get(count-1).toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!= null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {}
		}
	}
	
	public static String selectFromSido() {
		Scanner scan = new Scanner(System.in);
		System.out.print("시: ");
		String sido = scan.nextLine();
//		System.out.print("구군: ");
//		String gugun = scan.nextLine();
//		System.out.print("동: ");
//		String dong = scan.nextLine();
//		System.out.print("리: ");
//		String ri = scan.nextLine();
//		System.out.print("빌딩: ");
//		String bldg = scan.nextLine();
//		System.out.print("번지: ");
//		String bunji = scan.nextLine();
		
//		String sql = "SELECT * WHERE SIDO LIKE '%" +sido + "%' && GUGUN LIKE '%" +gugun+"%' && DONG LIKE '%" 
//					+dong+"%' && RI LIKE '%"+ri+"%' BLDG LIKE '%"+bldg+"%' && BUNJI LIKE '%" +bunji+ "'";  
		
		String sql = "SELECT * FROM ZIPCODE WHERE GUGUN LIKE '" + sido + "구' or GUGUN LIKE '"+sido +"'";
		return sql;
	}
}
