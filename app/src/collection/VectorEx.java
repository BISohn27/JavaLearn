package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector vc = new Vector();
		//��ü ����
		vc.add("ȫ�浿");
		vc.add("���ڹ�");
		vc.add("���ڹ�");
		vc.add("���ڹ�");
		//�ݺ������� ��ü�� �����Ͽ� �迭�� ����
		String str[] = new String[vc.size()];
		for(int i = 0; i< vc.size(); i++)
			str[i] = (String)vc.get(i);
		//�ݺ������� ���
		for(String s : str)
			System.out.println(s);
		//�̸��� �Է¹޾� �ش� ���ڿ��� ���Ϳ��� ����
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = new Scanner(System.in).next();
		int index = vc.indexOf(name);
		if(vc.contains(name)) {
			System.out.println("�ش� �̸��� ����Ʈ�� �ֽ��ϴ�.");
			System.out.println(name + " " + vc.get(index));
			if(vc.remove(name)) {
				System.out.println("���� �Ϸ�!");
			}else {
			System.out.println("�ش� �̸��� ����Ʈ�� �����ϴ�.");
			}
			//for������ ���
			System.out.println();
			for(int i = 0; i< vc.size(); i++)
				System.out.println(i + " : " + vc.get(i));
			//iterator�� ���
			System.out.println();
			Iterator it = vc.iterator();
			while(it.hasNext()) {
				String e = (String)it.next();
				System.out.println(e);
			}
			Enumeration e = vc.elements();
			while(e.hasMoreElements()) {
				String str1 = (String)e.nextElement();
			}
		}
	}

}
