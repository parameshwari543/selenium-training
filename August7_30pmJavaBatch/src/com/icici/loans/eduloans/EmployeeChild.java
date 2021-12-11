package com.icici.loans.eduloans;

public class EmployeeChild extends Employee
{
	

	String city;
	
	public EmployeeChild(String city) 
	{
		super();
		this.city = city;
		System.out.println(this.city);
		
	}

	public static void main(String[] args)
	{
		EmployeeChild e = new EmployeeChild("hyderabad");
		
	}

}
