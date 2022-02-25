package com.blz.practice;

import java.util.Scanner;

public class BankAccount {
	static Scanner scanner = new Scanner(System.in);

	// These are different for each account
	private double balance;
	private int accountNumber;
	// This is shared by all accounts, so it's static
	private static int lastAccountNumber = 0;

	// This is a constructor: no return type (void, boolean etc) and has the same
	// name as the class.
	public BankAccount(double intialBalance) {
		balance = intialBalance;

		accountNumber = lastAccountNumber + 1;
		lastAccountNumber = accountNumber;
	}

	public void debit(double balance) {
		System.out.println("enter ammount to withdraw");
		double withdraw = scanner.nextDouble();
		if (withdraw > balance)
			System.out.println("withdraw exceeds the balance please enter correct ammount");
		else
			balance = balance - withdraw;
		System.out.println("Remaining balance is " + balance);

	}

	public void deposit(double depositAmount) {
		balance += depositAmount;
	}

	public boolean withdraw(double withdrawAmount) {
		if (withdrawAmount > balance) {
			System.out.println("Insufficient Funds!!!");
			return false;
		} else {
			balance -= withdrawAmount;
			return true;
		}
	}

	public int getNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		System.out.println("Enter the balance to mention in the account");
		BankAccount account = new BankAccount(scanner.nextDouble());
		account.debit(account.balance);
	}
}
