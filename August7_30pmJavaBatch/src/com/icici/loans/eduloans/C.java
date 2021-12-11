package com.icici.loans.eduloans;

import com.icici.loans.carloans.A;

public class C extends A
{
	public void m3()
	{
		System.out.println("iam m3 in C");
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		
		C c =new C();
		c.m1();
		c.m3();
		
	}
	

}
