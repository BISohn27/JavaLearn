package app;

/*
	논리 연산자
	|
	&
	||
	&&
	형식) boolean result = 조건식1 | 조건식2;
 */
public class Oper4Ex {
	public static void main(String[] args) {
		boolean result = 3>5|| 5<3;
		System.out.println(result);
		
		result = 3>5 | 5<3;
		System.out.println(result);
		
		int sum = 0;
		boolean a =true;
		
		result = a || 10 > (sum = 3+5);
		System.out.println(result);
		System.out.println(sum);
		
		result = a | 10 > (sum = 3+5);
		System.out.println(result);
		System.out.println(sum);
		
	}
}
