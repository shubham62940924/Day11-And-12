package StockAccountNew;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	static Scanner scanner = new Scanner(System.in);
	ArrayList<Stock> arrayList = new ArrayList<>();
	static double balance = 1000;

	public void addStock() {
		Stock stock;
		stock = new Stock();
		double withdraw = 0;

		System.out.println(" Enter the stock name");
		scanner.nextLine();
		stock.setStockNames(scanner.nextLine());

		System.out.println("Enter the Number of shares");
		stock.setNumOfShare(scanner.nextInt());

		System.out.println("Enter the each share price");
		stock.setSharePrice(scanner.nextDouble());
		withdraw = stock.getSharePrice() * stock.getNumOfShare();
		if (balance >= withdraw) {
			balance = balance - withdraw;
			arrayList.add(stock);
			System.out.println("Remaining balance = " + balance);
		} else
			debit(withdraw);
	}

	public void printStockReport() {
		Stock stock;
		stock = new Stock();
		for (int i = 0; i < arrayList.size(); i++) {
			stock = arrayList.get(i);
			System.out.println(stock.toString());

		}
	}

	public void debit(double withdraw) {
		if (withdraw > balance) {
			System.out.println("Debit amount exceeded account balance.");
			System.out.println("Remaining balance = " + balance);
			System.out.println("withdraw = " + withdraw);
		}

	}

	public static void main(String[] args) {
		Account stockManagement = new Account();
		while (true) {
			System.out.println("Enter the selection\n1)addStock\n2)displayStockReport\n3)exit");
			byte choice = scanner.nextByte();
			switch (choice) {
			case 1 -> stockManagement.addStock();
			case 2 -> stockManagement.printStockReport();
			case 3 -> System.exit(1);
			}
		}

	}

}
