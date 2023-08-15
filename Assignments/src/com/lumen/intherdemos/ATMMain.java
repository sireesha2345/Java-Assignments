package com.lumen.intherdemos;

import java.util.Scanner;

public class ATMMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = scanner.nextDouble();
		double amount = scanner.nextDouble();
		
		Account account = new Savings(balance);
		System.out.println("Enter type Savings or Curent account");
		String Type = scanner.next();
		System.out.println("Enter amount to withdraw or deposit");
		
		String amountType = scanner.next();
		Account account1 = new Current(amount);
		if(Type.equals("savings")) {
			if(amountType.equals("withdraw")) {
				account.withdraw(amount);
			}
			else {
				account.deposit(amount);
			}
		}
		else {
			if(amountType.equals("withdraw")) {
				account1.withdraw(amount);
			}
			else {
				account1.deposit(amount);
			}
		}
		System.out.println(account.getBalance(amount));
		scanner.close();
		
	}
	}


