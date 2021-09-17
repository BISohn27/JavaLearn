package java_과제1_손병일;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		ArrayList<BookDTO> list = new ArrayList<>();
		
		list.add(new BookDTO(21424,"Java Basic","김하나","Jaen.kr",15000,"Java 기본 문법"));
		list.add(new BookDTO(33455,"JDBC Pro","김철수","Jaen.kr",23000,""));
		list.add(new BookDTO(55355,"Servlet/JSP","박자바","Jaen.kr",41000,"Model2 기반"));
		list.add(new BookDTO(35332,"Android App","홍길동","Jaen.kr",25000,"Lightweight Framework"));
		list.add(new BookDTO(35355,"OOAD 분석,설계","소나무","Jaen.kr",30000,""));
		
		System.out.println("**************************************도서목록**************************************");
		
		for(BookDTO b : list)
			System.out.println(b.toString());
	}

}
