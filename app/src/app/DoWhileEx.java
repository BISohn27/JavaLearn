package app;

import java.util.Scanner;

/*
	�ݺ���(do ~ while��)
	
	do{
		���౸��;
	}while(���ǽ�);
 */
public class DoWhileEx {

	public static void main(String[] args) {
		int num= new Scanner(System.in).nextInt();
		int cnt =1;
		do {
			System.out.println(num + " * " + cnt + " = " + (cnt++*num));
		}while(cnt<10);
		
		cnt = 1;
		num = 2;
		
		System.out.println();
	}
}
