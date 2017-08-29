package vending_machine;

import java.util.HashMap;
import java.util.Map;

public class Till {
	
	private Map<Money, Integer> ledger;
	private double total;
	
	public Till(){
		total = 0;
		ledger = new HashMap<Money, Integer>();
		for(Money moneyType: Money.values())
			ledger.put(moneyType, 0);
	}
	
	public int getCount(Money money){
		return ledger.get(money);
	}

	public void deposit(Money money, int count) {
		total += money.getValue() * count;
		ledger.replace(money, getCount(money) + count);
	}
	
	public void deposit(Money money){
		deposit(money, 1);
	}

	public double getTotal() {
		return total;
	}
	
	public Map<Money, Integer> empty(){
		Map<Money, Integer> ledger = new HashMap<Money, Integer>(this.ledger);
		for(Money moneyType : Money.values())
			this.ledger.replace(moneyType, 0);
		total = 0;
		return ledger;
	}

}
