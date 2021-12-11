package com.icici.loans.carloans;

public class HDFC implements Rbi
{

	@Override
	public void withdrawl() {
		System.out.println("iam overridden withdrawl in HDFC");
		
	}

	@Override
	public void deposite() {
		System.out.println("iam overridden deposite in HDFC");
		
	}
	public void m1()
	{
		System.out.println("iam m1 method in HDFC...");
	}
	public static void main(String[] args) {
		HDFC h =new HDFC();
		h.deposite();
		h.withdrawl();
		h.m1();
	}

}
