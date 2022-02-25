package com.blz.stock;

public class Stock {
	// instance variables(declared inside class only)
	private String stockNames;
	private Double numberOfShare;
	private Double sharePrice;

	public Stock() {
		super();
	}

	// Parameterized constructor
	public Stock(String stockNames, Double numOfShare, Double sharePrice) {
		super();
		this.stockNames = stockNames;
		this.numberOfShare = numOfShare;
		this.sharePrice = sharePrice;
	}

	// Applying getters and setters
	public String getStockNames() {
		return stockNames;
	}

	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}

	public Double getNumOfShare() {
		return numberOfShare;
	}

	public void setNumOfShare(Double numOfShare) {
		this.numberOfShare = numOfShare;
	}

	public Double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(Double sharePrice) {
		this.sharePrice = sharePrice;
	}

}
