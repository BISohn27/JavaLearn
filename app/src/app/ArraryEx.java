package app;
/*
 * 		�迭(array)
 * 		- ���� �ڷ����� �����͸� ������ �����ϱ� ���� �޸� ������ ����.
 * 		- ������ �޸� ������ index�� �̿��Ͽ� �� �����Ҹ� ������.
 * 		- �迭 ũ��� length�� ����Ͽ� ����.
 * 
 * 		ǥ��)
 * 		int[] arr1 = new int[n];
 * 		int[] arr2 = {10,20};
 * 		int[] arr3 = new int{10,20};
 */

public class ArraryEx {

	public static void main(String[] args) {
		int[] a= new int[2];
		
		for(int i =0; i< a.length; i++) {
			a[i] = (i+1)*10;
			System.out.println(a[i]);
		}
		
		int[] b = new int[3];
		int[] c = {10,20};
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println();
		
		int dan[] = {3,7,9};
		
		for(int i = 0; i< dan.length; i++) {
			for(int j = 1; j< 10; j++)
				System.out.print(dan[i]+ "*" + j + " = " + dan[i]*j + " \t");
			System.out.println();
		}
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("����ϰ��� �ϴ� ������ ������ �Է��ϼ���.> ");
		int num = scanner.nextInt();
		int[] dan2 = new int[num];
		
		for(int i = 0; i< num; i++) {
			System.out.print(i+"��° ���ϴ� ��� ������ ���ڸ� �Է��ϼ���.> ");
			dan2[i] = scanner.nextInt();
		}
		
		for (int i = 0; i< dan2.length; i++) {
			for(int j = 1; j< 10; j++)
				System.out.print(dan[i]+ "*" + j + " = " + dan[i]*j + " \t");
			
			System.out.println();
		}
	}

}
