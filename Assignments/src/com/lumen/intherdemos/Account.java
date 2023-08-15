package com.lumen.intherdemos;

public class Account {
	double balance;
	public Account(double balance) {
		this.balance = balance;
	}

    void withdraw(double amount) {
    	System.out.println("Amount is withdrawn is: "+(balance-amount));
    }
    void deposit(double amount) {
    	System.out.println("Amount is deposited is: "+(balance+amount));
    }
    double getBalance(double amount) {
    	return balance;
    }

	

}
