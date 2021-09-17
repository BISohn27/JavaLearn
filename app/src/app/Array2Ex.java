package app;

public class Array2Ex {

	public static void main(String[] args) {
		
		//점수의 총합과 평균
		int[] score = {83,90,87};
		int total=0;
		System.out.print("점수의 총 합은 ");
		
		for(int i = 0; i<score.length; i++)
			total += score[i];
		
		System.out.println(total);
		
		System.out.println("점수의 평균은 "+ (double)total/score.length);
		
		System.out.println();
		
		//배열에서 짝수 찾기
		int num[] = {3,6,4,7,10};
		
		for(int i = 0; i< num.length; i++)
			if(num[i]%2 == 0)
				System.out.println(num[i]);
		
		System.out.println();
		
		//n개 각각의 구구단 합을 결과 배열에 저장
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("원하는 구구단 개수를 입력하세요.> ");
		int count = scanner.nextInt();
		
		int[] num2 = new int[count];
		int[] result = new int[count];
		
		for(int i=0; i< count; i++) {
			System.out.print((i+1)+"번째 구구단 숫자를 입력하세요.> ");
			num2[i] = scanner.nextInt();
		}
			
		for(int i = 0; i< result.length; i++) {
			for(int j=1; j<10; j++)
				result[i] += num2[i]*j;
			System.out.println(num2[i] +"단의 합은 " + result[i]);
		}
	}

}
