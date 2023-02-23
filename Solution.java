package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		Bank b1=new BankImpl(10000);

		while(true) {
			System.out.println("1:deposit 2:withdraw 3:check balance 4:Exit");
			System.out.print("Enter your choice: ");
			int choice=ip.nextInt();
			switch(choice) {
			case 1:
				int damt=ip.nextInt();
				b1.deposit(damt);
				break;
			case 2:
				int wamt=ip.nextInt();
				b1.withdraw(wamt);
				break;
			case 3:
				System.out.println("Available balance is: "+b1.getbalance());
				break;
			case 4:
				System.out.println("Thank You....!");
				System.exit(0);
				
				default:
					try {
					throw new InvalidChoiceException("invalid choice");
					}
					catch(InvalidChoiceException e) {
						System.out.println(e.getmsg());
					}
			}
			System.out.println("===============");
		}

	}
}
