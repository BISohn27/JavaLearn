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
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵�: ");
			String id = scan.next();
			System.out.println("��й�ȣ: ");
			String pw = scan.next();
			System.out.println();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� ����");
					break;
				}		
			}
			System.out.println("���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			System.out.println();
		}
	}

}
