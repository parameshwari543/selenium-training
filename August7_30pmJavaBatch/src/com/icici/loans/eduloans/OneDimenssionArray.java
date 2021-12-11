package com.icici.loans.eduloans;

import java.util.Scanner;

public class OneDimenssionArray
{
	
	public static void main(String[] args)
	{
		/*int j;
	  int[] a = {10,20,30,40};
	  
	  for(int j=0;ij<a.length;j++)
	  {
	  
	 System.out.println("a["+j+"]="+a[j]);
	 
	} */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int asize = sc.nextInt();
	  
	  
	  int[] a = new int[asize];
	  int sum =0;
	  System.out.println("Enter the Array Elements/objects:");
	  for(int i=0;i<a.length;i++)

	{
		  a[i] = sc.nextInt();
		  System.out.println("a["+i+"]="+a[i]);
		  sum = sum+a[i];
		  System.out.println("sum of the array is:"+sum);
		  }
	}
}

