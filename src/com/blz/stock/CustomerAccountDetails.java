package com.blz.stock;

public interface CustomerAccountDetails {
	/*
	 * Declare interface use in abstraction This methods in an interface are
	 * declared with an empty body and are public and all fields are public, static
	 * and final by default.
	 */

	public void stockAccount(String stock_name, int stock_nos, double stock_val); // create a new account from file

	public double valueOf(); // total value of account dollars

	public void buy(int amount, double value, String symbol); // add shares of stock to account

	public void sell(int amount, double value, String symbol); // subtract shares of stock from account

	public void save(String filename); // save account to file

	public void printreport(); // print a detailed report of stocks and values
}
