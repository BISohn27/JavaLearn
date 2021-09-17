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
		//객체 저장
		vc.add("홍길동");
		vc.add("김자바");
		vc.add("손자바");
		vc.add("이자바");
		//반복문으로 객체를 추출하여 배열에 저장
		String str[] = new String[vc.size()];
		for(int i = 0; i< vc.size(); i++)
			str[i] = (String)vc.get(i);
		//반복문으로 출력
		for(String s : str)
			System.out.println(s);
		//이름을 입력받아 해당 문자열을 백터에서 삭제
		System.out.print("이름을 입력하세요 : ");
		String name = new Scanner(System.in).next();
		int index = vc.indexOf(name);
		if(vc.contains(name)) {
			System.out.println("해당 이름이 리스트에 있습니다.");
			System.out.println(name + " " + vc.get(index));
			if(vc.remove(name)) {
				System.out.println("삭제 완료!");
			}else {
			System.out.println("해당 이름이 리스트에 없습니다.");
			}
			//for문으로 출력
			System.out.println();
			for(int i = 0; i< vc.size(); i++)
				System.out.println(i + " : " + vc.get(i));
			//iterator로 출력
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
