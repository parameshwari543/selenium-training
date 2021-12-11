package com.icici.loans.eduloans;

public class Employee 
{
	int eno;
	String ename;
	float sal;

	

	public Employee()
	{
		System.out.println("iam default constructor....");
	}
	
	
	{
		this();
		this.eno =eno;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	public Employee(int eno,String ename,float sal)

	{
		this(eno,ename)
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		
		 System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	
	public static void main(String[] args)
	{
		Employee e4 = new Employee(1745,"sal",12.34f);
	}
	
		
		public Employee(int eno2, String ename2)
		{
		// TODO Auto-generated constructor stub
	}


		
	}
