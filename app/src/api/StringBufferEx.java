package api;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("�ڹ� ");
		sb.append("ȫ�浿 �����͸� ������ �ִ�.");
		String result = sb.toString();
		
		
		String s = "�ڹ� ";
		s = s.concat("ȫ�浿 �����͸�");
		s = s.concat(" ������ �ִ�.");
		
		System.out.println(s + " "+ sb);
	}

}
