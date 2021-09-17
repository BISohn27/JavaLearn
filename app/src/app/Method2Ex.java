package app;

public class Method2Ex {

	static void sum(int a, int b) {
		int total = 0;
		for (int i =a; i<=b; i++)
			total += i;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		sum(3,4);
	}

}
