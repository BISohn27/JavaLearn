package app;

public class Oper6Ex {

	public static void main(String[] args) {
		int su = 0;

		System.out.println(su++);
		System.out.println(su);
		
		int a = 0;
		System.out.println(a++ + a++);
		System.out.println(a + --a + ++a);
		System.out.println(--a + a++);
		System.out.println(a);
	}
}