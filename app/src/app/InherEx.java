package app;
/*
 * 	상속(inheritance)
 * 	상속이란 자식이 부모가 가지고 있는 재산이나 권력을 물려받는다는 의미
 * 	-특정(자식) 클래스는 다른(부모)클래스가 가지고 있는 모든 멤버변수나 멤버메소드를 사용할 수 있음
 * 	-상속 관계에서 자식클래스의 객체를 생성 하였을때 부모 클래스의 객체도 생성되어 짐
 * 	-상속 관계 표현으로 extends keyword를 사용함
 * 	-상속 관계 용어로 super, 상위, 부모 클래스 // sub, 하위, 자식 클래스로 사용함
 * 	-상속의 개념에서 super와 this를 구분함
 * 	-메소드를 재사용 할 수 있음(method override)
 * 	-단일 상속(자바에서는 다중 상속 불가)
 * 	-extends 와 implements를 함께 사용할 수 있음
 * 
 * 	형식)
 * 	class A extends B{
 * 		문장구현;
 * 	}
 */
public class InherEx extends SuperClass{
	int c = 20;
	
	public InherEx() {
		super();                                //부모 클래스 생성자 호출 메소드
		System.out.println("InherEx" + " "+ this.a+ " " + super.b);
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		InherEx inher = new InherEx();
		//SuperClass inher = new SuperClass();
		System.out.println(inher);
		//System.out.println(inher.c);
		System.out.println(inher.a);
		System.out.println(inher.b);
		inher.method();
	}
	@Override                                       //있으나 없으나 오버라이드 규칙만 지키면 오버라이드는 가능. @override를 하면 컴파일 타임에 에러 체크 가능.
	public void method() {
		System.out.println("derived");
	}
}

class SuperClass{
	int a = 10;
	String b = "b";
	
	public SuperClass() {
		System.out.println("SuperClass");
	}
	
	public void method() {
		System.out.println("base");
	}
}
