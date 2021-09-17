package app;
/*
 * 	���(inheritance)
 * 	����̶� �ڽ��� �θ� ������ �ִ� ����̳� �Ƿ��� �����޴´ٴ� �ǹ�
 * 	-Ư��(�ڽ�) Ŭ������ �ٸ�(�θ�)Ŭ������ ������ �ִ� ��� ��������� ����޼ҵ带 ����� �� ����
 * 	-��� ���迡�� �ڽ�Ŭ������ ��ü�� ���� �Ͽ����� �θ� Ŭ������ ��ü�� �����Ǿ� ��
 * 	-��� ���� ǥ������ extends keyword�� �����
 * 	-��� ���� ���� super, ����, �θ� Ŭ���� // sub, ����, �ڽ� Ŭ������ �����
 * 	-����� ���信�� super�� this�� ������
 * 	-�޼ҵ带 ���� �� �� ����(method override)
 * 	-���� ���(�ڹٿ����� ���� ��� �Ұ�)
 * 	-extends �� implements�� �Բ� ����� �� ����
 * 
 * 	����)
 * 	class A extends B{
 * 		���屸��;
 * 	}
 */
public class InherEx extends SuperClass{
	int c = 20;
	
	public InherEx() {
		super();                                //�θ� Ŭ���� ������ ȣ�� �޼ҵ�
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
	@Override                                       //������ ������ �������̵� ��Ģ�� ��Ű�� �������̵�� ����. @override�� �ϸ� ������ Ÿ�ӿ� ���� üũ ����.
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
