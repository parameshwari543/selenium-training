package com.icici.hdfc.loans;

public class C extends A
{
	public void m3()
	{
		System.out.println("iam m3 in C");
		
	}
	public static void main(String[] args)
	{

     B b =new B();
     
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		
		
	}

}
