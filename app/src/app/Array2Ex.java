package app;

public class Array2Ex {

	public static void main(String[] args) {
		
		//������ ���հ� ���
		int[] score = {83,90,87};
		int total=0;
		System.out.print("������ �� ���� ");
		
		for(int i = 0; i<score.length; i++)
			total += score[i];
		
		System.out.println(total);
		
		System.out.println("������ ����� "+ (double)total/score.length);
		
		System.out.println();
		
		//�迭���� ¦�� ã��
		int num[] = {3,6,4,7,10};
		
		for(int i = 0; i< num.length; i++)
			if(num[i]%2 == 0)
				System.out.println(num[i]);
		
		System.out.println();
		
		//n�� ������ ������ ���� ��� �迭�� ����
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("���ϴ� ������ ������ �Է��ϼ���.> ");
		int count = scanner.nextInt();
		
		int[] num2 = new int[count];
		int[] result = new int[count];
		
		for(int i=0; i< count; i++) {
			System.out.print((i+1)+"��° ������ ���ڸ� �Է��ϼ���.> ");
			num2[i] = scanner.nextInt();
		}
			
		for(int i = 0; i< result.length; i++) {
			for(int j=1; j<10; j++)
				result[i] += num2[i]*j;
			System.out.println(num2[i] +"���� ���� " + result[i]);
		}
	}

}
