package collection;

import java.util.ArrayList;
/*
 * 	Collection
 * 	��ü�� ���� �� �ִ� ������, ���� ���� �ڷḦ
 * 	������ ���·� ó���ϰ� �����ϴ� ��������(����)�� �ڷᱸ��
 * 	
 * 	-�÷��ǿ��� ��ü�� ������� �� �ִ�.
 * 	-�÷��ǿ��� ��ü�� ������� �� �ֱ� ������ wrapper Ŭ������ �⺻ Ÿ���� ��üȭ ���� ����ִ´�.
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
		System.out.println("�� ��ü�� : " + list.size());
		System.out.println();
		System.out.println("��� ��� 0 : "+ list.get(0));
		
		list.remove(0);
		Object skill1 = list.get(0);
		String skill2 = (String)list.get(0);
		System.out.println("0 : " + skill1);
		System.out.println("0 : " + skill2);
		
		System.out.println();
	}
}
