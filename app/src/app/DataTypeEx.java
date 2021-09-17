package app;

/*
	�ڷ���(Data Type)
	-���� �Ǵ� ����� �����ϴ� �޸��� ��(byte)�� ������ �ǹ��Ѵ�.
	-�ڹ��� �ڷ����� ũ�� �⺻ �ڷ����� ���������� ���� �� �ִ�.
	
		1) �⺻��
			-boolean(true,false) : 8bit (1byte)
			-byte: 1byte
			-short: 2byte
			-char: 1byte (���ڸ� ��� �ڷ���, �з��� ������)
			-int: 4byte
			-long: 8byte
			-float: 4byte
			-double: 8byte
			
		2) ������
			-Ŭ����(class)
			-�迭(array)
			-�������̽�(interface)
			-����(enum)
 */

public class DataTypeEx {
	public static void main(String args[]) {
		boolean bool = true;
		System.out.println(bool);
		bool = false;
		System.out.println(bool);
		byte byte1 = 10;
		System.out.println(byte1);
		float float1 =1.1f;
		System.out.println(float1);
		double double1 = 1.1d;
		System.out.println(double1);
		char char1 = 'a';
		System.out.println(char1);
	}
}
