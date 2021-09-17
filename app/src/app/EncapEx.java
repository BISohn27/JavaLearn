package app;

/*
 * 		���� ������(Access modifiers)
 * 		-��ü�� ����� �����ϱ� ���� ������
 * 		
 * 		����)
 * 		-private, default(friendly), protected, public
 * 		����)
 * 		-Ŭ���� ǥ��
 * 			[����������] class Ŭ������
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
