package app;

import java.io.IOException;


public class Switch2Ex {
	public static void main(String []args) throws IOException{
		System.out.println("Yes/No(Y,N) ?");
		char c = (char)System.in.read(); //문자만 받을 수 있는 입력 장치
		switch(c) {
			case 'y':
			case 'Y':
				System.out.println("Yes");
				break;
			
			case 'n':
			case 'N':
				System.out.println("No");
				break;
				
			default:
				System.out.println("Wrong answer");
		}
	}
}
