package vending_machine;

public enum Product {

	COLA	(1.00),
	CHIPS	(0.50),
	CANDY	(0.65);
	
	private double price;
	
	private Product(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
}
