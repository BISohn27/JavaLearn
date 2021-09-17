package collection;

import java.util.HashSet;

public class HashSet2Ex {

	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<> ();
		//Object equals 메소드와 똑같이 객체의 내용이 아니라 객체 자체가 동일한지 비교하기 때문에 중복 방지 안됨.
		//HashSet을 상속하여 override할 필요가 있다.
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		System.out.println("총 객체수: " + set.size());
		System.out.println(new Member("홍길동", 30).equals(new Member("홍길동", 30)));
		System.out.println(new Member("홍길동", 30).hashCode() + " " + new Member("홍길동", 30).hashCode());
	}
}
