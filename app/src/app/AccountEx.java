package app;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(1000);
		System.out.println("예금액 : " + account.getBalance());
		
		try {
		account.withdraw(1001);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
