package com.blz.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {

	ArrayList<String> stockName = new ArrayList<String>();
	ArrayList<Integer> numberOfShares = new ArrayList<Integer>();
	ArrayList<Integer> sharePrice = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();

		StockAccount obj = new StockAccount();
		while (true) {
			System.out.println("1-Enter new stock \n2-Display Stock Report  \n3-Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				obj.addStocks();
			}
				break;
			case 2: {
				obj.stockReport();
			}
				break;

			case 3: {
				System.out.println("Good By");
				System.exit(0);
			}
			default:
				System.out.println("Invalid Input");
			}
		}
	}

	private void addStocks() {// To Add Stocks

		System.out.print("Enter the stock name: ");
		stockName.add(sc.next());

		System.out.print("Enter number of shares present: ");
		numberOfShares.add(sc.nextInt());

		System.out.print("Enter price of each share: ");
		sharePrice.add(sc.nextInt());

	}

	private void stockReport() { // Stock Report
		int sum = 0;
		System.out.println("STOCK REPORT");
		for (int i = 0; i < stockName.size(); i++) {
			int total = (numberOfShares.get(i) * sharePrice.get(i));
			sum = sum + total;
			System.out.println("Stock name= " + stockName.get(i) + "\nValue of each share= " + sharePrice.get(i)
					+ "\nTotal value of share= " + total);
			System.out.println(" ");

		}
	}

}
