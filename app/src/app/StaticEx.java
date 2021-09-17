package app;
/*
 * 	��Ÿ ������(������)
 * 	* final :
 * 		- class : ����� �ȵ�
 * 		- method : ������ �ȵ� (override�� �Ұ�)
 * 		- variable : ���ȭ
 * 
 * 	* static :
 * 		-��ü ���� ���� ��밡��(���� �޸𸮿� ����, data segment or bss segment)
 * 	
 * 	* abstract :
 * 		- class : �߻� Ŭ����
 * 		- method : �߻� �޼ҵ�
 * 
 * 		[������][���� ������]....
 */
public class StaticEx {
	public final int A = 10;
	public static int b = 20;
	public static void method() {
		System.out.println("method");
	}

	public static void main(String[] args) {
		//���� �Ҵ�� ��ü�� ���۷��� ������ �����ϱ� ������ ��� �Ŀ��� ��ü�� ��� �����ȴ�.
		StaticEx obj = new StaticEx();
		System.out.println(obj.A);
		System.out.println(StaticEx.b);
		
		//���� �Ҵ�� ��ü�� ���۷��� ������ ���� �����ǰ� ���� �ʱ� ������ �����ǰ� ���̴� �Ŀ� ������ �÷��Ϳ� ���� ������ �޸𸮰� �ݳ��ȴ�.
		System.out.println(new StaticEx().A);     
		method();
		//static ������ ������ �޼ҵ�� �ʵ�� Ŭ���� �̸����� ���� �� �� �ִ�.
		StaticEx.method();
	}

}
