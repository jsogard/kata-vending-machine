package vending_machine;

public enum Money {
	PENNY	(0.01),
	NICKEL	(0.05),
	DIME	(0.10),
	QUARTER	(0.25),
	DOLLAR	(1.00),
	FIVE	(5.00),
	TEN		(10.00),
	TWENTY	(20.00),
	HUNDRED	(100.00);
	
	private double value;
	
	private Money(double value){
		this.value = value;
	}
	
	public double getValue(){
		return value;
	}
}
