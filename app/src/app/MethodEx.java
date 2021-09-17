package app;
/*
 * 	Method
 * 
 * ����)
 * - [���� ������][������][��ȯ��] Method name (parameter){
 * 		statement;
 * }
 * 
 * 		-access modifiers: private, default(friendly), protected, public
 * 		-modifiers: static, final, abstract, native ...
 * 		-return types: ��ȯ���� ����(void), ��ȯ ���� ����(�⺻��(integer, real number....), ������(class,array,enum....))
 * 		-method name: �ĺ��ڷ� ������ �̸� ����
 * 		-parameters(arguments): �Ű� ������� �ϸ� �޼ҵ� ȣ��� �����͸� ���� �ϱ� ���� �뵵�� �����.
 * 
 * 		ex) ����� ���� �޼ҵ�
 * 		public int method1(){
 *      	����;
 *      	return value(int);
 *      }
 */		
public class MethodEx {
	static int method() {
		return 10;
	}
	
	static void method2() {
		System.out.println("���౸��");
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
