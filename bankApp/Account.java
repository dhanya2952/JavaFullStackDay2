package com.graymatter.bankApp;

public class Account {
	
	protected String accNo;
	protected String AccHolderName;
	protected String bankName;
	protected String ifscCode;
	protected int pin;
	
	Account() {
		super();
	}
	
	Account(String accNo, String accHolderName, String bankName, String ifscCode, int pin) {
		super();
		this.accNo = accNo;
		AccHolderName = accHolderName;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", AccHolderName=" + AccHolderName + ", bankName=" + bankName + ", ifscCode="
				+ ifscCode + ", pin=" + pin + "]";
	}
	public void changePin(int curPin,int newPin)
	{
		if(this.pin==curPin)
			this.pin=newPin;
		else
			System.out.println("pin not matching");
	}
	
	public void withdraw(double amt)
	{
		System.out.println("amount withdrawn successfully");
	}
//make account related properties as prototected

}
