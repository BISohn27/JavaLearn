package app;

import java.util.Scanner;
/*
	���� ���
	if(���ǽ� 1){
		���� ���� 1;
	}else if(���ǹ� 2){
		���� ���� 2;
	}else{
	}
	.
	.
	.
 */

public class If2Ex {

	public static void main(String[] args) {
		System.out.println("������ �Է��Ͻÿ� : ");
		
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
