package com.graymatter.bankApp;

public class CurrentAccount extends Account{
	
	private double overDraftLimit;
	
	@Override
	public void withdraw(double amt)
	{
		if(amt>=overDraftLimit)
			overDraftLimit=	overDraftLimit - amt;
		else
			System.out.println("Insufficient balance");
	}

}
