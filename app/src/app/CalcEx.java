package app;

public class CalcEx {
	public int addition(int n1, int n2) {
		return n1 + n2;
	}
	
	public int substraction(int n1, int n2) {
		if(n1 > n2)
			return n1-n2;
		else
			return n2-n1;
	}
	
	public int multiplication(int n1, int n2) {
		return n1*n2;
	}
	
	public int division(int n1, int n2) {
		if(n2 ==0)
			return -1;
		else
			return n1/n2;
	}
	
	public void checkDivision(int num) {
		if(num == -1)
			System.out.println("0으로 나눌 수 없습니다.");
		else
			System.out.println(num);
	}
	
	public void result(char operator, int n1, int n2) {
		switch(operator) {
		case '+': System.out.println(addition(n1,n2)); break;
		case '-': System.out.println(substraction(n1,n2));break;
		case '*': System.out.println(multiplication(n1,n2));break;
		case '/': checkDivision(division(n1,n2));break;
		}
	}
	
	public static void main(String[] args) throws java.io.IOException{
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.print("operator [+,-,*,/] : ");
		char oper = (char)System.in.read();
		new CalcEx().result(oper, n1, n2);;
	}

}
