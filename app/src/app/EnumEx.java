package app;

/*
 * 	클래스처럼 보이게 하는 상수
 * 	서로 관련 있는 상수들을 모아 심볼릭한 명칭의 집합으로 정의한 것
 * 	Enum 클래스형을 기반으로 한 클래스형 선언
 * 	새로운 열거형을 선언하면, 내부적으로 Enum 클래스형 기반의 새로운 클래스형이 만들어짐
 */
public class EnumEx {

	public static void main(String[] args) {
//		ex1)
//		String seoul = City.SEOUL;
//		System.out.println(seoul);
//		City c1 = City.valueOf("서울");
//		System.out.println(c1+"\n\n");
		for(City c : City.values())
			System.out.println(c);
	}
	
	public enum City{
		//상수의 열거
		서울,대구,부산,광주,대전
	}
}

//enum의 구현 과 비슷
class City{
	public final static String SEOUL = "서울";
	public static final String BUSAN = "부산";
	public static final String DAEGU = "대구";
	public final static String GWANGJU = "광주";
	public final static String DAEJEON = "대전";
}