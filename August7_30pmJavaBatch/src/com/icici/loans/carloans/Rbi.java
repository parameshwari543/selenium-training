package com.icici.loans.carloans;

public interface Rbi 
{
	int x=100;
	public void withdrawl();
	public void deposite();
	
	public static void main(String[] args) 
	{
		//Rbi i =new Rbi();
		Rbi i;
		i=new ICICI();
		i.deposite();
		i.withdrawl();
		
		i=new HDFC();
		i.deposite();
		i.withdrawl();
		
		
		
	}

}
