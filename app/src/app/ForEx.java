package app;
/*
	�ݺ���(for��)
	
	for( ���� ����(�ʱ�ȭ); ���ǽ�; ���� Ȥ�� ���� ����){
		���� ����;
	}
 */
public class ForEx {

	public static void main(String[] args) {
		for(int i = 2; i< 10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+ " X " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		int even = 0;
		int odd = 0;
		for(int i =1; i<=100; i++) {
			if(i%2 == 0) {
				even += i;
				System.out.println(i + " , " + even);
			}
		}
		
		System.out.println();
		
		for(int i =1; i<=100; i++) {
			if(i%2 == 1) {
				odd+=i;
				System.out.println(i + " , " + odd);
			}
		}
	}

}
