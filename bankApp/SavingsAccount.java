package com.graymatter.bankApp;

public class SavingsAccount extends Account {
	private double balance;
	
	
	
	public SavingsAccount() {
		super();
	}
	
	

	public SavingsAccount(String accNo, String accHolderName, int pin, String bankName, String ifscCode,
			double balance) {
		super(accNo, accHolderName, pin, bankName, ifscCode);
		this.balance = balance;
	}



	//@Override
   public void withdraw(double amount) {
	   if(amount>balance)
		   System.out.println("Insufficient Balance");
	   else {
		   balance=balance-amount;
		   System.out.println("Successfully withdrawn "+amount);
	   }
		
	}
   
   public void getBalance()
   {
	   System.out.println(balance);
   }
}