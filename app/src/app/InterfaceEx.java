package app;

/*
 * 	�������̽� (interface)
 * 		- ��ü�� ���� �� �� ����
 * 		- class���� ��ӽ� implements(���踦 ������ �����Ѵ� �ǹ�) keyword�� ���
 * 		- interface���� ����� �߻� �޼ҵ常�� ������
 * 		- interface ���� ��ӽÿ��� extends�� �����
 * 		- �Ϲ����� �޼ҵ带 ���� �� ����
 * 		- ��� �� interface�� �ִ� ��� �޼ҵ带 �������Ͽ� ����ؾ� ��
 * 		- interface�� ���ǵ� �޼ҵ� �� �ϳ��� ���������� �ʴ´ٸ� abstract class�� ���� �� �� ����
 * 		- class�� �ƴ� interface�� ���� �з�
 *      - class�� ����� ���ʹ� �޸� interface�� �������� ����� �� �ִ�.(���� ��� ����) implements A, B, C ....
 * 
 * 		ǥ��)
 * 		interface A{
 * 			���� : [final][static] -> �����Ǿ� ����
 * 			ex) int A = 10;
 * 
 * 			�޼ҵ� : [public][abstract] -> �����Ǿ� ����
 * 			ex) void method();
 * 		}
 * 		���1)
 * 		class C implements A{
 * 			�������̽��� �����ϴ� �޼ҵ� ������...
 * 		} 
 * 		���2)
 * 		abstract class B implements A{
 * 			�߻� �޼ҵ� ����...
 * 			�Ϲ����� �޼ҵ� ����...
 * 		}
 * 		���3)
 * 		class D extends C implements A{}
 * 		class D extends C implemnets A,B,C ...{}
 * 
 * 		���4)
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
