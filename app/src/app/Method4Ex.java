package app;

public class Method4Ex {

	static void method(int ... num) {
		for(int i:num){
			System.out.println(i);
		}
		
		for(int i=0; i< num.length; i++) {
			System.out.println(num[i]);
		}
	}
	
	public static void main(String[] args) {

	}

}
