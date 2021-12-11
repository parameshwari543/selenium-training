package com.icici.loans.carloans;

public class VariableTypes 
{
	private static final String VariableType = null;
	//primitive type variable
	int x =100;//instance (or)instance global(or)non static
	static String cname="vmware";
	private static VariableTypes obj;
	public void m1()
	{
		int y=200;//local variable
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
	}
	    public static void m2() 
	    {
		}
	    
	{
		VariableTypes obj = new VariableTypes();//reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	public static void main(String[] args)
	{
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
		
	}

}
