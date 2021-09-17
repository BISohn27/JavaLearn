package collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;


public class Vector2Ex {
	public static void main(String[] args) {
		List<Board> list = new Vector<> ();
		Calendar cal = Calendar.getInstance();
		StringBuilder sb = new StringBuilder();
		sb.append(cal.get(Calendar.YEAR));
		sb.append("년 ");
		sb.append(cal.get(Calendar.MONTH)+1);
		sb.append("월 ");
		sb.append(cal.get(Calendar.DATE));
		sb.append("일");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 a HH:mm:ss");
		
//		list.add("A");
//		list.add("B");
//		list.add(new Scanner(System.in));
//		list.add((new Long(10)));
//		//기본 타입인 int를 자동으로 wrapping하여 객체화 후 저장
//		list.add(10);
		
		list.add(new Board("제목1", "내용1", "글쓴이1", sb.toString()));
		list.add(new Board("제목2", "내용2", "글쓴이2",sdf.format(date)));
		list.add(new Board("제목3", "내용3", "글쓴이3",sb.toString()));
		list.add(new Board("제목4", "내용4", "글쓴이4",sb.toString()));
		list.add(new Board("제목5", "내용5", "글쓴이5",sb.toString()));
		
//		list.remove(0);
//		list.remove(0);
		
		for(int i = 0; i< list.size(); i++)
			System.out.println(
					  list.get(i).getSubject() + "\t" 
					+ list.get(i).getContent() + "\t" 
					+ list.get(i).getWriter() +"\t" 
					+ list.get(i).getDate()
					);
	}
}
