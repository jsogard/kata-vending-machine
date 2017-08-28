package vending_machine;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VendingMachine {

	private static final Money[] UNACCEPTABLE = {Money.PENNY, Money.HUNDRED};
	
	private String display;
	private Till till;
	private Till coinReturn;
	private Till change;
	
	public VendingMachine(){
		
	}

	public boolean insertMoney(Money money) {
		if(!isAccepted(money)){
			coinReturn.deposit(money);
			return false;
		}
		change.deposit(money);
		display = String.format("$%.2f", change.getTotal());
		return true;
	}

	public double getChange() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String checkDisplay() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean isAccepted(Money money) {
		return !Arrays.asList(UNACCEPTABLE).contains(money);
	}

	public double getChangeAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
