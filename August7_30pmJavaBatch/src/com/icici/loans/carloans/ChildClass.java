package com.icici.loans.carloans;

public class ChildClass extends FirstAbstract 
{
	public static void main(String[] args) 
	{
		ChildClass c = new ChildClass();
		c.m1();
		c.m2();
		
	}
	public Object workhard;

	public void m1()
	{
		System.out.println("iam m1 overridden from ChildClass");
	}
	@Override
	public void m2()
	{
		System.out.println("iam m2 overridden in ChildClass...");
		
	}
	public void workhard() {
		// TODO Auto-generated method stub
		
	}
	public void care() {
		// TODO Auto-generated method stub
		
	}
	public void love() {
		// TODO Auto-generated method stub
		
	}

}
