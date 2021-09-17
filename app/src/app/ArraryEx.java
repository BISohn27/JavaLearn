package app;
/*
 * 		배열(array)
 * 		- 같은 자료형의 데이터를 여러개 저장하기 위한 메모리 공간을 말함.
 * 		- 생성된 메모리 공간에 index를 이용하여 각 기억장소를 구분함.
 * 		- 배열 크기는 length를 사용하여 구함.
 * 
 * 		표현)
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
		
		System.out.print("출력하고자 하는 구구단 개수를 입력하세요.> ");
		int num = scanner.nextInt();
		int[] dan2 = new int[num];
		
		for(int i = 0; i< num; i++) {
			System.out.print(i+"번째 원하는 출력 구구단 숫자를 입력하세요.> ");
			dan2[i] = scanner.nextInt();
		}
		
		for (int i = 0; i< dan2.length; i++) {
			for(int j = 1; j< 10; j++)
				System.out.print(dan[i]+ "*" + j + " = " + dan[i]*j + " \t");
			
			System.out.println();
		}
	}

}
