package bank;

public class BankAccountMain {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("이순신");
		
		System.out.println("=== 은행계좌테스트 ===");
		account.deposit(10000);
		account.withdrawl(3000);
		account.withdrawl(9000);
		
		System.out.println();
		System.out.println("===계좌 정보===");
		System.out.println("계좌번호: " + account.getBankAccountNumber());
		System.out.println("예금주: " + account.getName());
		System.out.println("잔액: " + account.getBalance() + "원");
	}
}
