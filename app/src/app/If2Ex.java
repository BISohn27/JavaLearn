package app;

import java.util.Scanner;
/*
	다중 제어문
	if(조건식 1){
		실행 구문 1;
	}else if(조건문 2){
		실행 구문 2;
	}else{
	}
	.
	.
	.
 */

public class If2Ex {

	public static void main(String[] args) {
		System.out.println("점수를 입력하시오 : ");
		
		int score = 0;
		score = new Scanner(System.in).nextInt();
		if(score > 60 && score <= 80) {
			System.out.println("B");
		}else if(score > 80 && score <=100) {
			System.out.println("A");
		}else {
			System.out.println("C");
		}
	}

}
