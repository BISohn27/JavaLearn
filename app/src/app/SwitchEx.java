package app;
/*
	switch ~ case
		switch (value) {
		case value1:
			statement1;
			break;
			
		case value2:
			statement2;
			break;
			
		case value3:
			statement3;
			break;
			.
			.
			.
		default:
			statement4;
			break;
		}
 */
public class SwitchEx {

	public static void main(String[] args) {
		int val = 2;
		switch(val) {
		case 1:
			System.out.println("실행구문1");
		case 2:
			System.out.println("실행구문2");
		case 3:
			System.out.println("실행구문3");
			break;
		default:
			System.out.println("기본");
		}
	}

}
