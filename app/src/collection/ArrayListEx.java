package collection;

import java.util.ArrayList;
/*
 * 	Collection
 * 	객체를 담을 수 있는 기억장소, 여러 가지 자료를
 * 	적절한 형태로 처리하고 저장하는 저장형태(묶음)의 자료구조
 * 	
 * 	-컬렉션에는 객체만 집어넣을 수 있다.
 * 	-컬렉션에는 객체만 집어넣을 수 있기 때문에 wrapper 클래스로 기본 타입을 객체화 시켜 집어넣는다.
 */
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Hello,");
		list.add(" World!");
		list.add(" I'm Java!");
		
		for(Object obj : list)
			System.out.print((String)obj);
		System.out.println();
		System.out.println();
		
		for(Object obj : list)
			System.out.print(obj.toString());
		System.out.println();
		System.out.println();
		
		for(int i = 0; i< list.size(); i++)
			System.out.println(i+ " : "+ list.get(i));
		
		System.out.println();
		System.out.println("총 객체수 : " + list.size());
		System.out.println();
		System.out.println("요소 출력 0 : "+ list.get(0));
		
		list.remove(0);
		Object skill1 = list.get(0);
		String skill2 = (String)list.get(0);
		System.out.println("0 : " + skill1);
		System.out.println("0 : " + skill2);
		
		System.out.println();
	}
}
