package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("spring", "1");
		map.put("summer", "2");
		map.put("fall", "3");
		map.put("winter", "4");
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디: ");
			String id = scan.next();
			System.out.println("비밀번호: ");
			String pw = scan.next();
			System.out.println();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}		
			}
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
			System.out.println();
		}
	}

}
