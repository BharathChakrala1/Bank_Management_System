package BankingSystem;

public class BankAccount{
	private int accountNum;
	private String name;
	private double balance, fdAmount;

	public BankAccount(int accountNum, String name) {
		this.accountNum = accountNum;
		this.name  = name;
		this.balance = 0.0;
		this.fdAmount = 0.0;
	}
	public void deposite(double amount) {
		balance += amount;
		System.out.println("Deposited amount " + amount);
	}
	public void withdraw(double amount) {
		if(amount <= balance){
			balance -= amount;
			System.out.println("Withdrawal amount " + amount);
		}else {
			System.out.println("Insufficient balance");
		}
	}
	public void createFD(double amount) {
		if(amount <= balance) {
			balance -= amount;
			fdAmount += amount;
			System.out.println("FD of amount " + amount + " created successfully");
		}else {
			System.out.println("Insufficient balance");
		}
	}
	
	public double getAvailableBalance() {
		return balance;
	}
	public int getAccountNo() {
		return accountNum;
	}
	public String getName() {
		return name;
	}
	public double getFdAmount() {
		return fdAmount;
	}
}