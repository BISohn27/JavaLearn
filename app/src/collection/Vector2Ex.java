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
		sb.append("�� ");
		sb.append(cal.get(Calendar.MONTH)+1);
		sb.append("�� ");
		sb.append(cal.get(Calendar.DATE));
		sb.append("��");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� M�� d�� a HH:mm:ss");
		
//		list.add("A");
//		list.add("B");
//		list.add(new Scanner(System.in));
//		list.add((new Long(10)));
//		//�⺻ Ÿ���� int�� �ڵ����� wrapping�Ͽ� ��üȭ �� ����
//		list.add(10);
		
		list.add(new Board("����1", "����1", "�۾���1", sb.toString()));
		list.add(new Board("����2", "����2", "�۾���2",sdf.format(date)));
		list.add(new Board("����3", "����3", "�۾���3",sb.toString()));
		list.add(new Board("����4", "����4", "�۾���4",sb.toString()));
		list.add(new Board("����5", "����5", "�۾���5",sb.toString()));
		
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
