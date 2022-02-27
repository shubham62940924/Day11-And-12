package StockAccountNew;

public class Stock {
	private String stockNames;
	private int numOfShare;
	private double sharePrice;
	private double totalSharePrice;

	public String getStockNames() {
		return stockNames;
	}

	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}

	public int getNumOfShare() {
		return numOfShare;
	}

	public void setNumOfShare(int numOfShare) {
		this.numOfShare = numOfShare;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public double getTotalSharePrice() {
		return totalSharePrice;
	}

	public void setTotalSharePrice(double totalSharePrice) {
		this.totalSharePrice = totalSharePrice;
	}

	public String toString() {
		return "Stock{" + "stockNames='" + stockNames + '\'' + ", numOfShare=" + numOfShare + ", sharePrice="
				+ sharePrice + ", totalSharePrice=" + numOfShare * sharePrice + '}';
	}

	public Stock() {
		this.stockNames = stockNames;
		this.numOfShare = numOfShare;
		this.sharePrice = sharePrice;
		this.totalSharePrice = totalSharePrice;

	}

}
