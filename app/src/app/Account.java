package app;

public class Account {
	private long balance;
	public Account() {}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	// throws Exception -> ��� ���� Ŭ������ ���� throw�� ����
	// throws BalanceInsufficientException -> �ش� ���� Ŭ������ ���� throw�� ����
	public void withdraw(int money) throws Exception {
		if(balance<money) {
			throw new BalanceInsufficientException(money+"�� ��� �Ұ�(�ܰ���� : " + (money-balance) + "�� ����)"); 
		}
		balance -= money;
	}
}
