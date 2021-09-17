package app;

public class Method3Ex {

	static void method(int dan1, int dan2) {
		 for(int j = 1; j < 10; j++){
			 for(int i = dan1; i<=dan2; i++){
				System.out.print(i + " X " + j +"=" + i*j + " \t");
			}
			 System.out.println();
		}
	}
	
	static void method2(int[] arr) {
		for(int j =1; j<10; j++) {
		//	for(int i= 0; i< arr.length; i++) {
		//		System.out.print(arr[i] + " X " + j +"=" + arr[i]*j + " \t");
			for(int a: arr) {
				System.out.print(a + " X " + j +"=" + a*j + " \t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		method(num1, num2);
		
		System.out.println();
		
		int[] a = {2,5,7,3};
		
		method2(a);
	}

}
