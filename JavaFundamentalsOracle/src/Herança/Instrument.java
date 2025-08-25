package Herança;

public class Instrument {

	private boolean onSale;
	private double price;
	private int numInStock;
	
	public double applyEmloyeeDiscount() {
		double discount = 0;
		discount = price * 0.75;
		return discount;
	}//applyEmloyyeDiscount

	//getters e setters
	public boolean isOnSale() {
		return onSale;
	}
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}
	public double getPrice() {
		if(isOnSale()) {
			return price * 0.85;
		}//if
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumInStock() {
		return numInStock;
	}
	public void setNumInStock(int numInStock) {
		this.numInStock = numInStock;
	}
	//getters e setters
	
	
}//class
