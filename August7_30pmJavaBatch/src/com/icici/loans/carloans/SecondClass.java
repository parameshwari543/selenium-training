package com.icici.loans.carloans;

import java.io.FileInputStream;

public class SecondClass
{
	//data properties
	int a=10,b=20,result;
	
	//behaviours
	public void add()
	{
		result = a+b;
		System.out.println("Add of A&B is:"+result);
	}
	public void sub()
	{
		result = a-b;
		System.out.println("sub of A&B is:"+result);
	}
public static void main(String[] args) 
{
	System.out.println("Hello...");
	
	int x=100;
	String name="kaarunya";
	
	SecondClass obj= new SecondClass();
	obj.add();
	obj.sub();
	SecondClass obj1=new SecondClass();
	obj1.add();
	obj1.sub();
}
}
