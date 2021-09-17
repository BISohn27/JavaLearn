package app;
/*
	제어문(조건문)
	if, else의 조건식에 따라 프로그램의 흐름을 변경한다.
	
		if(조건식){
			실행구문;
		}else{
			실행구문2;
		}
 */
public class IfEx {
	public static void main(String []args) {
		int num = 10;
		
		if(num==10) {
			System.out.println("True");
		}
		
		if(num<10) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
	}
}
