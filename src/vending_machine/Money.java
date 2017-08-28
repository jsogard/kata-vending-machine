package vending_machine;

public enum Money {
	PENNY,
	NICKEL,
	DIME,
	QUARTER,
	DOLLAR,
	HUNDRED;
	
	public double getAmount(){
		switch(this){
		case PENNY:
			return 0.01;
		case NICKEL:
			return 0.05;
		case DIME:
			return 0.10;
		case QUARTER:
			return 0.25;
		case DOLLAR:
			return 1.00;
		case HUNDRED:
			return 100.00;
		}
		return 0;
	}
}
