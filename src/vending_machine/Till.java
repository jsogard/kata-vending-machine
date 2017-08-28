package vending_machine;

public class Till {
	
	int[] moneyCount;
	
	public Till(){
		moneyCount = new int[Money.values().length];
	}
	
	public int getCount(Money money){
		int i = 0;
		for(Money moneyType : Money.values()){
			if(money == moneyType)
				return moneyCount[i];
			i++;
		}
		return -1;
	}

	public void deposit(Money money) {
		// TODO Auto-generated method stub
		
	}

	public double getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
