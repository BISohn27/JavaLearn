package app;

/*
 * 	Exception
 * 	Ű���� �Է�, ���� ó��, ��Ʈ�� ó��, DB ó�� �� �ܺο��� �۾��� �ϴ� ���
 * 	����ġ ���� ������ �߻��� �� �����Ƿ� �ڹٿ����� �ݵ�� ����ó���� �ϵ��� �ϰ� �ִ�.
 */

public class ExceptionEx {
	String str = "";

	public void foo(int i) {
	 try {
		if(i ==1) {
			throw new Exception();
		}
		str += " 1 ";
	 }catch(Exception e) {
		 str += " 2 ";
		 return;
	 }finally {
		 str += " 3 ";
		 System.out.println("������ ����?");
	 }
	 str += " 4 ";
	}
	
	public static void main(String[] args) {
		ExceptionEx e = new ExceptionEx();
		e.foo(0);
		e.foo(1);
		System.out.println(e.str);
	}
}
//	public static void main(String[] args){
//		//runtime ���ܴ� ���� ó���� �ƴ϶� �ڵ� ������ ���� ��ƾ� �Ѵ�.
////		int[] arr = new int[1];
////		System.out.println(arr[1]);
////		
////		String str = null;
////		System.out.println(str.charAt(0));
//		
////		String str = "a";
////		Object member = str;
////		A m = (A)member;
//		
//		try {
////			���� �߻� ����
////			�����ڵ�1
////			�����ڵ�2
////			char c = (char)System.in.read();
////			�����ڵ�3    <- ������ ���ܰ� �߻��ϸ� ������� ����
////			
//		}catch(Exception e) {
////			���� ó�� ����
//		}finally {
//			//�ݵ�� �����ϴ� ����
//		}
//		
//	}
//
//}
