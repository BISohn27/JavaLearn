package api;

public class StringCharAtEX {
	public static void main(String[] args) {
		String ssn = "740101-1912444";
		char gender = ssn.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}
		
	}
}
