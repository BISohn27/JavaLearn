package app;

/*
 * 		접근 제어자(Access modifiers)
 * 		-객체의 사용을 제어하기 위한 제어자
 * 		
 * 		종류)
 * 		-private, default(friendly), protected, public
 * 		형식)
 * 		-클래스 표현
 * 			[접근제어자] class 클래스명
 * 		
 */

public class EncapEx {

	public static void main(String[] args) {
		Encap encap = new Encap();
		System.out.println(encap.a);
		System.out.println(encap.b);
		System.out.println(encap.c);
		System.out.println(encap.getD());
	}

}

class Encap {
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;

	public void setD(int d) {
		this.d = d;
	}

	public int getD() {
		return this.d;
	}
}
