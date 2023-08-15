package com.lumen.intherdemos;

public class Savings extends Account{

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance=balance-amount-120;
		System.out.println("amount withdrawn is:"+(balance));
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance = balance+amount+140;
		System.out.println("Amount deposited is: "+(balance));
	}

	
}
