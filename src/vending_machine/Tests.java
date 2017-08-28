package vending_machine;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
public class Tests {

	private VendingMachine vendingMachine;
	
	@Before
	public void instantiateDefaults(){
		vendingMachine = new VendingMachine();
	}
	
	@Test
	public void acceptValidMoney(){
		for(Money moneyType : Money.values()){
			
		}
	}
	
	@Test
	public void initialDisplay(){
		Assert.assertEquals("INSERT COIN", vendingMachine.checkDisplay());
	}
	
	@Test
	public void insertChange(){
		double currentChange = 0, expectedChange;
		String expectedDisplay;
		for(Money money : Money.values()){
			expectedChange = currentChange;
			if(VendingMachine.isAccepted(money))
				expectedChange += money.getAmount();
			expectedDisplay = String.format("$%.2f", expectedChange);	
			
			Assert.assertEquals(expectedChange, vendingMachine.getChangeAmount());
			Assert.assertEquals(expectedDisplay, vendingMachine.checkDisplay());
		}
	}
	
	@Test
	public void rejectsInReturn(){
		
	}
	
	
}
