package BankingSystem;

import java.util.Scanner;

public class BankCLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		BankManager manager = new BankManager();
		
		while(true) {
			System.out.println("\nWelcome to Simplebank CLI");
			System.out.println("1. Create account");
			System.out.println("2. Deposite account");
			System.out.println("3. Withdraw account");
			System.out.println("4. Check balance");
			System.out.println("5. Create FD amount");
			System.out.println("6. To Exit");
			System.out.print("Enter your choice: ");
			
			int choose = sc.nextInt();
			switch(choose) {
			case 1:
				sc.nextLine();
				System.out.print("Enter the name : ");
				String name = sc.nextLine();
				manager.createAccount(name);
				break;
			case 2:
				System.out.print("Enter account number: ");
				int accNoD = sc.nextInt();
				BankAccount accD = manager.getNewAccountNo(accNoD);
				if(accD != null) {
					System.out.print("Enter the Amount to be deposite: ");
					double amountD = sc.nextDouble();
					accD.deposite(amountD);
				}else {
					System.out.println("Account not found");
				}
				break;
			case 3:
				System.out.print("Enter account number: ");
				int accNoW = sc.nextInt();
				BankAccount accW = manager.getNewAccountNo(accNoW);
				if(accW != null) {
					System.out.print("Enter amount to be withdrawn: ");
					double amountW = sc.nextDouble();
					accW.withdraw(amountW);
				}else {
					System.out.println("Account not found");
				}
				break;
			case 4:
				System.out.print("Enter account number: ");
				int accNoFD = sc.nextInt();
				BankAccount accFD = manager.getNewAccountNo(accNoFD);
				if(accFD != null) {
					System.out.println("Avaliable balance : " + accFD.getAvailableBalance());
					System.out.println("Fixed Deposite balance : " + accFD.getFdAmount());
				}else {
					System.out.println("Account not found");
				}
				break;
			case 5:
				System.out.print("Enter account number: ");
				int createNewFD = sc.nextInt();
				BankAccount newFD = manager.getNewAccountNo(createNewFD);
				if(newFD != null) {
					System.out.print("Enter amount to be Fixed deposite : ");
					double FD = sc.nextDouble();
					newFD.createFD(FD);
				}else {
					System.out.println("Account not found");

				}
			case 6:
				System.out.println("Thank you for visiting Simplebank CLI. GoodBye!");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice.. Please try again");
			}
		}
	}
}
