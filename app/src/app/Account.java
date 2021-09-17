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
	// throws Exception -> 모든 예외 클래스에 대한 throw가 가능
	// throws BalanceInsufficientException -> 해당 예외 클래스에 대한 throw만 가능
	public void withdraw(int money) throws Exception {
		if(balance<money) {
			throw new BalanceInsufficientException(money+"원 출금 불가(잔고부족 : " + (money-balance) + "원 부족)"); 
		}
		balance -= money;
	}
}
