package vending_machine;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(JUnit4.class)
public class Tests {

	private VendingMachine vendingMachine;
	
	@Before
	public void instantiateDefaults(){
		vendingMachine = new VendingMachine();
	}
	
	@Test
	public void initialDisplay(){
		Assert.assertEquals("INSERT COIN", vendingMachine.checkDisplay());
	}
	
	@Test
	public void rejectsInReturn(){
		for(Money moneyType: Money.values()){
			if(VendingMachine.isAccepted(moneyType)){
				Assert.assertTrue(vendingMachine.insertMoney(moneyType));
				Assert.assertEquals(0, (int)vendingMachine.emptyCoinReturn().get(moneyType));
			}
			else{
				Assert.assertFalse(vendingMachine.insertMoney(moneyType));
				Assert.assertEquals(1, (int)vendingMachine.emptyCoinReturn().get(moneyType));
			}
		}
	}
	
	@Test
	public void insertCoinsProperValue(){
		double initChange = vendingMachine.getChangeValue(), delta = 0;
		for(Money moneyType : Money.values()){
			vendingMachine.insertMoney(moneyType);
			if(VendingMachine.isAccepted(moneyType))
				delta += moneyType.getValue();
		}
		Assert.assertEquals(initChange + delta, vendingMachine.getChangeValue(), 0.009);
		
	}
	
	@Test
	public void insertCoinsProperDisplay(){
		double initChange = vendingMachine.getChangeValue(), delta = 0;
		for(Money moneyType : Money.values()){
			vendingMachine.insertMoney(moneyType);
			if(VendingMachine.isAccepted(moneyType))
				delta += moneyType.getValue();
		}
		Assert.assertEquals(String.format("$%.2f", initChange + delta), vendingMachine.checkDisplay());
		
	}
	
	
}
