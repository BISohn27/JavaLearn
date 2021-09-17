package app;

/*
 * 	�߻�(abstract)
 * 	- ��ü�� ��ȣ���� class�� ǥ���ϱ� ����
 * 
 * 	Ư¡
 * 	- class�� ���� �߻� class�� �ǹ�(ex: abstract class)
 * 	- �Ϲ� �޼ҵ�� �߻� �޼ҵ� ��� ������ (interface�� �Ϲ� �޼ҵ�� ���� �Ұ�. �߻� �޼ҵ�θ� �̷��� ��)
 * 	- ��ü�� ���� �� �� ����
 * 	- ��Ӱ��迡�� ������ ��
 * 	- ���� �͸� Ŭ����(���� anonymous class)�� ��ü ���� �� ���� ����
 *  - �߻� �޼ҵ�� �������� �ʴ´�
 *  - �߻� �޼ҵ�� ������(override)�Ͽ� �����
 *  - ��� �� extends keyword�� ���
 * 	- abstract�� interface�� ���� �ܰ迡�� ����� �����ϱ� ���Ͽ� ���� -> ��ü���� ����� ��ӵ� Ŭ�������� override�� ���� ����
 * 
 * 	ǥ��)
 * 		abstract class A{
 * 		int a;
 * 		ex) abstract void setA();          <- �߻� �޼ҵ�
 * 			void setB(){}				   <- �Ϲ� �޼ҵ�
 * 
 * 	���)
 * 		class B extends A{
 * 			super class�� �߻� �޼ҵ� ������
 * 			@Override
 * 			void setA(){
 * 				a = 10;
 * 			}
 * 		}
 */
public class AbstractEx extends Abs{
	@Override
	public void methodB() {
		System.out.println("�߻� �޼ҵ� ��üȭ");
	}

	public static void main(String[] args) {
		AbstractEx obj = new AbstractEx();
		obj.methodA();
		obj.methodB();
		
		//���� �͸� Ŭ����
		//abstract Ŭ������ �͸� Ŭ������ �����ϰ� ���ο� abstract method�� �����Ͽ� �ӽ������� ���
//		new Abs() {
//			public void methodB() {
//				System.out.println("�߻� �޼ҵ� ��üȭ");
//			}
//		}.methodB();
		
		Object obj2= new Abs() {
			public void methodB() {
				System.out.println("�߻� �޼ҵ� ��üȭ");
			}
		};
		
		((Abs)obj2).methodB();
		
		
	}
}
abstract class Abs{
	int a = 10;
	
	public void methodA() {
		System.out.println("�Ϲ����� �޼ҵ� ����");
	}
	public abstract void methodB();
	
}