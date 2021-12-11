package com.icici.loans.eduloans;

public class MethodOverLoading 
{
	public void m1(int x)
	{
		System.out.println(x);
	
	}
	public void m1(float x)
	{
		System.out.println(x);
		
	}
	public void m1(String x)
	{
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		MethodOverLoading obj = new MethodOverLoading();
		obj.m1(100);
		obj.m1(12.34f);
		obj.m1("jaanu");
	}
	

}
