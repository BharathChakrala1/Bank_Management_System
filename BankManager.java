package BankingSystem;

import java.util.HashMap;

public class BankManager {
	private HashMap<Integer, BankAccount> accounts = new HashMap<>();
	private int newAccountNum = 100;
	public BankAccount createAccount(String name) {
	BankAccount account = new BankAccount(newAccountNum, name);
	accounts.put(newAccountNum, account);
	System.out.println("Account created successfully \nYour Account number is : " + newAccountNum);
	newAccountNum++;
	return account;
	}
	public BankAccount getNewAccountNo(int accountNo) {
		return accounts.get(accountNo);
	}
}
