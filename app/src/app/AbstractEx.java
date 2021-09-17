package app;

/*
 * 	추상(abstract)
 * 	- 객체의 모호함을 class로 표현하기 위함
 * 
 * 	특징
 * 	- class에 사용시 추상 class의 의미(ex: abstract class)
 * 	- 일반 메소드와 추상 메소드 사용 가능함 (interface는 일반 메소드는 구현 불가. 추상 메소드로만 이뤄진 것)
 * 	- 객체를 생성 할 수 없음
 * 	- 상속관계에서 재정의 함
 * 	- 내부 익명 클래스(무명 anonymous class)로 객체 생성 할 수는 있음
 *  - 추상 메소드는 구현하지 않는다
 *  - 추상 메소드는 재정의(override)하여 사용함
 *  - 상속 시 extends keyword를 사용
 * 	- abstract와 interface는 설계 단계에서 기능을 설계하기 위하여 정의 -> 구체적인 기능은 상속된 클래스에서 override를 통해 구현
 * 
 * 	표현)
 * 		abstract class A{
 * 		int a;
 * 		ex) abstract void setA();          <- 추상 메소드
 * 			void setB(){}				   <- 일반 메소드
 * 
 * 	사용)
 * 		class B extends A{
 * 			super class의 추상 메소드 재정의
 * 			@Override
 * 			void setA(){
 * 				a = 10;
 * 			}
 * 		}
 */
public class AbstractEx extends Abs{
	@Override
	public void methodB() {
		System.out.println("추상 메소드 구체화");
	}

	public static void main(String[] args) {
		AbstractEx obj = new AbstractEx();
		obj.methodA();
		obj.methodB();
		
		//내부 익명 클래스
		//abstract 클래스를 익명 클래스로 정의하고 내부에 abstract method를 정의하여 임시적으로 사용
//		new Abs() {
//			public void methodB() {
//				System.out.println("추상 메소드 구체화");
//			}
//		}.methodB();
		
		Object obj2= new Abs() {
			public void methodB() {
				System.out.println("추상 메소드 구체화");
			}
		};
		
		((Abs)obj2).methodB();
		
		
	}
}
abstract class Abs{
	int a = 10;
	
	public void methodA() {
		System.out.println("일반적인 메소드 실행");
	}
	public abstract void methodB();
	
}