package app;
/*
 * 	기타 제어자(수정자)
 * 	* final :
 * 		- class : 상속이 안됨
 * 		- method : 재사용이 안됨 (override가 불가)
 * 		- variable : 상수화
 * 
 * 	* static :
 * 		-객체 생성 없이 사용가능(정적 메모리에 생성, data segment or bss segment)
 * 	
 * 	* abstract :
 * 		- class : 추상 클래스
 * 		- method : 추상 메소드
 * 
 * 		[수정자][접근 지정자]....
 */
public class StaticEx {
	public final int A = 10;
	public static int b = 20;
	public static void method() {
		System.out.println("method");
	}

	public static void main(String[] args) {
		//동적 할당된 객체를 레퍼런스 변수로 유지하기 때문에 사용 후에도 객체는 계속 유지된다.
		StaticEx obj = new StaticEx();
		System.out.println(obj.A);
		System.out.println(StaticEx.b);
		
		//동적 할당된 객체가 레퍼런스 변수에 의해 유지되고 있지 않기 때문에 생성되고 쓰이는 후에 가비지 컬렉터에 의해 언젠가 메모리가 반납된다.
		System.out.println(new StaticEx().A);     
		method();
		//static 영역에 생성된 메소드와 필드는 클래스 이름으로 접근 할 수 있다.
		StaticEx.method();
	}

}
