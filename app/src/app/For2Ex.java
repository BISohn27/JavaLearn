package app;
/*
	for( ���� ����(�ʱ�ȭ); ���ǽ�; ���� Ȥ�� ���� ����){
		���౸��1;
		for(���� ����(�ʱ�ȭ); ���ǽ�; ���� Ȥ�� ���� ����){
			���౸��2;
		}
		���౸��3;
	}
 */
public class For2Ex {

	public static void main(String[] args) {
		for(int i = 2; i< 10; i++) {
			System.out.println(i+"��");
			for(int j =1; j<10; j++) {
				System.out.print(j*i + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 2; i< 10; i++)
			System.out.print(i+"��\t");
		
		System.out.println();
		
		for(int i = 1; i<10; i++) {
			for(int j = 2; j<10; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i< 6; i++) {
			for(int j = 0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 5; i>0; i--) {
			for(int j= 0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i< 6; i++) {
			for(int j= i; j < 5; j++)
				System.out.print(" ");
			
			System.out.print("*");
			for(int j = 0; j<i-1; j++)
				System.out.print(" ");
			for(int j = 0; j<i-1; j++)
				System.out.print(" ");
			System.out.print("*");
			
			System.out.println();
		}
		
		for(int i = 1; i< 6; i++) {
			for(int j=1; j< i; j++)
				System.out.print(" ");
			System.out.print("*");
			for(int j = 5; j>i; j--)
				System.out.print(" ");
			for(int j = 5; j>i; j--)
				System.out.print(" ");
			System.out.print("*");
	
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i< 6; i++) {
			for(int j= i; j < 5; j++)
				System.out.print(" ");
			for(int j = 0; j<i; j++)
				System.out.print("*");
			for(int j = 0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i = 1; i< 6; i++) {
			for(int j=1; j< i; j++)
				System.out.print(" ");
			for(int j= i; j < 6; j++)
				System.out.print("*");
			for(int j = 0; j<6-i; j++)
				System.out.print("*");
			System.out.println();
		}

	}
}
