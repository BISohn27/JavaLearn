package app;

import java.util.Scanner;

/*
	반복문(do ~ while문)
	
	do{
		실행구문;
	}while(조건식);
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
