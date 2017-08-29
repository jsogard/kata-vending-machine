package vending_machine;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class VendingMachine {

	private static final Money[] UNACCEPTABLE = {Money.PENNY, Money.HUNDRED};
	
	private String display;
	private Till till;
	private Till coinReturn;
	private Till change;
	
	public VendingMachine(){
		display = "INSERT COIN";
		till = new Till();
		coinReturn = new Till();
		change = new Till();
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

	public String checkDisplay() {
		return display;
	}

	public static boolean isAccepted(Money money) {
		return !Arrays.asList(UNACCEPTABLE).contains(money);
	}

	public double getChangeValue() {
		return change.getTotal();
	}

	public Map<Money, Integer> emptyCoinReturn() {
		return coinReturn.empty();
	}
}
