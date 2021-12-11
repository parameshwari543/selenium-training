package com.icici.loans.carloans;

public class ICICI implements Rbi
{

	@Override
	public void withdrawl() {
	System.out.println("iam overridden withdrawl in ICICI");
		
	}

	@Override
	public void deposite() {
	System.out.println("iam overridden deposite in ICICI");
		
	}
	public static void main(String[] args) {
		ICICI i=new ICICI();
		i.deposite();
		i.withdrawl();
	}

}
