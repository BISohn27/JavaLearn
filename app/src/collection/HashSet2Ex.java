package collection;

import java.util.HashSet;

public class HashSet2Ex {

	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<> ();
		//Object equals �޼ҵ�� �Ȱ��� ��ü�� ������ �ƴ϶� ��ü ��ü�� �������� ���ϱ� ������ �ߺ� ���� �ȵ�.
		//HashSet�� ����Ͽ� override�� �ʿ䰡 �ִ�.
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		System.out.println("�� ��ü��: " + set.size());
		System.out.println(new Member("ȫ�浿", 30).equals(new Member("ȫ�浿", 30)));
		System.out.println(new Member("ȫ�浿", 30).hashCode() + " " + new Member("ȫ�浿", 30).hashCode());
	}
}
