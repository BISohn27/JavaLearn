package app;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		//�����ϱ�
		account.deposit(1000);
		System.out.println("���ݾ� : " + account.getBalance());
		
		try {
		account.withdraw(1001);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
