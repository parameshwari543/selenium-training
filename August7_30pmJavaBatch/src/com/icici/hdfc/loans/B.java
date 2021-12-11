package com.icici.hdfc.loans;

import com.icici.loans.carloans.A;

public class B extends A  //IS-A relationship
{
	public void m2()
	{
		System.out.println("iam m2 in B");
		
	}
	public static void main(String[] args)
	{
		
	A a =new A(); //HAS-A relationship
	a.m1();
	B b = new B();
	b.m1();
	b.m2();
	
	}
}
