package bank;

import java.util.Random;



public class BankAccount {
	private String bankAccountNumber;
	private String name;
	private double balance;
	
	
	Random rand = new Random();
	
	private int[][] chunks = new int[3][3];
	
	
	
	public BankAccount(String name){
		this.bankAccountNumber = accountNumberGenerator();
		this.balance = 0;
		this.name = name;
	}
	public BankAccount(String name, double balance) {
		this.bankAccountNumber = accountNumberGenerator();
		this.balance = balance;
		this.name = name;
	}
	
	
	
	
	
	
	public void withdrawl(double money) {
		if(this.balance < money) {
			System.out.println("잔액이 부족합니다. 현재 잔액: " + this.balance + "원");
		}else {
			this.balance -= money;
			System.out.println(money + "원이 출금되었습니다. 현재 잔액: " + this.balance + "원");
		}
	}
	public void deposit(double money) {
		this.balance += money;
		System.out.println(money + "원이 입금되었습니다. 현재 잔액: " + this.balance + "원");
	}
	
	
	
	
	
	public String getBankAccountNumber() {
		return this.bankAccountNumber;
	}
	public String getName() {
		return this.name;
	}
	public double getBalance() {
		return this.balance;
	}
	
	
	
	
	public String accountNumberGenerator() {
		
		String account = " ";
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				this.chunks[i][j] = rand.nextInt(10);
			}
		}
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				account += String.valueOf(this.chunks[i][j]);
			}
			if(i != 2) {
				account += "-";
			}
		}
		
		
		
		return account;
	}
	
	
	
	
}
