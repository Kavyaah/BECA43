package com;

public class BankImpl implements Bank {
int balance;
public BankImpl(int balance) {
	this.balance =balance;
}
@Override
public void deposit(int amt) {
	System.out.println("deposited amt is: "+amt);
	balance=balance+amt;
	System.out.println("deposited susccesfully");
}
@Override
public void withdraw(int amt) {
	if(amt<balance) {
		System.out.println("withrdraw amt is: "+amt);
		balance=balance-amt;
		System.out.println("withrdraw succesfully");
	}
	else {
		try {
			throw new InsufficientBalanceException("insufficient balance");
		}
		catch(InsufficientBalanceException e) {
		System.out.println(e.getmsg());
		}
		
	}
}
@Override
	public int getbalance() {
		return balance;
	}
}

