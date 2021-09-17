package app;

/*
 * 	인터페이스 (interface)
 * 		- 객체를 생성 할 수 없음
 * 		- class에서 상속시 implements(설계를 실제로 구현한다 의미) keyword를 사용
 * 		- interface에는 상수와 추상 메소드만이 존재함
 * 		- interface 간의 상속시에는 extends를 사용함
 * 		- 일반적인 메소드를 갖을 수 없음
 * 		- 상속 시 interface에 있는 모든 메소드를 재정의하여 사용해야 함
 * 		- interface에 정의된 메소드 중 하나라도 재정의하지 않는다면 abstract class로 정의 할 수 있음
 * 		- class가 아닌 interface로 따로 분류
 *      - class를 상속할 때와는 달리 interface는 여러개를 상속할 수 있다.(다중 상속 가능) implements A, B, C ....
 * 
 * 		표현)
 * 		interface A{
 * 			변수 : [final][static] -> 생략되어 있음
 * 			ex) int A = 10;
 * 
 * 			메소드 : [public][abstract] -> 생략되어 있음
 * 			ex) void method();
 * 		}
 * 		사용1)
 * 		class C implements A{
 * 			인터페이스에 존재하는 메소드 재정의...
 * 		} 
 * 		사용2)
 * 		abstract class B implements A{
 * 			추상 메소드 정의...
 * 			일반적인 메소드 정의...
 * 		}
 * 		사용3)
 * 		class D extends C implements A{}
 * 		class D extends C implemnets A,B,C ...{}
 * 
 * 		사용4)
 * 		interface A extends B {}
 */
public class InterfaceEx extends AbstractC implements InterfaceA,InterfaceB{
	@Override
	public void methodA() {
		System.out.println("methodA");
	}
	@Override
	public String methodB() {
		return "methodB";
	}
	public static void main(String[] args) {
		InterfaceEx obj = new InterfaceEx();
		obj.methodA();
		System.out.println(obj.methodB());
		obj.methodC();
	}
}

interface InterfaceB{
	int b = 20;
	String methodB();
}
interface InterfaceA{
	int a = 10;
	void methodA();
}
abstract class AbstractC{
	void methodC() {
		System.out.println("methodC");
	}
}
