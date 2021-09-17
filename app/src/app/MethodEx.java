package app;
/*
 * 	Method
 * 
 * 형식)
 * - [접근 제어자][수정자][반환형] Method name (parameter){
 * 		statement;
 * }
 * 
 * 		-access modifiers: private, default(friendly), protected, public
 * 		-modifiers: static, final, abstract, native ...
 * 		-return types: 반환값이 없음(void), 반환 값이 있음(기본형(integer, real number....), 참조형(class,array,enum....))
 * 		-method name: 식별자로 임의의 이름 정의
 * 		-parameters(arguments): 매개 변수라고 하며 메소드 호출시 데이터를 전달 하기 위한 용도로 사용함.
 * 
 * 		ex) 사용자 정의 메소드
 * 		public int method1(){
 *      	구현;
 *      	return value(int);
 *      }
 */		
public class MethodEx {
	static int method() {
		return 10;
	}
	
	static void method2() {
		System.out.println("실행구문");
	}
	
	static void method3(int a, String s) {
		System.out.println("Method: " + a +" , " + s);
	}
	
	public static void main(String args[]) {
		int result = method();
		System.out.println(result);
		method2();
		method3(50,"a");
	}
}
