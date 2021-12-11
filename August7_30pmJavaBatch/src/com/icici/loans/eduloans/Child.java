package com.icici.loans.eduloans;

import com.icici.loans.carloans.ChildClass;

class Parent
{
	public  void workhard()
	{
		System.out.println("wakeup early,go to college");
	}
	
	public void care()
	{
		System.out.println("atmost care....");
	}
}

public class Child extends parent

{
	
	public void love()
	{
		System.out.println("iam in love.....");
	}
	
   public static void main(String[] args) 
   {
	    	     ChildClass c = new ChildClass();
	            c.workhard();
	            c.care();
	             c.love();
	    	     
	    	     
	     
	
}
}
