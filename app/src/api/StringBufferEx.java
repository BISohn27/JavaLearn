package api;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("자바 ");
		sb.append("홍길동 포인터를 가지고 있다.");
		String result = sb.toString();
		
		
		String s = "자바 ";
		s = s.concat("홍길동 포인터를");
		s = s.concat(" 가지고 있다.");
		
		System.out.println(s + " "+ sb);
	}

}
