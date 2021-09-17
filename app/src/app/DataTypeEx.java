package app;

/*
	자료형(Data Type)
	-변수 또는 상수가 차지하는 메모리의 양(byte)과 종류를 의미한다.
	-자바의 자료형은 크게 기본 자료형과 참조형으로 나눌 수 있다.
	
		1) 기본형
			-boolean(true,false) : 8bit (1byte)
			-byte: 1byte
			-short: 2byte
			-char: 1byte (문자를 담는 자료형, 분류는 정수형)
			-int: 4byte
			-long: 8byte
			-float: 4byte
			-double: 8byte
			
		2) 참조형
			-클래스(class)
			-배열(array)
			-인터페이스(interface)
			-열거(enum)
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
